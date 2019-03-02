SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_zhichuguanli
-- ----------------------------
DROP TABLE IF EXISTS `t_zhichuguanli`;
CREATE TABLE `t_zhichuguanli`
(
  `id`          int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `year`        varchar(255) DEFAULT NULL COMMENT '年份',
  `month`       varchar(255) DEFAULT NULL COMMENT '月份',
  `type`        varchar(255) DEFAULT NULL COMMENT '支付类型',
  `money`       varchar(255) DEFAULT NULL COMMENT '支出账单',
  `remark`      varchar(255) DEFAULT NULL COMMENT '备注',
  `create_time` datetime     DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '新增时间',
  `update_time` datetime     DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE = InnoDB
  AUTO_INCREMENT = 2
  DEFAULT CHARSET = utf8mb4;

DROP TABLE IF EXISTS `t_mealsday`;
CREATE TABLE `t_mealsday`
(
  `id`          int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `breakfast`        varchar(255) DEFAULT NULL COMMENT '第一餐',
  `bf_money`       varchar(255) DEFAULT NULL COMMENT '支出1',
  `lunch`        varchar(255) DEFAULT NULL COMMENT '第二餐',
  `l_money`       varchar(255) DEFAULT NULL COMMENT '支出2',
  `dinner`        varchar(255) DEFAULT NULL COMMENT '第三餐',
  `d_money`       varchar(255) DEFAULT NULL COMMENT '支出3',
  `party`        varchar(255) DEFAULT NULL COMMENT '聚会',
  `p_money`       varchar(255) DEFAULT NULL COMMENT '支出4',
  `relax`        varchar(255) DEFAULT NULL COMMENT '零食',
  `r_money`       varchar(255) DEFAULT NULL COMMENT '支出5',
  `remark`      varchar(255) DEFAULT NULL COMMENT '备注',
  `my_day` datetime     DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '记录日',
  `create_time` datetime     DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '新增时间',
  `update_time` datetime     DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE = InnoDB
  AUTO_INCREMENT = 2
  DEFAULT CHARSET = utf8mb4;