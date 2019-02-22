SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_zhichuguanli
-- ----------------------------
DROP TABLE IF EXISTS `t_zhichuguanli`;
CREATE TABLE `t_zhichuguanli` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `year` varchar(255) DEFAULT NULL COMMENT '年份',
  `month` varchar(255) DEFAULT NULL COMMENT '月份',
  `type` varchar(255) DEFAULT NULL COMMENT '支付类型',
  `money` varchar(255) DEFAULT NULL COMMENT '支出账单',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  `create_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '新增时间',
  `update_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;