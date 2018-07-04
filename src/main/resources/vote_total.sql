/*
Navicat MySQL Data Transfer

Source Server         : 中心db
Source Server Version : 50635
Source Host           : 192.168.254.111:3306
Source Database       : stock

Target Server Type    : MYSQL
Target Server Version : 50635
File Encoding         : 65001

Date: 2018-07-04 19:51:27
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for vote_total
-- ----------------------------
DROP TABLE IF EXISTS `vote_total`;
CREATE TABLE `vote_total` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `inst_id` varchar(6) DEFAULT NULL COMMENT '股票代码',
  `proposal` varchar(10) DEFAULT NULL COMMENT '股东大会议案',
  `investor_account_id` varchar(10) DEFAULT NULL COMMENT '股东代码卡号',
  `preference` varchar(16) DEFAULT NULL COMMENT '表决意见1同意2反对3弃权',
  `amount` int(11) DEFAULT NULL COMMENT '股份数量',
  `investor_name` varchar(50) DEFAULT NULL COMMENT '股东名称',
  `multiple_card` varchar(50) DEFAULT NULL COMMENT '一人多卡号',
  `remark` varchar(50) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COMMENT='7.股东大会投票统计结果';

-- ----------------------------
-- Records of vote_total
-- ----------------------------
INSERT INTO `vote_total` VALUES ('1', '603030', '1         ', 'A100968461', '2         ', '300', '姓名                                                ', '否        ', null);
INSERT INTO `vote_total` VALUES ('2', '603030', '2         ', 'A100968461', '2         ', '300', '姓名                                                ', '否        ', null);
INSERT INTO `vote_total` VALUES ('3', '603030', '3', 'A100968478', null, null, null, null, null);
INSERT INTO `vote_total` VALUES ('4', '603030', '4', 'A100968461', null, null, null, null, null);
INSERT INTO `vote_total` VALUES ('5', null, null, null, null, null, null, null, null);
INSERT INTO `vote_total` VALUES ('6', null, null, null, null, null, null, null, null);
