layui.define(['layer'], function (exports) {
    var $ = layui.jquery,
        layer = layui.layer;
    var neptune = {
        openTopWindow: function (title, url, w, h) {
            if (title == null || title == '') {
                title = false;
            }
            if (url == null || url == '') {
                url = "/neptune/error";
            }
            if (w == null || w == '') {
                w = ($(window).width() * 0.6);
            }
            if (h == null || h == '') {
                h = ($(window).height() * 0.8);
            }
            layer.open({
                type: 2,
                area: [w + 'px', h + 'px'],
                fix: false, //不固定
                maxmin: true,
                shadeClose: true,
                shade: 0.4,
                title: title,
                content: url
            });
        },
        update: function (sysUrl, obj, moudle) {
            if (obj.event === 'del') {
                layer.confirm('是否删除该条信息', function (index) {
                    $.post(sysUrl + '/remove/' + eval('obj.data.id'), function (data) {
                        if ("0" == data.code) {
                            obj.del();
                            layer.close(index);
                            layer.msg(data.msg, {icon: 6});
                        } else {
                            layer.msg(data.msg, {icon: 5});
                        }
                    });
                });
            } else if (obj.event === 'edit') {
                neptune.openTopWindow('修改信息', sysUrl + '/edit/' + eval('obj.data.id'));
            }
        },
        save: function (sysUrl, type, data) {
            $.post(sysUrl + '/' + type, data, function (r) {
                if (r.code === 0) {
                    var index = parent.layer.getFrameIndex(window.name);//获取当前弹出层的层级
                    window.parent.location.reload();//刷新父页面
                    obj.update(data);
                } else {
                    layer.alert(r.msg, {icon: 6});
                }
            });
        },
        dateFilter: function (date) {
            if (date < 10) {
                return "0" + date;
            }
            return date;
        },
        getLangDate: function () {
            var dateObj = new Date(); //表示当前系统时间的Date对象
            var year = dateObj.getFullYear(); //当前系统时间的完整年份值
            var month = dateObj.getMonth() + 1; //当前系统时间的月份值
            var date = dateObj.getDate(); //当前系统时间的月份中的日
            var day = dateObj.getDay(); //当前系统时间中的星期值
            var weeks = ["星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六"];
            var week = weeks[day]; //根据星期值，从数组中获取对应的星期字符串
            var hour = dateObj.getHours(); //当前系统时间的小时值
            var minute = dateObj.getMinutes(); //当前系统时间的分钟值
            var second = dateObj.getSeconds(); //当前系统时间的秒钟值
            var timeValue = "" + ((hour >= 12) ? (hour >= 18) ? "晚上" : "下午" : "上午"); //当前时间属于上午、晚上还是下午
            newDate = neptune.dateFilter(year) + "年" + neptune.dateFilter(month) + "月" + neptune.dateFilter(date) + "日 " + " " + neptune.dateFilter(hour) + ":" + neptune.dateFilter(minute) + ":" + neptune.dateFilter(second);
            document.getElementById("nowTime").innerHTML = timeValue + "好！ 欢迎您，当前时间为： " + newDate + "　" + week;
            setTimeout("getLangDate()", 1000);
        },
        getDateStr: function (value) {
            if (value === "" || value == undefined) {
                return "";
            }
            var date = new Date(value.toString().replace(new RegExp(/-/g), "/"));
            Y = date.getFullYear() + '-';
            M = (date.getMonth() + 1 < 10 ? '0' + (date.getMonth() + 1) : date.getMonth() + 1) + '-';
            D = neptune.dateFilter(date.getDate()) + ' ';
            return Y + M + D;
        },
        getPreMonthDate: function () {
            var arr = neptune.getDateStr(new Date()).split('-');
            var year = arr[0]; //获取当前日期的年份
            var month = arr[1]; //获取当前日期的月份
            var day = arr[2]; //获取当前日期的日
            var days = new Date(year, month, 0);
            days = days.getDate(); //获取当前日期中月的天数
            var year2 = year;
            var month2 = parseInt(month) - 1;
            if (month2 == 0) {
                year2 = parseInt(year2) - 1;
                month2 = 12;
            }
            var day2 = day;
            var days2 = new Date(year2, month2, 0);
            days2 = days2.getDate();
            if (day2 > days2) {
                day2 = days2;
            }
            if (month2 < 10) {
                month2 = '0' + month2;
            }
            var t2 = year2 + '年' + month2 + '月';
            return t2;
        }
    }
    exports('neptune', neptune);
});