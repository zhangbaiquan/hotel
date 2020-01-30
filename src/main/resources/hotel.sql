/*
 Navicat Premium Data Transfer

 Source Server         : apricots
 Source Server Type    : MySQL
 Source Server Version : 50717
 Source Host           : localhost:3306
 Source Schema         : hotel

 Target Server Type    : MySQL
 Target Server Version : 50717
 File Encoding         : 65001

 Date: 30/01/2020 15:10:09
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for changeroom
-- ----------------------------
DROP TABLE IF EXISTS `changeroom`;
CREATE TABLE `changeroom`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `customerid` int(11) NULL DEFAULT NULL COMMENT '顾客id 外键',
  `originalroom` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '原房间号',
  `changeroom` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '新更换房间',
  `changetime` datetime(0) NULL DEFAULT NULL COMMENT '换房时间',
  `reason` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '换房原因',
  `note` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '备注',
  `emplyeeId` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '操作人id',
  `ex1` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '换房还没退房1：换房退了房0',
  `ex2` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '预留字段2',
  `ex3` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '预留字段3',
  `ex4` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '预留字段4',
  `ex5` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '预留字段5',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 25 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of changeroom
-- ----------------------------
INSERT INTO `changeroom` VALUES (17, 59, 'B504', 'B505', '2018-04-25 09:49:08', '测试', '测试', '1050000100000002', '0', NULL, NULL, NULL, NULL);
INSERT INTO `changeroom` VALUES (18, 59, 'B505', 'B506', '2018-04-25 09:49:36', '无', '无', '1050000100000002', '0', NULL, NULL, NULL, NULL);
INSERT INTO `changeroom` VALUES (19, 53, 'B702', 'B703', '2018-04-25 09:50:45', '无', '无', '1050000100000002', '0', NULL, NULL, NULL, NULL);
INSERT INTO `changeroom` VALUES (20, 57, 'B407', 'B408', '2018-04-25 10:10:39', '无', '呜呜', '1050000100000002', '0', NULL, NULL, NULL, NULL);
INSERT INTO `changeroom` VALUES (21, 57, 'B408', 'B409', '2018-04-25 10:10:52', '无', '呜呜无', '1050000100000002', '0', NULL, NULL, NULL, NULL);
INSERT INTO `changeroom` VALUES (22, 62, 'B603', 'B604', '2018-04-30 11:26:05', '无', '', '1050000100000002', '0', NULL, NULL, NULL, NULL);
INSERT INTO `changeroom` VALUES (23, 59, 'B506', 'B507', '2018-04-30 11:28:12', '无', '', '1050000100000002', '0', NULL, NULL, NULL, NULL);
INSERT INTO `changeroom` VALUES (24, 71, 'B509', 'B409', '2018-05-01 14:59:53', 'wuwuuw', 'sdfgasdgafg', '1050000100000002', '1', NULL, NULL, NULL, NULL);

-- ----------------------------
-- Table structure for department
-- ----------------------------
DROP TABLE IF EXISTS `department`;
CREATE TABLE `department`  (
  `deptID` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `deptName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `parentId` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `company` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `Isdelete` int(1) NULL DEFAULT NULL,
  `EX1` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `EX2` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `EX3` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`deptID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of department
-- ----------------------------
INSERT INTO `department` VALUES ('105000010099', '总经理', NULL, '2511工作室', 0, NULL, '张百全', '1050000100000003');
INSERT INTO `department` VALUES ('105000010199', '管理部', NULL, '2511工作室', 0, NULL, '黄金山', '1050000100000002');
INSERT INTO `department` VALUES ('105000010399', '行政部', NULL, '2511工作室', 0, NULL, '唐幸', '1050000100000014');
INSERT INTO `department` VALUES ('105000010499', '前厅部', NULL, '2511工作室', 0, NULL, '张三', '1050000100000018');
INSERT INTO `department` VALUES ('105000010599', '客房部', NULL, '2511工作室', 0, NULL, '罗林辉', '1050000100000034');
INSERT INTO `department` VALUES ('105000010699', '餐饮部', NULL, '2511工作室', 0, NULL, '卫星', '1050000100000040');
INSERT INTO `department` VALUES ('105000010799', '娱乐部', NULL, '2511工作室', 0, NULL, '黄金山', '1050000100000042');
INSERT INTO `department` VALUES ('105000010899', '保安部', NULL, '2511工作室', 0, NULL, '唐幸', '1050000100000046');
INSERT INTO `department` VALUES ('105000011099', '人事部', NULL, '2511工作室', 0, NULL, 'apr', '1050000100000048');

-- ----------------------------
-- Table structure for employee
-- ----------------------------
DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee`  (
  `emplyeeId` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `usename` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `realname` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `phone` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `titleId` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `deptId` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `deptName` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `groupId` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `Isdelete` int(1) NULL DEFAULT NULL,
  `EX1` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `EX2` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `EX3` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`emplyeeId`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of employee
-- ----------------------------
INSERT INTO `employee` VALUES ('000001', 'admin', 'admin', '18883365888', '1', '105000010099', '总经理', '1', 0, 'admin', NULL, NULL);
INSERT INTO `employee` VALUES ('1050000100000002', '000002', '黄金山', '18883365888', '1', '105000010199', '管理部', '1', 0, '123456', '', '');
INSERT INTO `employee` VALUES ('1050000100000003', '000003', '张百全', '18883365888', '1,2', '105000010099', '总经理', '1', 0, '123456', '', '');
INSERT INTO `employee` VALUES ('1050000100000012', '000012', '罗林辉', '18883365888', '2', '105000010199', '管理部', '1', 0, '123456', '', '');
INSERT INTO `employee` VALUES ('1050000100000013', '000013', '唐幸', '18883365888', '2', '105000010399', '行政部', '1', 0, '123456', '', '');
INSERT INTO `employee` VALUES ('1050000100000014', '000014', '卫星', '18883365888', '2', '105000010399', '行政部', '1', 0, '123456', '', '');
INSERT INTO `employee` VALUES ('1050000100000015', '000015', '张三', '18883365888', '2', '105000010499', '前厅部', '1', 0, '123456', '', '');
INSERT INTO `employee` VALUES ('1050000100000016', '000016', '李四', '18883365888', '2', '105000010499', '前厅部', '1', 0, '123456', '', '');
INSERT INTO `employee` VALUES ('1050000100000018', '000018', '王五', '18883365888', '2', '105000010499', '前厅部', '1', 0, '123456', '', '');
INSERT INTO `employee` VALUES ('1050000100000034', '000034', '颜一', '18883365888', '3', '105000010599', '客房部', '1', 0, '123456', '', '');
INSERT INTO `employee` VALUES ('1050000100000037', '000037', '范二', '18883365888', '4', '105000010599', '客房部', '1', 0, '123456', '', '');
INSERT INTO `employee` VALUES ('1050000100000039', '000039', '罗林辉', '18883365888', '3', '105000010599', '客房部', '1', 0, '123456', '', '');
INSERT INTO `employee` VALUES ('1050000100000040', '000040', '卫星', '18883365888', '2', '105000010699', '餐饮部', '1', 0, '123456', '', '');
INSERT INTO `employee` VALUES ('1050000100000042', '000042', '黄金山', '18883365888', '2,3', '105000010799', '娱乐部', '1', 0, '123456', '', '');
INSERT INTO `employee` VALUES ('1050000100000046', '000046', '唐幸', '18883365888', '3', '105000010899', '保安部', '1', 0, '123456', '', '');
INSERT INTO `employee` VALUES ('1050000100000047', '000047', '李安', '18883365888', '4', '105000010899', '保安部', '1', 0, '123456', '', '');
INSERT INTO `employee` VALUES ('1050000100000048', '000048', 'Left', '18883365888', '2', '105000011099', '人事部', '1', 0, '123456', '', '');
INSERT INTO `employee` VALUES ('1050000100000050', '000050', 'apr', '18883365888', '3', '105000011099', '人事部', '1', 0, '123456', '', '');
INSERT INTO `employee` VALUES ('1050000100000051', '000051', 'apricots', '18883365888', '2', '105000011099', '人事部', '1', 0, '123456', '', '');

-- ----------------------------
-- Table structure for livein
-- ----------------------------
DROP TABLE IF EXISTS `livein`;
CREATE TABLE `livein`  (
  `customerid` int(255) NOT NULL AUTO_INCREMENT COMMENT '顾客主键id',
  `customernum` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '顾客编号，可用可不用',
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '顾客姓名',
  `gender` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '顾客性别',
  `certificatetype` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '证件类型',
  `roomnum` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '入住房间号',
  `checkintime` datetime(0) NULL DEFAULT NULL COMMENT '入住时间',
  `leavetime` datetime(0) NULL DEFAULT NULL COMMENT '离开时间',
  `days` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '入住天数',
  `deposit` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '押金',
  `certificatenum` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '证件号',
  `membertype` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '会员类型',
  `note` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  `ex1` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '删除标志：\r\n1为不删除，0为退房已删除',
  `ex2` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '手机号\r\n',
  `ex3` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '是否换过房',
  `ex4` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '预留字段4',
  `ex5` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '预留字段5',
  PRIMARY KEY (`customerid`) USING BTREE,
  INDEX `roomnum`(`roomnum`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 75 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of livein
-- ----------------------------
INSERT INTO `livein` VALUES (1, '', '黄金山', '男', '身份证', 'B201', '2018-04-08 23:55:22', NULL, NULL, '120', '412829199406016666', '普通会员', '有', '1', '18883365888', NULL, NULL, NULL);
INSERT INTO `livein` VALUES (11, NULL, '123', '男', '123', 'B205', '2018-04-14 23:11:12', '2018-04-15 09:47:19', NULL, '', '412829199406016666', '213', '123', '0', '18883365888', NULL, NULL, NULL);
INSERT INTO `livein` VALUES (12, NULL, '321321', '男', '123132', 'B206', '2018-04-18 23:57:23', NULL, NULL, '150', '412829199406016666', '123', '1323', '1', '18883365888', NULL, NULL, NULL);
INSERT INTO `livein` VALUES (13, NULL, '看看看看', '女', '身份证', 'B204', '2018-04-15 01:43:27', NULL, NULL, NULL, '412829199406016666', '7898998', '12132645465465456', '1', '18883365888', NULL, NULL, NULL);
INSERT INTO `livein` VALUES (14, NULL, 'DDD', '男', '身份证', 'B303', '2018-04-15 01:12:23', '2018-04-15 10:36:30', NULL, NULL, '412829199406016666', '会员', '无', '0', '18883365888', NULL, NULL, NULL);
INSERT INTO `livein` VALUES (20, NULL, '444', '女', '444', 'B606', '2018-04-15 03:29:38', '2018-04-25 09:46:56', NULL, NULL, '412829199406016666', '444', '444', '0', '18883365888', '换房', NULL, NULL);
INSERT INTO `livein` VALUES (21, NULL, 'zzz', '女', 'zzz', 'B404', '2018-04-15 10:25:07', '2018-04-20 18:00:41', NULL, NULL, '412829199406016666', 'zzz', 'zzz', '0', '18883365888', NULL, NULL, NULL);
INSERT INTO `livein` VALUES (22, NULL, 'qqq', '男', 'qqq', 'B601', '2018-04-15 10:28:21', NULL, NULL, NULL, '412829199406016666', 'qqq', 'qqq', '1', '18883365888', NULL, NULL, NULL);
INSERT INTO `livein` VALUES (23, NULL, 'qqq', '男', 'www', 'B509', '2018-04-15 10:28:35', '2018-04-15 10:28:40', NULL, NULL, '412829199406016666', 'www', 'www', '0', '18883365888', NULL, NULL, NULL);
INSERT INTO `livein` VALUES (24, NULL, 'ff', '男', 'fff', 'B309', '2018-04-15 10:30:02', '2018-04-15 10:30:06', NULL, NULL, '412829199406016666', 'ff', 'fff', '0', '18883365888', NULL, NULL, NULL);
INSERT INTO `livein` VALUES (25, NULL, 'ppp', '女', 'ppp', 'B309', '2018-04-15 10:30:29', '2018-04-15 10:30:34', NULL, NULL, '412829199406016666', 'pp', 'pp', '0', '18883365888', NULL, NULL, NULL);
INSERT INTO `livein` VALUES (26, NULL, 'rrr', '男', 'rrr', 'B407', '2018-04-15 10:32:41', '2018-04-15 10:34:45', NULL, NULL, '412829199406016666', 'rrr', 'rrrr', '0', '18883365888', NULL, NULL, NULL);
INSERT INTO `livein` VALUES (27, NULL, 'hhh', '男', 'hhh', 'B707', '2018-04-15 10:32:53', '2018-04-15 10:32:56', NULL, NULL, '412829199406016666', 'hhh', 'hhh', '0', '18883365888', NULL, NULL, NULL);
INSERT INTO `livein` VALUES (28, NULL, 'vvv', '男', 'vvv', 'B405', '2018-04-16 22:43:31', NULL, NULL, '120', '412829199406016666', 'vvv', 'vvvv', '0', '18883365888', NULL, NULL, NULL);
INSERT INTO `livein` VALUES (30, NULL, '323232', '女', '2332', 'B307', '2018-04-15 11:33:03', '2018-04-18 23:59:35', NULL, NULL, '412829199406016666', '23', '233223', '0', '18883365888', NULL, NULL, NULL);
INSERT INTO `livein` VALUES (31, NULL, '545', '男', '54', 'B507', '2018-04-15 11:33:12', '2018-04-15 11:33:16', NULL, NULL, '412829199406016666', '45', '54', '0', '18883365888', NULL, NULL, NULL);
INSERT INTO `livein` VALUES (32, NULL, '卫星', '男', '身份证', 'B708', '2018-04-15 19:56:27', '2018-04-15 19:56:36', NULL, NULL, '412829199406016666', 'SVIP', '点了一瓶水', '0', '18883365888', NULL, NULL, NULL);
INSERT INTO `livein` VALUES (33, NULL, 'tangxing', '男', '435435', 'B708', '2018-04-15 19:58:26', '2018-04-15 19:58:34', NULL, NULL, '412829199406016666', '3653563564', '564645546', '0', '18883365888', NULL, NULL, NULL);
INSERT INTO `livein` VALUES (37, NULL, '李明', '男', '321132321321', 'B704', '2018-04-15 20:07:10', '2018-04-15 20:07:48', NULL, NULL, '412829199406016666', '123', '132', '0', '18883365888', NULL, NULL, NULL);
INSERT INTO `livein` VALUES (38, NULL, '收到', '男', '的', 'B305', '2018-04-16 16:49:19', '2018-04-16 16:49:25', NULL, NULL, '412829199406016666', '收到', '多少', '0', '18883365888', NULL, NULL, NULL);
INSERT INTO `livein` VALUES (39, NULL, '786', '男', '7867', 'B506', '2018-04-16 16:53:46', '2018-04-20 18:00:43', NULL, NULL, '412829199406016666', '6786', '786786', '0', '18883365888', NULL, NULL, NULL);
INSERT INTO `livein` VALUES (40, NULL, 'Linux', '男', '护照', 'B302', '2018-04-28 11:10:42', NULL, NULL, '120', '412829199406016666', '普通会员', '', '1', '18883365888', NULL, NULL, NULL);
INSERT INTO `livein` VALUES (42, NULL, 'MYSQL', '男', '身份证', 'B403', '2018-04-17 22:33:08', '2018-04-19 00:00:25', NULL, '120', '412829199406016666', '普通会员', '无', '0', '18883365888', NULL, NULL, NULL);
INSERT INTO `livein` VALUES (48, NULL, '张百全', '女', '身份证', 'B609', '2018-04-17 01:19:59', '2018-04-25 09:44:28', NULL, '300', '412829199406016666', '铂金会员', '无', '0', '18883365888', '换房', NULL, NULL);
INSERT INTO `livein` VALUES (49, NULL, 'Java', '男', '身份证', 'B708', '2018-04-20 00:49:55', NULL, NULL, '500', '412829199406016666', '铂金会员', '无', '1', '18883365888', NULL, NULL, NULL);
INSERT INTO `livein` VALUES (50, NULL, 'K', '男', '身份证', 'B708', '2018-04-20 00:52:44', NULL, NULL, '560', '412829199406016666', '金卡会员', '', '1', '18883365888', NULL, NULL, NULL);
INSERT INTO `livein` VALUES (51, NULL, 'C', '女', '身份证', 'B602', '2018-04-20 00:55:14', NULL, NULL, '300', '412829199406016666', '普通会员', '', '1', '18883365888', NULL, NULL, NULL);
INSERT INTO `livein` VALUES (52, NULL, 'G', '女', '身份证', 'B409', '2018-04-20 01:05:29', NULL, NULL, '200', '412829199406016666', '普通会员', '', '1', '18883365888', '换房', NULL, NULL);
INSERT INTO `livein` VALUES (53, NULL, '701', '男', '身份证', 'B703', '2018-04-20 01:53:06', '2018-04-25 09:50:59', NULL, '200', '412829199406016666', '银卡会员', '', '0', '18883365888', '换房', NULL, NULL);
INSERT INTO `livein` VALUES (54, NULL, 'H', '女', '身份证', 'B209', '2018-04-20 02:03:05', '2018-04-20 02:05:38', NULL, '200', '412829199406016666', '银卡会员', '', '0', '18883365888', '换房', NULL, NULL);
INSERT INTO `livein` VALUES (55, NULL, 'V', '女', '身份证', 'B209', '2018-04-20 02:05:57', '2018-04-20 02:07:17', NULL, '200', '412829199406016666', '金卡会员', '', '0', '18883365888', '换房', NULL, NULL);
INSERT INTO `livein` VALUES (56, NULL, 'J', '女', '身份证', 'B209', '2018-04-20 02:07:31', '2018-04-20 02:08:35', NULL, '200', '412829199406016666', '普通会员', '', '0', '18883365888', '换房', NULL, NULL);
INSERT INTO `livein` VALUES (57, NULL, 'M', '女', '护照', 'B409', '2018-04-20 02:42:31', '2018-04-25 10:10:55', NULL, '', '412829199406016666', '普通会员', '', '0', '18883365888', '换房', NULL, NULL);
INSERT INTO `livein` VALUES (58, NULL, 'ZX', '男', '身份证', 'B503', '2018-04-23 08:39:05', '2018-04-25 12:34:31', NULL, '300', '412829199406016666', '普通会员', 'xxx', '0', '18883365888', '换房', NULL, NULL);
INSERT INTO `livein` VALUES (59, NULL, '2018', '男', '身份证', 'B507', '2018-04-28 11:05:25', '2018-04-25 12:35:23', NULL, '200', '412829199406016666', '金卡会员', '', '0', '18883365888', '换房', NULL, NULL);
INSERT INTO `livein` VALUES (60, NULL, 'C', '女', '贵宾卡', 'B408', '2018-04-28 09:58:27', NULL, NULL, '20', '412829199406016666', '金卡会员', 'wu', '1', '18883365888', NULL, NULL, NULL);
INSERT INTO `livein` VALUES (61, NULL, 'D', '女', '护照', 'B308', '2018-04-28 10:07:34', NULL, NULL, '120', '412829199406016666', '金卡会员', 's', '1', '18883365888', NULL, NULL, NULL);
INSERT INTO `livein` VALUES (62, NULL, '2018', '女', '护照', 'B604', '2018-04-28 11:14:12', NULL, NULL, '300.1', '412829199406016666', '银卡会员', '', '1', '18883365888', '换房', NULL, NULL);
INSERT INTO `livein` VALUES (63, NULL, 'F', '女', '贵宾卡', 'B402', '2018-04-28 11:14:54', NULL, NULL, '500.1', '412829199406016666', '铂金会员', '无', '1', '18883365888', NULL, NULL, NULL);
INSERT INTO `livein` VALUES (64, NULL, 'VV', '女', '身份证', 'B607', '2018-04-28 11:35:31', NULL, NULL, '', '412829199406016666', '银卡会员', '无', '1', '18883365888', NULL, NULL, NULL);
INSERT INTO `livein` VALUES (65, NULL, 'CC', '女', '护照', 'B607', '2018-04-30 21:02:25', NULL, NULL, '500', '412829199406016666', '金卡会员', '', '1', '18883365888', NULL, NULL, NULL);
INSERT INTO `livein` VALUES (66, NULL, 'G', '男', '身份证', 'B508', '2018-04-28 11:36:31', '2018-05-01 02:03:47', NULL, '', '412829199406016666', '银卡会员', '无', '0', '18883365888', NULL, NULL, NULL);
INSERT INTO `livein` VALUES (67, NULL, 'H', '女', '身份证', 'B708', '2018-04-28 17:33:12', NULL, NULL, '120', '412829199406016666', '铂金会员', '重庆市南岸区南山街道崇教路1号', '1', '18883365888', NULL, NULL, NULL);
INSERT INTO `livein` VALUES (68, NULL, '黄金山', '男', '护照', 'B406', '2018-04-30 00:38:12', NULL, NULL, '200', '412829199406016666', '普通会员', 'wu', '1', '18883365888', NULL, NULL, NULL);
INSERT INTO `livein` VALUES (69, NULL, '唐幸·', '男', '身份证', 'B503', '2018-04-30 11:12:48', '2018-05-01 02:48:47', NULL, '200', '412829199406016666', '铂金会员', '无', '0', '18883365888', NULL, NULL, NULL);
INSERT INTO `livein` VALUES (70, NULL, 'L', '女', '身份证', 'B505', '2018-05-01 13:33:16', NULL, NULL, '200', '412829199406016666', '银卡会员', '18000000000', '1', '18883365888', NULL, NULL, NULL);
INSERT INTO `livein` VALUES (71, NULL, 'G', '男', '身份证', 'B409', '2018-05-01 14:57:35', NULL, NULL, '200', '412829199406016666', '普通会员', 'dfsdfsd7457857', '1', '18883365888', '换房', NULL, NULL);
INSERT INTO `livein` VALUES (72, NULL, 'X', '女', '身份证', 'B208', '2018-05-01 16:10:42', NULL, NULL, '300', '412829199406016666', '银卡会员', '4556446565', '1', '18883365888', NULL, NULL, NULL);
INSERT INTO `livein` VALUES (73, NULL, 'D', '女', '身份证', 'B502', '2018-05-01 18:19:05', NULL, NULL, '200', '412829199406016666', '银卡会员', '18833652178', '1', '18883365888', NULL, NULL, NULL);
INSERT INTO `livein` VALUES (74, NULL, '胡梦坤', '男', '贵宾卡', 'B207', '2020-01-30 14:55:14', NULL, NULL, '200', '412829199406016666', '普通会员', '', '1', '18883365888', NULL, NULL, NULL);

-- ----------------------------
-- Table structure for m_functioncontrol
-- ----------------------------
DROP TABLE IF EXISTS `m_functioncontrol`;
CREATE TABLE `m_functioncontrol`  (
  `ID` varchar(12) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `PXID` int(11) NULL DEFAULT NULL,
  `NAME` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `URL` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `PID` varchar(12) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `IMAGE` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `PRI` int(11) NULL DEFAULT NULL,
  `ISLEAF` int(11) NULL DEFAULT NULL,
  `PARA` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `ACTIVATE` int(11) NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of m_functioncontrol
-- ----------------------------
INSERT INTO `m_functioncontrol` VALUES ('4ksbvSrbeOcy', 0, '客房管理', '', '0', NULL, NULL, NULL, NULL, 1);
INSERT INTO `m_functioncontrol` VALUES ('0gs6SJuFf4CQ', 1, '客人入住', '', '0', NULL, NULL, NULL, NULL, 1);
INSERT INTO `m_functioncontrol` VALUES ('JJhh4Cvbzla1', 3, '实时房态数据', 'roommanagement/realtime_room.action', '4ksbvSrbeOcy', NULL, NULL, NULL, NULL, 0);
INSERT INTO `m_functioncontrol` VALUES ('AsOSt2Z6XZID', 3, '客房预定', 'reservation/toreservation.action', '0gs6SJuFf4CQ', NULL, NULL, NULL, NULL, 1);
INSERT INTO `m_functioncontrol` VALUES ('RLVhdsIpHQ5W', 4, '预定管理查询', 'reservation/reservationlist.action', '0gs6SJuFf4CQ', NULL, NULL, NULL, NULL, 1);
INSERT INTO `m_functioncontrol` VALUES ('30UpylBmhkNF', 2, '实时房态列表', 'roommanagement/realtime_list.action', '4ksbvSrbeOcy', NULL, NULL, NULL, NULL, 1);
INSERT INTO `m_functioncontrol` VALUES ('nnWnwRekkbZh', 1, '入住登记', 'guestmanagement/livein.action', '0gs6SJuFf4CQ', NULL, NULL, NULL, NULL, 1);
INSERT INTO `m_functioncontrol` VALUES ('OZbp8bjFWRLE', 2, '入住登记查询', 'guestmanagement/liveinlist.action', '0gs6SJuFf4CQ', NULL, NULL, NULL, NULL, 1);
INSERT INTO `m_functioncontrol` VALUES ('Pk1LK3ut240W', 5, '换房', 'changeroom/changeroomadd.action', '0gs6SJuFf4CQ', NULL, NULL, NULL, NULL, 0);
INSERT INTO `m_functioncontrol` VALUES ('vXd70MHD6rKz', 6, '换房查询', 'changeroom/changeroomlist.action', '0gs6SJuFf4CQ', NULL, NULL, NULL, NULL, 1);
INSERT INTO `m_functioncontrol` VALUES ('1mb6vFAQndtF', 6, '系统设置', '', '0', NULL, NULL, NULL, NULL, 1);
INSERT INTO `m_functioncontrol` VALUES ('lkAezjHYX9r0', 1, '用户管理', 'user/list.action', '1mb6vFAQndtF', NULL, NULL, NULL, NULL, 1);
INSERT INTO `m_functioncontrol` VALUES ('2obIp8t4L5u3', 2, '部门管理', 'dept/list.action', '1mb6vFAQndtF', NULL, NULL, NULL, NULL, 1);
INSERT INTO `m_functioncontrol` VALUES ('ey5XM0RIxBFF', 4, '角色管理', 'group/list.action', '1mb6vFAQndtF', NULL, NULL, NULL, NULL, 1);
INSERT INTO `m_functioncontrol` VALUES ('4Dro6KwnGSxw', 5, '功能树管理', 'func/showIndex.action', '1mb6vFAQndtF', NULL, NULL, NULL, NULL, 1);
INSERT INTO `m_functioncontrol` VALUES ('E4NXrX5tPDHY', 1, '', 'defaultPage.action', '9Og8pAiSqX4o', NULL, NULL, NULL, NULL, 1);
INSERT INTO `m_functioncontrol` VALUES ('brPXIIQEHi4Z', NULL, '', 'defaultPage.action', '9Og8pAiSqX4o', NULL, NULL, NULL, NULL, 1);
INSERT INTO `m_functioncontrol` VALUES ('ouIB25v6IeIi', 3, '', 'defaultPage.action', '9Og8pAiSqX4o', NULL, NULL, NULL, NULL, 1);
INSERT INTO `m_functioncontrol` VALUES ('iDViQad5XuWV', 4, '', 'defaultPage.action', '9Og8pAiSqX4o', NULL, NULL, NULL, NULL, 1);
INSERT INTO `m_functioncontrol` VALUES ('gS6hlX3nKcLc', 5, '', 'defaultPage.action', '9Og8pAiSqX4o', NULL, NULL, NULL, NULL, 0);
INSERT INTO `m_functioncontrol` VALUES ('ViiTmg8C15h4', 6, '', 'defaultPage.action', '9Og8pAiSqX4o', NULL, NULL, NULL, NULL, 1);
INSERT INTO `m_functioncontrol` VALUES ('wBFUK0RzaeF0', 6, '', 'defaultPage.action', '9Og8pAiSqX4o', NULL, NULL, NULL, NULL, 1);
INSERT INTO `m_functioncontrol` VALUES ('aFNG9olO1fhF', 7, '', 'defaultPage.action', '9Og8pAiSqX4o', NULL, NULL, NULL, NULL, 0);
INSERT INTO `m_functioncontrol` VALUES ('96dd5HoovBau', 1, '', 'defaultPage.action', 'HDpoaLoYeX9g', NULL, NULL, NULL, NULL, 1);
INSERT INTO `m_functioncontrol` VALUES ('q9GvGyOjjgF6', 2, '', 'defaultPage.action', 'HDpoaLoYeX9g', NULL, NULL, NULL, NULL, 0);
INSERT INTO `m_functioncontrol` VALUES ('l2Wz2HxtVyHq', 1, '', 'energy/list.action', 'wp12tfNEDaya', NULL, NULL, NULL, NULL, 1);
INSERT INTO `m_functioncontrol` VALUES ('TJUV6TXzDChI', 1, '', 'defaultPage.action', 'KlFFKlRKi6Y3', NULL, NULL, NULL, NULL, 1);
INSERT INTO `m_functioncontrol` VALUES ('EKDKVOEZjdXt', 3, '', 'defaultPage.action', 'HDpoaLoYeX9g', NULL, NULL, NULL, NULL, 1);
INSERT INTO `m_functioncontrol` VALUES ('CqKustlbFDKO', 4, '', 'defaultPage.action', 'HDpoaLoYeX9g', NULL, NULL, NULL, NULL, 1);
INSERT INTO `m_functioncontrol` VALUES ('ONTmqDZTjMyF', 1, '', 'defaultPage.action', 'HDpoaLoYeX9g', NULL, NULL, NULL, NULL, 1);
INSERT INTO `m_functioncontrol` VALUES ('Nz44MjZ9bVn0', 8, '安全管理', '', '0', NULL, NULL, NULL, NULL, 1);
INSERT INTO `m_functioncontrol` VALUES ('AOf8bAZNDkL4', 1, '应急事件', 'security/emergencyevents.action', 'Nz44MjZ9bVn0', NULL, NULL, NULL, NULL, 1);
INSERT INTO `m_functioncontrol` VALUES ('Ha7NQZikx6AM', NULL, '', 'defaultPage.action', '9RMuz9KclOUI', NULL, NULL, NULL, NULL, 1);
INSERT INTO `m_functioncontrol` VALUES ('LJJyjRKbClfL', NULL, '', 'defaultPage.action', '9RMuz9KclOUI', NULL, NULL, NULL, NULL, 1);
INSERT INTO `m_functioncontrol` VALUES ('G3jkZpsm9gFW', NULL, '', 'defaultPage.action', '9RMuz9KclOUI', NULL, NULL, NULL, NULL, 1);
INSERT INTO `m_functioncontrol` VALUES ('iNYxPdc8pBEO', NULL, '', 'defaultPage.action', '9RMuz9KclOUI', NULL, NULL, NULL, NULL, 1);
INSERT INTO `m_functioncontrol` VALUES ('CLni69Lj1fp8', 2, '', 'defaultPage.action', 'KlFFKlRKi6Y3', NULL, NULL, NULL, NULL, 1);
INSERT INTO `m_functioncontrol` VALUES ('JEORMSxkx1uJ', 3, '', 'defaultPage.action', 'KlFFKlRKi6Y3', NULL, NULL, NULL, NULL, 1);
INSERT INTO `m_functioncontrol` VALUES ('cbYDvbK8KiCS', 1, '', 'defaultPage.action', 'HDpoaLoYeX9g', NULL, NULL, NULL, NULL, 1);
INSERT INTO `m_functioncontrol` VALUES ('SjO6LH344Ydh', 4, '新增房间', 'roommanagement/toroomadd.action', '4ksbvSrbeOcy', NULL, NULL, NULL, NULL, 1);
INSERT INTO `m_functioncontrol` VALUES ('X7rVXch0pVhG', 1, '实时房态图', 'roommanagement/realtime_data.action', '4ksbvSrbeOcy', NULL, NULL, NULL, NULL, 1);
INSERT INTO `m_functioncontrol` VALUES ('1cNqSjiOEIa6', NULL, '预定房态', 'roommanagement/reservation.action', '0gs6SJuFf4CQ', NULL, NULL, NULL, NULL, 1);
INSERT INTO `m_functioncontrol` VALUES ('jKY6TZ1SN3cD', 3, '留言板', 'msgboard/msgboard.action', 'Nz44MjZ9bVn0', NULL, NULL, NULL, NULL, 1);
INSERT INTO `m_functioncontrol` VALUES ('Tj59CSyoqsXl', 5, '更多功能', 'defaultPage.action', 'Nz44MjZ9bVn0', NULL, NULL, NULL, NULL, 1);
INSERT INTO `m_functioncontrol` VALUES ('AMvxGzUKRlZr', 2, '应急事件查询', 'security/emergencyeventslist.action', 'Nz44MjZ9bVn0', NULL, NULL, NULL, NULL, 1);
INSERT INTO `m_functioncontrol` VALUES ('yGRlXluLVbp8', 4, '留言板查询', 'msgboard/msgboardlist.action', 'Nz44MjZ9bVn0', NULL, NULL, NULL, NULL, 1);

-- ----------------------------
-- Table structure for m_sys_funcsecurity
-- ----------------------------
DROP TABLE IF EXISTS `m_sys_funcsecurity`;
CREATE TABLE `m_sys_funcsecurity`  (
  `FID` int(11) NOT NULL AUTO_INCREMENT,
  `MIS_USERID` int(50) NULL DEFAULT NULL,
  `FUNCTION_ID` varchar(12) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `lock` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`FID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 950 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of m_sys_funcsecurity
-- ----------------------------
INSERT INTO `m_sys_funcsecurity` VALUES (778, 2, '4ksbvSrbeOcy', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (779, 2, 'SjO6LH344Ydh', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (780, 2, 'X7rVXch0pVhG', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (781, 2, 'JJhh4Cvbzla1', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (782, 2, '30UpylBmhkNF', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (783, 2, '0gs6SJuFf4CQ', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (784, 2, 'OZbp8bjFWRLE', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (785, 2, 'AsOSt2Z6XZID', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (786, 2, 'RLVhdsIpHQ5W', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (787, 2, 'Pk1LK3ut240W', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (788, 2, 'vXd70MHD6rKz', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (789, 2, '1mb6vFAQndtF', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (790, 2, 'lkAezjHYX9r0', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (791, 2, '2obIp8t4L5u3', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (792, 2, 'ey5XM0RIxBFF', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (793, 2, 'Nz44MjZ9bVn0', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (794, 2, 'aSuaT3kxSN0a', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (795, 2, 'AOf8bAZNDkL4', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (796, 3, '4ksbvSrbeOcy', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (797, 3, 'X7rVXch0pVhG', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (798, 3, 'JJhh4Cvbzla1', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (799, 3, '30UpylBmhkNF', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (800, 3, '0gs6SJuFf4CQ', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (801, 3, 'AsOSt2Z6XZID', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (802, 3, 'RLVhdsIpHQ5W', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (803, 3, 'Pk1LK3ut240W', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (804, 3, 'vXd70MHD6rKz', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (805, 3, '1mb6vFAQndtF', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (806, 3, 'lkAezjHYX9r0', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (807, 3, 'Nz44MjZ9bVn0', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (808, 3, 'aSuaT3kxSN0a', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (809, 3, 'AOf8bAZNDkL4', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (831, 4, 'JJhh4Cvbzla1', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (832, 4, '30UpylBmhkNF', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (833, 4, '1cNqSjiOEIa6', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (834, 4, 'AsOSt2Z6XZID', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (835, 4, 'Nz44MjZ9bVn0', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (836, 4, 'aSuaT3kxSN0a', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (837, 4, 'AOf8bAZNDkL4', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (927, 1, '4ksbvSrbeOcy', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (928, 1, 'SjO6LH344Ydh', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (929, 1, 'X7rVXch0pVhG', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (930, 1, 'JJhh4Cvbzla1', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (931, 1, '30UpylBmhkNF', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (932, 1, '0gs6SJuFf4CQ', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (933, 1, '1cNqSjiOEIa6', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (934, 1, 'OZbp8bjFWRLE', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (935, 1, 'AsOSt2Z6XZID', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (936, 1, 'RLVhdsIpHQ5W', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (937, 1, 'Pk1LK3ut240W', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (938, 1, 'vXd70MHD6rKz', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (939, 1, '1mb6vFAQndtF', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (940, 1, 'lkAezjHYX9r0', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (941, 1, '2obIp8t4L5u3', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (942, 1, 'ey5XM0RIxBFF', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (943, 1, '4Dro6KwnGSxw', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (944, 1, 'Nz44MjZ9bVn0', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (945, 1, 'AOf8bAZNDkL4', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (946, 1, 'jKY6TZ1SN3cD', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (947, 1, 'Tj59CSyoqsXl', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (948, 1, 'AMvxGzUKRlZr', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (949, 1, 'yGRlXluLVbp8', 0);

-- ----------------------------
-- Table structure for msgboard
-- ----------------------------
DROP TABLE IF EXISTS `msgboard`;
CREATE TABLE `msgboard`  (
  `msgboardid` int(11) NOT NULL AUTO_INCREMENT,
  `msgboardname` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `msgboardtime` datetime(0) NULL DEFAULT NULL,
  `msgboardphone` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `ex1` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '内容',
  `ex2` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `ex3` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`msgboardid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of msgboard
-- ----------------------------
INSERT INTO `msgboard` VALUES (1, 'Z', '2018-05-01 00:53:50', '18883365888', 'sdgfsdfgfsdgg', NULL, NULL);
INSERT INTO `msgboard` VALUES (5, '对方公司', '2018-05-01 01:00:44', '18883365888', '', NULL, NULL);

-- ----------------------------
-- Table structure for reservation
-- ----------------------------
DROP TABLE IF EXISTS `reservation`;
CREATE TABLE `reservation`  (
  `reserveid` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `roomid` int(11) NULL DEFAULT NULL COMMENT '房间id',
  `roomnum` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '房间号',
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '预定人姓名',
  `gender` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '性别',
  `cardnum` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '身份证号',
  `phonenum` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '手机号',
  `reservationtime` datetime(0) NULL DEFAULT NULL COMMENT '预计到达时间',
  `reservetime` datetime(0) NULL DEFAULT NULL COMMENT '预定时间',
  `numofpeople` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '预定人数',
  `note` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  `ex1` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `ex2` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `ex3` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `ex4` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `ex5` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`reserveid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 29 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of reservation
-- ----------------------------
INSERT INTO `reservation` VALUES (6, 18, 'B309', '张百全', NULL, '412829199406016666', '18883365888', '2018-04-29 10:30:00', NULL, '1', '', '0', NULL, NULL, NULL, NULL);
INSERT INTO `reservation` VALUES (8, 36, 'B509', '张百全', NULL, '412829199406016666', '18883365888', '2018-04-28 16:15:00', NULL, '1', '', '0', NULL, NULL, NULL, NULL);
INSERT INTO `reservation` VALUES (10, 42, 'B606', '留言板', NULL, '412829199406016666', '18883365888', '2018-05-01 01:39:00', NULL, '2', '', '0', NULL, NULL, NULL, NULL);
INSERT INTO `reservation` VALUES (12, 29, 'B502', '留言板查询', NULL, '412829199406016666', '18883365888', '2018-05-01 01:52:00', NULL, '2', '', '0', NULL, NULL, NULL, NULL);
INSERT INTO `reservation` VALUES (13, 33, 'B506', '留言板查询', NULL, '412829199406016666', '18883365888', '2018-05-01 01:56:00', NULL, '2', '', '0', NULL, NULL, NULL, NULL);
INSERT INTO `reservation` VALUES (14, 36, 'B509', '45', NULL, '412829199406016666', '18883365888', '2018-05-01 02:08:00', NULL, '2', '', '0', NULL, NULL, NULL, NULL);
INSERT INTO `reservation` VALUES (15, 2, 'B202', '11', NULL, '412829199406016666', '18883365888', '2018-05-01 02:36:00', NULL, '2', '', '0', NULL, NULL, NULL, NULL);
INSERT INTO `reservation` VALUES (16, 5, 'B205', 'wu', NULL, '412829199406016666', '18883365888', '2018-05-01 02:39:00', NULL, '1', '', '0', NULL, NULL, NULL, NULL);
INSERT INTO `reservation` VALUES (17, 21, 'B403', 'S', NULL, '412829199406016666', '18883365888', '2018-05-01 13:42:00', NULL, '1', '', '0', NULL, NULL, NULL, NULL);
INSERT INTO `reservation` VALUES (18, 36, 'B509', 'ZZD', NULL, '412829199406016666', '18883365888', '2018-05-01 14:04:00', NULL, '3', '', '0', NULL, NULL, NULL, NULL);
INSERT INTO `reservation` VALUES (19, 36, 'B509', 'SSS', NULL, '412829199406016666', '18883365888', '2018-05-01 14:05:00', NULL, '2', '', '0', NULL, NULL, NULL, NULL);
INSERT INTO `reservation` VALUES (20, 36, 'B509', 'D', NULL, '412829199406016666', '18883365888', '2018-05-01 14:11:00', NULL, '1', '', '0', NULL, NULL, NULL, NULL);
INSERT INTO `reservation` VALUES (21, 36, 'B509', 'GG', NULL, '412829199406016666', '18883365888', '2018-05-01 14:19:00', NULL, '2', '', '0', NULL, NULL, NULL, NULL);
INSERT INTO `reservation` VALUES (22, 36, 'B509', 'D', NULL, '412829199406016666', '18883365888', '2018-05-01 15:01:00', NULL, '1', '', '0', NULL, NULL, NULL, NULL);
INSERT INTO `reservation` VALUES (23, 36, 'B509', 'F', NULL, '412829199406016666', '18883365888', '2018-05-01 15:05:00', NULL, '1', '', '0', NULL, NULL, NULL, NULL);
INSERT INTO `reservation` VALUES (24, 36, 'B509', 'S', NULL, '412829199406016666', '18883365888', '2018-05-01 15:11:00', NULL, '1', '', '0', NULL, NULL, NULL, NULL);
INSERT INTO `reservation` VALUES (25, 29, 'B502', 'Z', NULL, '412829199406016666', '18883365888', '2018-05-01 16:12:00', NULL, '1', '', '0', NULL, NULL, NULL, NULL);
INSERT INTO `reservation` VALUES (26, 29, 'B502', 'D', NULL, '412829199406016666', '18883365888', '2018-05-01 17:26:00', NULL, '2', '', '1', NULL, NULL, NULL, NULL);
INSERT INTO `reservation` VALUES (27, 31, 'B504', 'V', '女', '412829199406016666', '18883365888', '2018-05-01 18:27:00', NULL, '1', '', '0', NULL, NULL, NULL, NULL);
INSERT INTO `reservation` VALUES (28, 33, 'B506', 'A', '男', '412829199406016666', '18883365888', '2018-05-01 19:39:00', NULL, '1', '你好，预定B506房间！', '1', NULL, NULL, NULL, NULL);

-- ----------------------------
-- Table structure for room
-- ----------------------------
DROP TABLE IF EXISTS `room`;
CREATE TABLE `room`  (
  `roomid` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `roomnum` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '房间号',
  `customerid` int(11) NULL DEFAULT NULL COMMENT '顾客id',
  `reserveid` int(11) NULL DEFAULT NULL COMMENT '预定reserveid',
  `floor` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '房间楼层',
  `type` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '房间类型',
  `price` decimal(10, 2) NULL DEFAULT NULL COMMENT '房间价格',
  `state` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '房间状态',
  `isreservation` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '是否有预定',
  `reservationtime` datetime(0) NULL DEFAULT NULL COMMENT '预定时间',
  `arrive` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '到达时间',
  `deposit` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '押金',
  `instructions` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '房间说明',
  `ex1` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段1',
  `ex2` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '作为 ：reserveid',
  `ex3` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段3',
  `ex4` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段4',
  `ex5` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段5',
  PRIMARY KEY (`roomid`) USING BTREE,
  INDEX `roomnum`(`roomnum`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 55 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of room
-- ----------------------------
INSERT INTO `room` VALUES (1, 'B201', 1, NULL, '2楼', '标准单人间', 120.00, '已入住', '', NULL, NULL, NULL, '测试房间', '1', NULL, NULL, NULL, NULL);
INSERT INTO `room` VALUES (2, 'B202', 69, NULL, '2楼', '标准单人间', 120.00, '脏房', '', NULL, NULL, NULL, '测试房间', '1', NULL, NULL, NULL, NULL);
INSERT INTO `room` VALUES (3, 'B203', NULL, NULL, '2楼', '标准单人间', 120.00, '空净房', '', NULL, NULL, NULL, '测试房间', '1', NULL, NULL, NULL, NULL);
INSERT INTO `room` VALUES (4, 'B204', 13, NULL, '2楼', '标准单人间', 120.00, '已入住', '', NULL, NULL, NULL, '测试房间', '1', NULL, NULL, NULL, NULL);
INSERT INTO `room` VALUES (5, 'B205', 69, NULL, '2楼', '标准单人间', 120.00, '脏房', '', NULL, NULL, NULL, '测试房间', '1', NULL, NULL, NULL, NULL);
INSERT INTO `room` VALUES (6, 'B206', 12, NULL, '2楼', '标准单人间', 120.00, '已入住', '', NULL, NULL, NULL, '测试房间', '1', NULL, NULL, NULL, NULL);
INSERT INTO `room` VALUES (7, 'B207', 74, -1, '2楼', '标准单人间', 120.00, '已入住', '', NULL, NULL, NULL, '测试房间', '1', NULL, NULL, NULL, NULL);
INSERT INTO `room` VALUES (8, 'B208', 72, NULL, '2楼', '标准单人间', 120.00, '已入住', '', NULL, NULL, NULL, '测试房间', '1', NULL, NULL, NULL, NULL);
INSERT INTO `room` VALUES (9, 'B209', 56, NULL, '2楼', '标准单人间', 120.00, '空净房', '', NULL, NULL, NULL, '测试房间', '1', NULL, NULL, NULL, NULL);
INSERT INTO `room` VALUES (10, 'B301', NULL, NULL, '3楼', '标准单人间', 120.00, '空净房', '', NULL, NULL, NULL, '测试房间', '1', NULL, NULL, NULL, NULL);
INSERT INTO `room` VALUES (11, 'B302', 40, NULL, '3楼', '标准单人间', 120.00, '已入住', '', NULL, NULL, NULL, '测试房间', '1', NULL, NULL, NULL, NULL);
INSERT INTO `room` VALUES (12, 'B303', 14, NULL, '3楼', '标准单人间', 120.00, '脏房', '', NULL, NULL, NULL, '测试房间', '1', NULL, NULL, NULL, NULL);
INSERT INTO `room` VALUES (13, 'B304', NULL, NULL, '3楼', '标准单人间', 120.00, '空净房', '', NULL, NULL, NULL, '测试房间', '1', NULL, NULL, NULL, NULL);
INSERT INTO `room` VALUES (14, 'B305', 38, NULL, '3楼', '标准单人间', 120.00, '脏房', '', NULL, NULL, NULL, '测试房间', '1', NULL, NULL, NULL, NULL);
INSERT INTO `room` VALUES (15, 'B306', NULL, NULL, '3楼', '标准单人间', 120.00, '空净房', '', NULL, NULL, NULL, '测试房间', '1', NULL, NULL, NULL, NULL);
INSERT INTO `room` VALUES (16, 'B307', 30, NULL, '3楼', '标准单人间', 120.00, '脏房', '', NULL, NULL, NULL, '测试房间', '1', NULL, NULL, NULL, NULL);
INSERT INTO `room` VALUES (17, 'B308', 61, NULL, '3楼', '标准单人间', 120.00, '已入住', '', NULL, NULL, NULL, '测试房间', '1', NULL, NULL, NULL, NULL);
INSERT INTO `room` VALUES (18, 'B309', 66, NULL, '3楼', '标准单人间', 120.00, '脏房', '', NULL, NULL, NULL, '测试房间', '1', NULL, NULL, NULL, NULL);
INSERT INTO `room` VALUES (19, 'B401', NULL, NULL, '4楼', '标准双人间', 150.00, '空净房', '', NULL, NULL, NULL, '测试房间', '1', NULL, NULL, NULL, NULL);
INSERT INTO `room` VALUES (20, 'B402', 63, NULL, '4楼', '标准双人间', 150.00, '已入住', '', NULL, NULL, NULL, '测试房间', '1', NULL, NULL, NULL, NULL);
INSERT INTO `room` VALUES (21, 'B403', NULL, NULL, '4楼', '标准双人间', 150.00, '空净房', '', NULL, NULL, NULL, '测试房间', '1', NULL, NULL, NULL, NULL);
INSERT INTO `room` VALUES (22, 'B404', 21, NULL, '4楼', '标准双人间', 150.00, '空净房', '', NULL, NULL, NULL, '测试房间', '1', NULL, NULL, NULL, NULL);
INSERT INTO `room` VALUES (23, 'B405', 28, NULL, '4楼', '标准双人间', 150.00, '空净房', '', NULL, NULL, NULL, '测试房间', '1', '', NULL, NULL, NULL);
INSERT INTO `room` VALUES (24, 'B406', 68, NULL, '4楼', '标准双人间', 150.00, '已入住', '', NULL, NULL, NULL, '测试房间', '1', NULL, NULL, NULL, NULL);
INSERT INTO `room` VALUES (25, 'B407', 57, NULL, '4楼', '标准双人间', 150.00, '脏房', '', NULL, NULL, NULL, '测试房间', '1', NULL, NULL, NULL, NULL);
INSERT INTO `room` VALUES (26, 'B408', 60, NULL, '4楼', '标准双人间', 150.00, '已入住', '', NULL, NULL, NULL, '测试房间', '1', NULL, NULL, NULL, NULL);
INSERT INTO `room` VALUES (27, 'B409', 71, NULL, '4楼', '标准双人间', 150.00, '已入住', '', NULL, NULL, NULL, '测试房间', '1', NULL, NULL, NULL, NULL);
INSERT INTO `room` VALUES (28, 'B501', 58, NULL, '5楼', '标准双人间', 150.00, '脏房', '', NULL, NULL, NULL, '测试房间', '1', NULL, NULL, NULL, NULL);
INSERT INTO `room` VALUES (29, 'B502', 73, -1, '5楼', '标准双人间', 150.00, '已入住', '', NULL, NULL, NULL, '测试房间', '1', NULL, NULL, NULL, NULL);
INSERT INTO `room` VALUES (30, 'B503', 69, NULL, '5楼', '标准双人间', 150.00, '已入住', '', NULL, NULL, NULL, '测试房间', '1', NULL, NULL, NULL, NULL);
INSERT INTO `room` VALUES (31, 'B504', -1, -1, '5楼', '标准双人间', 150.00, '空净房', '', NULL, NULL, NULL, '测试房间', '1', NULL, NULL, NULL, NULL);
INSERT INTO `room` VALUES (32, 'B505', 70, NULL, '5楼', '标准双人间', 150.00, '已入住', '', NULL, NULL, NULL, '测试房间', '1', NULL, NULL, NULL, NULL);
INSERT INTO `room` VALUES (33, 'B506', 69, 28, '5楼', '标准双人间', 150.00, '已预定', '', NULL, NULL, NULL, '测试房间', '1', NULL, NULL, NULL, NULL);
INSERT INTO `room` VALUES (34, 'B507', 59, NULL, '5楼', '标准双人间', 150.00, '已入住', '', NULL, NULL, NULL, '测试房间', '1', NULL, NULL, NULL, NULL);
INSERT INTO `room` VALUES (35, 'B508', 66, NULL, '5楼', '标准双人间', 150.00, '已入住', '', NULL, NULL, NULL, '测试房间', '1', NULL, NULL, NULL, NULL);
INSERT INTO `room` VALUES (36, 'B509', -1, 24, '5楼', '标准双人间', 150.00, '空净房', '', NULL, NULL, NULL, '测试房间', '1', NULL, NULL, NULL, NULL);
INSERT INTO `room` VALUES (37, 'B601', 22, NULL, '6楼', '特惠大床房', 200.00, '已入住', '', NULL, NULL, NULL, '测试房间', '1', NULL, NULL, NULL, NULL);
INSERT INTO `room` VALUES (38, 'B602', 51, NULL, '6楼', '特惠大床房', 200.00, '空净房', '', NULL, NULL, NULL, '测试房间', '1', '', NULL, NULL, NULL);
INSERT INTO `room` VALUES (39, 'B603', 62, NULL, '6楼', '特惠大床房', 200.00, '脏房', '', NULL, NULL, NULL, '测试房间', '1', NULL, NULL, NULL, NULL);
INSERT INTO `room` VALUES (40, 'B604', 62, NULL, '6楼', '特惠大床房', 200.00, '已入住', '', NULL, NULL, NULL, '测试房间', '1', NULL, NULL, NULL, NULL);
INSERT INTO `room` VALUES (41, 'B605', 20, NULL, '6楼', '特惠大床房', 200.00, '空净房', '', NULL, NULL, NULL, '测试房间', '1', NULL, NULL, NULL, NULL);
INSERT INTO `room` VALUES (42, 'B606', 69, NULL, '6楼', '特惠大床房', 200.00, '脏房', '', NULL, NULL, NULL, '测试房间', '1', NULL, NULL, NULL, NULL);
INSERT INTO `room` VALUES (43, 'B607', 65, NULL, '6楼', '特惠大床房', 200.00, '已入住', '', NULL, NULL, NULL, '测试房间', '1', NULL, NULL, NULL, NULL);
INSERT INTO `room` VALUES (44, 'B608', 48, NULL, '6楼', '特惠大床房', 200.00, '空净房', '', NULL, NULL, NULL, '测试房间', '1', NULL, NULL, NULL, NULL);
INSERT INTO `room` VALUES (45, 'B609', 48, NULL, '6楼', '特惠大床房', 200.00, '脏房', '', NULL, NULL, NULL, '测试房间', '1', NULL, NULL, NULL, NULL);
INSERT INTO `room` VALUES (46, 'B701', NULL, NULL, '7楼', '豪华大床房', 200.00, '空净房', '', NULL, NULL, NULL, '测试房间', '1', NULL, NULL, NULL, NULL);
INSERT INTO `room` VALUES (47, 'B702', 53, NULL, '7楼', '豪华大床房', 200.00, '脏房', '', NULL, NULL, NULL, '测试房间', '1', NULL, NULL, NULL, NULL);
INSERT INTO `room` VALUES (48, 'B703', 53, NULL, '7楼', '豪华大床房', 200.00, '空净房', '', NULL, NULL, NULL, '测试房间', '1', NULL, NULL, NULL, NULL);
INSERT INTO `room` VALUES (49, 'B704', 37, NULL, '7楼', '豪华大床房', 200.00, '脏房', '', NULL, NULL, NULL, '测试房间', '1', NULL, NULL, NULL, NULL);
INSERT INTO `room` VALUES (50, 'B705', NULL, NULL, '7楼', '豪华大床房', 200.00, '空净房', '', NULL, NULL, NULL, '测试房间', '1', NULL, NULL, NULL, NULL);
INSERT INTO `room` VALUES (51, 'B706', 58, NULL, '7楼', '豪华大床房', 200.00, '脏房', '', NULL, NULL, NULL, '测试房间', '1', NULL, NULL, NULL, NULL);
INSERT INTO `room` VALUES (52, 'B707', NULL, NULL, '7楼', '豪华大床房', 200.00, '空净房', '', NULL, NULL, NULL, '测试房间', '1', NULL, NULL, NULL, NULL);
INSERT INTO `room` VALUES (53, 'B708', 67, NULL, '7楼', '豪华大床房', 200.00, '已入住', '', NULL, NULL, NULL, '测试房间', '1', '', NULL, NULL, NULL);
INSERT INTO `room` VALUES (54, 'B709', NULL, NULL, '7楼', '豪华大床房', 200.00, '空净房', '', NULL, NULL, NULL, '测试房间', '1', NULL, NULL, NULL, NULL);

-- ----------------------------
-- Table structure for roomstate
-- ----------------------------
DROP TABLE IF EXISTS `roomstate`;
CREATE TABLE `roomstate`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `roomstate` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `ex1` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `ex2` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `ex3` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of roomstate
-- ----------------------------
INSERT INTO `roomstate` VALUES (1, '空净房', NULL, NULL, NULL);
INSERT INTO `roomstate` VALUES (2, '已入住', NULL, NULL, NULL);
INSERT INTO `roomstate` VALUES (3, '脏房', NULL, NULL, NULL);
INSERT INTO `roomstate` VALUES (4, '已预定', NULL, NULL, NULL);

-- ----------------------------
-- Table structure for security
-- ----------------------------
DROP TABLE IF EXISTS `security`;
CREATE TABLE `security`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `type` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `time` datetime(0) NULL DEFAULT NULL,
  `note` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `ex1` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `ex2` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `ex3` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 12 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of security
-- ----------------------------
INSERT INTO `security` VALUES (7, '453', '应急事件', '2018-04-30 20:09:00', '', NULL, NULL, NULL);
INSERT INTO `security` VALUES (8, '31321323', '其它事件', '2018-05-01 02:29:00', 'hjkhjgk', NULL, NULL, NULL);
INSERT INTO `security` VALUES (9, 'asdas', '其它事件', '2018-04-26 10:10:00', 'sadasd', NULL, NULL, NULL);
INSERT INTO `security` VALUES (10, '士大夫似的', '其它事件', '2018-04-30 20:27:00', '到时候但是', NULL, NULL, NULL);
INSERT INTO `security` VALUES (11, '543645', '突发事件', '2018-05-01 02:29:00', '6543\r\n465\r\n465', NULL, NULL, NULL);

-- ----------------------------
-- Table structure for title
-- ----------------------------
DROP TABLE IF EXISTS `title`;
CREATE TABLE `title`  (
  `titleId` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `titleName` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `EX1` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `EX2` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `EX3` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`titleId`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of title
-- ----------------------------
INSERT INTO `title` VALUES ('1', '管理员', '', '', '');
INSERT INTO `title` VALUES ('2', '总经理', '', '', '');
INSERT INTO `title` VALUES ('3', '前台人员', '', '', '');
INSERT INTO `title` VALUES ('4', '工作人员', '', '', '');

-- ----------------------------
-- Table structure for userclassinfo
-- ----------------------------
DROP TABLE IF EXISTS `userclassinfo`;
CREATE TABLE `userclassinfo`  (
  `UserClassID` int(11) NOT NULL AUTO_INCREMENT,
  `UserClassName` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `ClassNotes` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NULL,
  PRIMARY KEY (`UserClassID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of userclassinfo
-- ----------------------------
INSERT INTO `userclassinfo` VALUES (1, '系统管理员', '系统管理员');
INSERT INTO `userclassinfo` VALUES (2, '总经理', '总经理');
INSERT INTO `userclassinfo` VALUES (3, '前台员工', '前台员工');

SET FOREIGN_KEY_CHECKS = 1;
