/*
 Navicat Premium Data Transfer

 Source Server         : Apricots[localhost]
 Source Server Type    : MySQL
 Source Server Version : 50520
 Source Host           : localhost:3306
 Source Schema         : hotel_zhang

 Target Server Type    : MySQL
 Target Server Version : 50520
 File Encoding         : 65001

 Date: 20/04/2018 00:03:50
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
  `changetime` datetime NULL DEFAULT NULL COMMENT '换房时间',
  `reason` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '换房原因',
  `note` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '备注',
  `emplyeeId` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '操作人id',
  `ex1` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '预留字段1',
  `ex2` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '预留字段2',
  `ex3` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '预留字段3',
  `ex4` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '预留字段4',
  `ex5` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '预留字段5',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of changeroom
-- ----------------------------
INSERT INTO `changeroom` VALUES (1, 28, 'B405', 'B407', '2018-04-19 01:58:13', '不喜欢', '无', NULL, NULL, NULL, NULL, NULL, NULL);

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
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of department
-- ----------------------------
INSERT INTO `department` VALUES ('105000010099', '总经理', NULL, '2511工作室', 0, NULL, '张百全', '1050000100000003');
INSERT INTO `department` VALUES ('105000010199', '管理部', NULL, '2511工作室', 0, NULL, '黄金山', '1050000100000002');
INSERT INTO `department` VALUES ('105000010399', '行政部', NULL, '2511工作室', 0, NULL, '龚洪磊', '1050000100000014');
INSERT INTO `department` VALUES ('105000010499', '前厅部', NULL, '2511工作室', 0, NULL, '高珏慧', '1050000100000018');
INSERT INTO `department` VALUES ('105000010599', '客房部', NULL, '2511工作室', 0, NULL, '颜昌武', '1050000100000034');
INSERT INTO `department` VALUES ('105000010699', '餐饮部', NULL, '2511工作室', 0, NULL, '黄胜', '1050000100000040');
INSERT INTO `department` VALUES ('105000010799', '娱乐部', NULL, '2511工作室', 0, NULL, '周运涛', '1050000100000042');
INSERT INTO `department` VALUES ('105000010899', '保安部', NULL, '2511工作室', 0, NULL, '张继伟', '1050000100000046');
INSERT INTO `department` VALUES ('105000011099', '人事部', NULL, '2511工作室', 0, NULL, '王东林', '1050000100000048');

-- ----------------------------
-- Table structure for emergency
-- ----------------------------
DROP TABLE IF EXISTS `emergency`;
CREATE TABLE `emergency`  (
  `emergencyid` int(11) NOT NULL AUTO_INCREMENT,
  `emergencynum` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `type` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `recordname` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `time` datetime NULL DEFAULT NULL,
  `annotation` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL,
  `ex1` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `ex2` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `ex3` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `ex4` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `ex5` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`emergencyid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 22 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of emergency
-- ----------------------------
INSERT INTO `emergency` VALUES (5, NULL, '上访事件', '王者', '2018-03-15 10:48:15', '上访事件。', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `emergency` VALUES (6, NULL, '上访事件', '华为', '2018-03-15 11:51:15', '手机，荣耀系列。', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `emergency` VALUES (7, NULL, '上访事件', 'AAA', '2018-03-27 16:28:18', '576456456', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `emergency` VALUES (21, '20180327162823-71', '上访事件', '8778978', '2018-03-27 16:28:24', '7897897', NULL, NULL, NULL, NULL, NULL);

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
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of employee
-- ----------------------------
INSERT INTO `employee` VALUES ('1050000100000002', '000002', '黄金山', '18883351481', '1', '105000010199', '管理部', '1', 0, '123456', '', '');
INSERT INTO `employee` VALUES ('1050000100000003', '000003', '张百全', '18883365217', '1,2', '105000010099', '总经理', '1', 0, '123456', '', '');
INSERT INTO `employee` VALUES ('1050000100000012', '000012', '罗林辉', '18883365217', '2', '105000010199', '管理部', '1', 0, '123456', '', '');
INSERT INTO `employee` VALUES ('1050000100000013', '000013', '唐幸', '18883365217', '2', '105000010399', '行政部', '1', 0, '123456', '', '');
INSERT INTO `employee` VALUES ('1050000100000014', '000014', '卫星', '18883365217', '2', '105000010399', '行政部', '1', 0, '123456', '', '');
INSERT INTO `employee` VALUES ('1050000100000015', '000015', '张三', '18883365217', '2', '105000010499', '前厅部', '1', 0, '123456', '', '');
INSERT INTO `employee` VALUES ('1050000100000016', '000016', '李四', '18883365217', '2', '105000010499', '前厅部', '1', 0, '123456', '', '');
INSERT INTO `employee` VALUES ('1050000100000018', '000018', '王五', '18883365217', '2', '105000010499', '前厅部', '1', 0, '123456', '', '');
INSERT INTO `employee` VALUES ('1050000100000034', '000034', '颜一', '18883365217', '3', '105000010599', '客房部', '1', 0, '123456', '', '');
INSERT INTO `employee` VALUES ('1050000100000037', '000037', '范二', '18883365217', '4', '105000010599', '客房部', '1', 0, '123456', '', '');
INSERT INTO `employee` VALUES ('1050000100000039', '000039', '蹇三', '18883365217', '3', '105000010599', '客房部', '1', 0, '123456', '', '');
INSERT INTO `employee` VALUES ('1050000100000040', '000040', '黄四', '18883365217', '2', '105000010699', '餐饮部', '1', 0, '123456', '', '');
INSERT INTO `employee` VALUES ('1050000100000042', '000042', '周五', '18883365217', '2,3', '105000010799', '娱乐部', '1', 0, '123456', '', '');
INSERT INTO `employee` VALUES ('1050000100000046', '000046', '张先', '18883365217', '3', '105000010899', '保安部', '1', 0, '123456', '', '');
INSERT INTO `employee` VALUES ('1050000100000047', '000047', '刘建', '18883365217', '4', '105000010899', '保安部', '1', 0, '123456', '', '');
INSERT INTO `employee` VALUES ('1050000100000048', '000048', '王东', '18883365217', '2', '105000011099', '人事部', '1', 0, '123456', '', '');
INSERT INTO `employee` VALUES ('1050000100000050', '000050', '朱子', '18883365217', '3', '105000011099', '人事部', '1', 0, '123456', '', '');
INSERT INTO `employee` VALUES ('1050000100000051', '000051', '何欢', '18883365217', '2', '105000011099', '人事部', '1', 0, '123456', '', '');

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
  `checkintime` datetime NULL DEFAULT NULL COMMENT '入住时间',
  `leavetime` datetime NULL DEFAULT NULL COMMENT '离开时间',
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
) ENGINE = InnoDB AUTO_INCREMENT = 49 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of livein
-- ----------------------------
INSERT INTO `livein` VALUES (1, '', '黄金山', '男', '身份证', 'B201', '2018-04-08 23:55:22', NULL, NULL, '120', '5000046545646465', '普通会员', '有', '1', '18883365217', NULL, NULL, NULL);
INSERT INTO `livein` VALUES (11, NULL, '123', '男', '123', 'B205', '2018-04-14 23:11:12', '2018-04-15 09:47:19', NULL, '', '132', '213', '123', '0', NULL, NULL, NULL, NULL);
INSERT INTO `livein` VALUES (12, NULL, '321321', '男', '123132', 'B206', '2018-04-18 23:57:23', NULL, NULL, '150', '312', '123', '1323', '1', '1888336521', NULL, NULL, NULL);
INSERT INTO `livein` VALUES (13, NULL, '看看看看', '女', '身份证', 'B204', '2018-04-15 01:43:27', NULL, NULL, NULL, '8798789465465', '7898998', '12132645465465456', '1', NULL, NULL, NULL, NULL);
INSERT INTO `livein` VALUES (14, NULL, 'DDD', '男', '身份证', 'B303', '2018-04-15 01:12:23', '2018-04-15 10:36:30', NULL, NULL, '123546978', '会员', '无', '0', NULL, NULL, NULL, NULL);
INSERT INTO `livein` VALUES (20, NULL, '444', '女', '444', 'B605', '2018-04-15 03:29:38', NULL, NULL, NULL, '444', '444', '444', '1', NULL, NULL, NULL, NULL);
INSERT INTO `livein` VALUES (21, NULL, 'zzz', '女', 'zzz', 'B404', '2018-04-15 10:25:07', NULL, NULL, NULL, 'zzz', 'zzz', 'zzz', '1', NULL, NULL, NULL, NULL);
INSERT INTO `livein` VALUES (22, NULL, 'qqq', '男', 'qqq', 'B601', '2018-04-15 10:28:21', NULL, NULL, NULL, '12313254', 'qqq', 'qqq', '1', NULL, NULL, NULL, NULL);
INSERT INTO `livein` VALUES (23, NULL, 'qqq', '男', 'www', 'B509', '2018-04-15 10:28:35', '2018-04-15 10:28:40', NULL, NULL, 'www', 'www', 'www', '0', NULL, NULL, NULL, NULL);
INSERT INTO `livein` VALUES (24, NULL, 'ff', '男', 'fff', 'B309', '2018-04-15 10:30:02', '2018-04-15 10:30:06', NULL, NULL, 'fff', 'ff', 'fff', '0', NULL, NULL, NULL, NULL);
INSERT INTO `livein` VALUES (25, NULL, 'ppp', '女', 'ppp', 'B309', '2018-04-15 10:30:29', '2018-04-15 10:30:34', NULL, NULL, 'pp', 'pp', 'pp', '0', NULL, NULL, NULL, NULL);
INSERT INTO `livein` VALUES (26, NULL, 'rrr', '男', 'rrr', 'B407', '2018-04-15 10:32:41', '2018-04-15 10:34:45', NULL, NULL, 'rrr', 'rrr', 'rrrr', '0', NULL, NULL, NULL, NULL);
INSERT INTO `livein` VALUES (27, NULL, 'hhh', '男', 'hhh', 'B707', '2018-04-15 10:32:53', '2018-04-15 10:32:56', NULL, NULL, 'hhh', 'hhh', 'hhh', '0', NULL, NULL, NULL, NULL);
INSERT INTO `livein` VALUES (28, NULL, 'vvv', '男', 'vvv', 'B405', '2018-04-16 22:43:31', NULL, NULL, '120', 'vv', 'vvv', 'vvvv', '1', '18883365217', NULL, NULL, NULL);
INSERT INTO `livein` VALUES (30, NULL, '323232', '女', '2332', 'B307', '2018-04-15 11:33:03', '2018-04-18 23:59:35', NULL, NULL, '323', '23', '233223', '0', NULL, NULL, NULL, NULL);
INSERT INTO `livein` VALUES (31, NULL, '545', '男', '54', 'B507', '2018-04-15 11:33:12', '2018-04-15 11:33:16', NULL, NULL, '54', '45', '54', '0', NULL, NULL, NULL, NULL);
INSERT INTO `livein` VALUES (32, NULL, '卫星', '男', '身份证', 'B708', '2018-04-15 19:56:27', '2018-04-15 19:56:36', NULL, NULL, '456465465465', 'SVIP', '点了一瓶水', '0', NULL, NULL, NULL, NULL);
INSERT INTO `livein` VALUES (33, NULL, 'tangxing', '男', '435435', 'B708', '2018-04-15 19:58:26', '2018-04-15 19:58:34', NULL, NULL, '546453', '3653563564', '564645546', '0', NULL, NULL, NULL, NULL);
INSERT INTO `livein` VALUES (37, NULL, '李明', '男', '321132321321', 'B704', '2018-04-15 20:07:10', '2018-04-15 20:07:48', NULL, NULL, '132536546456', '123', '132', '0', NULL, NULL, NULL, NULL);
INSERT INTO `livein` VALUES (38, NULL, '收到', '男', '的', 'B305', '2018-04-16 16:49:19', '2018-04-16 16:49:25', NULL, NULL, '收到', '收到', '多少', '0', NULL, NULL, NULL, NULL);
INSERT INTO `livein` VALUES (39, NULL, '786', '男', '7867', 'B506', '2018-04-16 16:53:46', NULL, NULL, NULL, '8678', '6786', '786786', '1', NULL, NULL, NULL, NULL);
INSERT INTO `livein` VALUES (40, NULL, 'Linux', '男', '身份证', 'B302', '2018-04-17 00:23:43', NULL, NULL, '120', '412829199404205632', '普通会员', '无', '1', '18883365217', NULL, NULL, NULL);
INSERT INTO `livein` VALUES (42, NULL, 'MYSQL', '男', '身份证', 'B403000000000000000000000000000000000', '2018-04-17 22:33:08', '2018-04-19 00:00:25', NULL, '120', '412829199404205631', '普通会员', '无', '0', '18883365217', NULL, NULL, NULL);
INSERT INTO `livein` VALUES (48, NULL, '张百全', '女', '身份证', 'B608', '2018-04-17 01:19:59', NULL, NULL, '300', '412829199404205631', '铂金会员', '无', '1', '18883365217', NULL, NULL, NULL);

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
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of m_functioncontrol
-- ----------------------------
INSERT INTO `m_functioncontrol` VALUES ('4ksbvSrbeOcy', 0, '客房管理', '', '0', NULL, NULL, NULL, NULL, 1);
INSERT INTO `m_functioncontrol` VALUES ('0gs6SJuFf4CQ', 1, '客人入住', '', '0', NULL, NULL, NULL, NULL, 1);
INSERT INTO `m_functioncontrol` VALUES ('JJhh4Cvbzla1', 1, '实时房态数据', 'roommanagement/realtime_room.action', '4ksbvSrbeOcy', NULL, NULL, NULL, NULL, 1);
INSERT INTO `m_functioncontrol` VALUES ('AsOSt2Z6XZID', 3, '预定管理', 'guestmanagement/livein.action', '0gs6SJuFf4CQ', NULL, NULL, NULL, NULL, 1);
INSERT INTO `m_functioncontrol` VALUES ('RLVhdsIpHQ5W', 4, '预定管理查询', 'guestmanagement/liveinlist.action', '0gs6SJuFf4CQ', NULL, NULL, NULL, NULL, 1);
INSERT INTO `m_functioncontrol` VALUES ('30UpylBmhkNF', 2, '实时房态列表', 'roommanagement/realtime_list.action', '4ksbvSrbeOcy', NULL, NULL, NULL, NULL, 1);
INSERT INTO `m_functioncontrol` VALUES ('nnWnwRekkbZh', 1, '入住登记', 'guestmanagement/livein.action', '0gs6SJuFf4CQ', NULL, NULL, NULL, NULL, 1);
INSERT INTO `m_functioncontrol` VALUES ('OZbp8bjFWRLE', 2, '入住登记查询', 'guestmanagement/liveinlist.action', '0gs6SJuFf4CQ', NULL, NULL, NULL, NULL, 1);
INSERT INTO `m_functioncontrol` VALUES ('Pk1LK3ut240W', 5, '换房', 'changeroom/changeroomadd.action', '0gs6SJuFf4CQ', NULL, NULL, NULL, NULL, 0);
INSERT INTO `m_functioncontrol` VALUES ('vXd70MHD6rKz', 6, '换房查询', 'changeroom/changeroomlist.action', '0gs6SJuFf4CQ', NULL, NULL, NULL, NULL, 1);
INSERT INTO `m_functioncontrol` VALUES ('1mb6vFAQndtF', 6, '系统设置', '', '0', NULL, NULL, NULL, NULL, 1);
INSERT INTO `m_functioncontrol` VALUES ('lkAezjHYX9r0', 1, '用户管理', 'user/list.action', '1mb6vFAQndtF', NULL, NULL, NULL, NULL, 1);
INSERT INTO `m_functioncontrol` VALUES ('2obIp8t4L5u3', 2, '部门管理', 'dept/list.action', '1mb6vFAQndtF', NULL, NULL, NULL, NULL, 1);
INSERT INTO `m_functioncontrol` VALUES ('dweCXvsDkQbb', 3, '商品管理', 'goods/list.action', '1mb6vFAQndtF', NULL, NULL, NULL, NULL, 0);
INSERT INTO `m_functioncontrol` VALUES ('ey5XM0RIxBFF', 4, '角色管理', 'group/list.action', '1mb6vFAQndtF', NULL, NULL, NULL, NULL, 1);
INSERT INTO `m_functioncontrol` VALUES ('4Dro6KwnGSxw', 5, '功能树管理', 'func/showIndex.action', '1mb6vFAQndtF', NULL, NULL, NULL, NULL, 1);
INSERT INTO `m_functioncontrol` VALUES ('E4NXrX5tPDHY', 1, '油耗查询', 'defaultPage.action', '9Og8pAiSqX4o', NULL, NULL, NULL, NULL, 1);
INSERT INTO `m_functioncontrol` VALUES ('brPXIIQEHi4Z', NULL, '车辆查询', 'defaultPage.action', '9Og8pAiSqX4o', NULL, NULL, NULL, NULL, 1);
INSERT INTO `m_functioncontrol` VALUES ('ouIB25v6IeIi', 3, '车辆使用申请', 'defaultPage.action', '9Og8pAiSqX4o', NULL, NULL, NULL, NULL, 1);
INSERT INTO `m_functioncontrol` VALUES ('iDViQad5XuWV', 4, '车辆使用申请查询', 'defaultPage.action', '9Og8pAiSqX4o', NULL, NULL, NULL, NULL, 1);
INSERT INTO `m_functioncontrol` VALUES ('gS6hlX3nKcLc', 5, '车辆使用审批', 'defaultPage.action', '9Og8pAiSqX4o', NULL, NULL, NULL, NULL, 0);
INSERT INTO `m_functioncontrol` VALUES ('ViiTmg8C15h4', 6, '车辆维修申请', 'defaultPage.action', '9Og8pAiSqX4o', NULL, NULL, NULL, NULL, 1);
INSERT INTO `m_functioncontrol` VALUES ('wBFUK0RzaeF0', 6, '车辆维修申请查询', 'defaultPage.action', '9Og8pAiSqX4o', NULL, NULL, NULL, NULL, 1);
INSERT INTO `m_functioncontrol` VALUES ('aFNG9olO1fhF', 7, '车辆维修事故审批', 'defaultPage.action', '9Og8pAiSqX4o', NULL, NULL, NULL, NULL, 0);
INSERT INTO `m_functioncontrol` VALUES ('96dd5HoovBau', 1, '待办任务', 'defaultPage.action', 'HDpoaLoYeX9g', NULL, NULL, NULL, NULL, 1);
INSERT INTO `m_functioncontrol` VALUES ('q9GvGyOjjgF6', 2, '流程部署', 'defaultPage.action', 'HDpoaLoYeX9g', NULL, NULL, NULL, NULL, 0);
INSERT INTO `m_functioncontrol` VALUES ('l2Wz2HxtVyHq', 1, '能耗查询', 'energy/list.action', 'wp12tfNEDaya', NULL, NULL, NULL, NULL, 1);
INSERT INTO `m_functioncontrol` VALUES ('TJUV6TXzDChI', 1, '物品信息', 'defaultPage.action', 'KlFFKlRKi6Y3', NULL, NULL, NULL, NULL, 1);
INSERT INTO `m_functioncontrol` VALUES ('EKDKVOEZjdXt', 3, '新建流程图', 'defaultPage.action', 'HDpoaLoYeX9g', NULL, NULL, NULL, NULL, 1);
INSERT INTO `m_functioncontrol` VALUES ('CqKustlbFDKO', 4, '流程模型列表', 'defaultPage.action', 'HDpoaLoYeX9g', NULL, NULL, NULL, NULL, 1);
INSERT INTO `m_functioncontrol` VALUES ('ONTmqDZTjMyF', 1, '流程定义管理', 'defaultPage.action', 'HDpoaLoYeX9g', NULL, NULL, NULL, NULL, 1);
INSERT INTO `m_functioncontrol` VALUES ('Nz44MjZ9bVn0', 8, '安全管理', '', '0', NULL, NULL, NULL, NULL, 1);
INSERT INTO `m_functioncontrol` VALUES ('aSuaT3kxSN0a', NULL, '访客登记', 'defaultPage.action', 'Nz44MjZ9bVn0', NULL, NULL, NULL, NULL, 0);
INSERT INTO `m_functioncontrol` VALUES ('AOf8bAZNDkL4', NULL, '应急事件', 'defaultPage.action', 'Nz44MjZ9bVn0', NULL, NULL, NULL, NULL, 1);
INSERT INTO `m_functioncontrol` VALUES ('Ha7NQZikx6AM', NULL, '消费管理', 'defaultPage.action', '9RMuz9KclOUI', NULL, NULL, NULL, NULL, 1);
INSERT INTO `m_functioncontrol` VALUES ('LJJyjRKbClfL', NULL, '进销存管理', 'defaultPage.action', '9RMuz9KclOUI', NULL, NULL, NULL, NULL, 1);
INSERT INTO `m_functioncontrol` VALUES ('G3jkZpsm9gFW', NULL, '成本', 'defaultPage.action', '9RMuz9KclOUI', NULL, NULL, NULL, NULL, 1);
INSERT INTO `m_functioncontrol` VALUES ('iNYxPdc8pBEO', NULL, '卡片', 'defaultPage.action', '9RMuz9KclOUI', NULL, NULL, NULL, NULL, 1);
INSERT INTO `m_functioncontrol` VALUES ('CLni69Lj1fp8', 2, '商品入库', 'defaultPage.action', 'KlFFKlRKi6Y3', NULL, NULL, NULL, NULL, 1);
INSERT INTO `m_functioncontrol` VALUES ('JEORMSxkx1uJ', 3, '商品出库', 'defaultPage.action', 'KlFFKlRKi6Y3', NULL, NULL, NULL, NULL, 1);
INSERT INTO `m_functioncontrol` VALUES ('cbYDvbK8KiCS', 1, '已办任务', 'defaultPage.action', 'HDpoaLoYeX9g', NULL, NULL, NULL, NULL, 1);
INSERT INTO `m_functioncontrol` VALUES ('SjO6LH344Ydh', NULL, '新增房间', 'roommanagement/toroomadd.action', '4ksbvSrbeOcy', NULL, NULL, NULL, NULL, 1);
INSERT INTO `m_functioncontrol` VALUES ('X7rVXch0pVhG', NULL, '实时房态', 'roommanagement/realtime_data.action', '4ksbvSrbeOcy', NULL, NULL, NULL, NULL, 1);

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
) ENGINE = InnoDB AUTO_INCREMENT = 810 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of m_sys_funcsecurity
-- ----------------------------
INSERT INTO `m_sys_funcsecurity` VALUES (720, 1, '4ksbvSrbeOcy', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (721, 1, 'SjO6LH344Ydh', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (722, 1, 'X7rVXch0pVhG', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (723, 1, 'JJhh4Cvbzla1', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (724, 1, '30UpylBmhkNF', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (725, 1, '0gs6SJuFf4CQ', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (726, 1, 'OZbp8bjFWRLE', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (727, 1, 'AsOSt2Z6XZID', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (728, 1, 'RLVhdsIpHQ5W', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (729, 1, 'Pk1LK3ut240W', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (730, 1, 'vXd70MHD6rKz', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (731, 1, '1mb6vFAQndtF', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (732, 1, 'lkAezjHYX9r0', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (733, 1, '2obIp8t4L5u3', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (734, 1, 'dweCXvsDkQbb', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (735, 1, 'ey5XM0RIxBFF', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (736, 1, '4Dro6KwnGSxw', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (737, 1, 'Nz44MjZ9bVn0', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (738, 1, 'aSuaT3kxSN0a', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (739, 1, 'AOf8bAZNDkL4', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (773, 4, 'JJhh4Cvbzla1', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (774, 4, '30UpylBmhkNF', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (775, 4, 'Nz44MjZ9bVn0', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (776, 4, 'aSuaT3kxSN0a', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (777, 4, 'AOf8bAZNDkL4', 0);
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

-- ----------------------------
-- Table structure for room
-- ----------------------------
DROP TABLE IF EXISTS `room`;
CREATE TABLE `room`  (
  `roomid` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `roomnum` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '房间号',
  `customerid` int(11) NULL DEFAULT NULL COMMENT '顾客id',
  `floor` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '房间楼层',
  `type` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '房间类型',
  `price` decimal(10, 2) NULL DEFAULT NULL COMMENT '房间价格',
  `state` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '房间状态',
  `isreservation` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '是否有预定',
  `reservationtime` datetime NULL DEFAULT NULL COMMENT '预定时间',
  `arrive` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '到达时间',
  `deposit` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '押金',
  `instructions` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '房间说明',
  `ex1` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段1',
  `ex2` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段2',
  `ex3` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段3',
  `ex4` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段4',
  `ex5` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备用字段5',
  PRIMARY KEY (`roomid`) USING BTREE,
  INDEX `roomnum`(`roomnum`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 55 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of room
-- ----------------------------
INSERT INTO `room` VALUES (1, 'B201', 1, '2楼', '标准单人间', 120.00, '已入住', '已预定', NULL, NULL, NULL, '测试房间', '', NULL, NULL, NULL, NULL);
INSERT INTO `room` VALUES (2, 'B202', NULL, '2楼', '标准单人间', 120.00, '空净房', '未预定', NULL, NULL, NULL, '测试房间', '', NULL, NULL, NULL, NULL);
INSERT INTO `room` VALUES (3, 'B203', NULL, '2楼', '标准单人间', 120.00, '空净房', '未预定', NULL, NULL, NULL, '测试房间', '', NULL, NULL, NULL, NULL);
INSERT INTO `room` VALUES (4, 'B204', 13, '2楼', '标准单人间', 120.00, '已入住', '未预定', NULL, NULL, NULL, '测试房间', '', NULL, NULL, NULL, NULL);
INSERT INTO `room` VALUES (5, 'B205', NULL, '2楼', '标准单人间', 120.00, '空净房', '未预定', NULL, NULL, NULL, '测试房间', '', NULL, NULL, NULL, NULL);
INSERT INTO `room` VALUES (6, 'B206', 12, '2楼', '标准单人间', 120.00, '已入住', '未预定', NULL, NULL, NULL, '测试房间', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `room` VALUES (7, 'B207', NULL, '2楼', '标准单人间', 120.00, '空净房', '未预定', NULL, NULL, NULL, '测试房间', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `room` VALUES (8, 'B208', NULL, '2楼', '标准单人间', 120.00, '空净房', '未预定', NULL, NULL, NULL, '测试房间', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `room` VALUES (9, 'B209', NULL, '2楼', '标准单人间', 120.00, '空净房', '未预定', NULL, NULL, NULL, '测试房间', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `room` VALUES (10, 'B301', NULL, '3楼', '标准单人间', 120.00, '空净房', '未预定', NULL, NULL, NULL, '测试房间', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `room` VALUES (11, 'B302', 40, '3楼', '标准单人间', 120.00, '已入住', '未预定', NULL, NULL, NULL, '测试房间', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `room` VALUES (12, 'B303', 14, '3楼', '标准单人间', 120.00, '脏房', '未预定', NULL, NULL, NULL, '测试房间', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `room` VALUES (13, 'B304', NULL, '3楼', '标准单人间', 120.00, '空净房', '未预定', NULL, NULL, NULL, '测试房间', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `room` VALUES (14, 'B305', 38, '3楼', '标准单人间', 120.00, '脏房', '未预定', NULL, NULL, NULL, '测试房间', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `room` VALUES (15, 'B306', NULL, '3楼', '标准单人间', 120.00, '空净房', '未预定', NULL, NULL, NULL, '测试房间', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `room` VALUES (16, 'B307', 30, '3楼', '标准单人间', 120.00, '脏房', '未预定', NULL, NULL, NULL, '测试房间', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `room` VALUES (17, 'B308', NULL, '3楼', '标准单人间', 120.00, '空净房', '未预定', NULL, NULL, NULL, '测试房间', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `room` VALUES (18, 'B309', NULL, '3楼', '标准单人间', 120.00, '空净房', '未预定', NULL, NULL, NULL, '测试房间', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `room` VALUES (19, 'B401', NULL, '4楼', '标准双人间', 150.00, '空净房', '未预定', NULL, NULL, NULL, '测试房间', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `room` VALUES (20, 'B402', NULL, '4楼', '标准双人间', 150.00, '空净房', '未预定', NULL, NULL, NULL, '测试房间', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `room` VALUES (21, 'B403', 42, '4楼', '标准双人间', 150.00, '脏房', '未预定', NULL, NULL, NULL, '测试房间', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `room` VALUES (22, 'B404', 21, '4楼', '标准双人间', 150.00, '已入住', '未预定', NULL, NULL, NULL, '测试房间', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `room` VALUES (23, 'B405', 28, '4楼', '标准双人间', 150.00, '已入住', '未预定', NULL, NULL, NULL, '测试房间', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `room` VALUES (24, 'B406', NULL, '4楼', '标准双人间', 150.00, '空净房', '未预定', NULL, NULL, NULL, '测试房间', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `room` VALUES (25, 'B407', NULL, '4楼', '标准双人间', 150.00, '空净房', '未预定', NULL, NULL, NULL, '测试房间', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `room` VALUES (26, 'B408', NULL, '4楼', '标准双人间', 150.00, '空净房', '未预定', NULL, NULL, NULL, '测试房间', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `room` VALUES (27, 'B409', NULL, '4楼', '标准双人间', 150.00, '空净房', '未预定', NULL, NULL, NULL, '测试房间', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `room` VALUES (28, 'B501', NULL, '5楼', '标准双人间', 150.00, '空净房', '未预定', NULL, NULL, NULL, '测试房间', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `room` VALUES (29, 'B502', NULL, '5楼', '标准双人间', 150.00, '空净房', '未预定', NULL, NULL, NULL, '测试房间', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `room` VALUES (30, 'B503', NULL, '5楼', '标准双人间', 150.00, '空净房', '未预定', NULL, NULL, NULL, '测试房间', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `room` VALUES (31, 'B504', NULL, '5楼', '标准双人间', 150.00, '空净房', '未预定', NULL, NULL, NULL, '测试房间', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `room` VALUES (32, 'B505', NULL, '5楼', '标准双人间', 150.00, '空净房', '未预定', NULL, NULL, NULL, '测试房间', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `room` VALUES (33, 'B506', 39, '5楼', '标准双人间', 150.00, '已入住', '未预定', NULL, NULL, NULL, '测试房间', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `room` VALUES (34, 'B507', 31, '5楼', '标准双人间', 150.00, '空净房', '未预定', NULL, NULL, NULL, '测试房间', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `room` VALUES (35, 'B508', NULL, '5楼', '标准双人间', 150.00, '空净房', '未预定', NULL, NULL, NULL, '测试房间', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `room` VALUES (36, 'B509', 23, '5楼', '标准双人间', 150.00, '脏房', '未预定', NULL, NULL, NULL, '测试房间', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `room` VALUES (37, 'B601', 22, '6楼', '特惠大床房', 200.00, '已入住', '未预定', NULL, NULL, NULL, '测试房间', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `room` VALUES (38, 'B602', NULL, '6楼', '特惠大床房', 200.00, '空净房', '未预定', NULL, NULL, NULL, '测试房间', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `room` VALUES (39, 'B603', NULL, '6楼', '特惠大床房', 200.00, '空净房', '未预定', NULL, NULL, NULL, '测试房间', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `room` VALUES (40, 'B604', NULL, '6楼', '特惠大床房', 200.00, '空净房', '未预定', NULL, NULL, NULL, '测试房间', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `room` VALUES (41, 'B605', 20, '6楼', '特惠大床房', 200.00, '已入住', '未预定', NULL, NULL, NULL, '测试房间', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `room` VALUES (42, 'B606', NULL, '6楼', '特惠大床房', 200.00, '空净房', '未预定', NULL, NULL, NULL, '测试房间', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `room` VALUES (43, 'B607', NULL, '6楼', '特惠大床房', 200.00, '空净房', '未预定', NULL, NULL, NULL, '测试房间', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `room` VALUES (44, 'B608', 48, '6楼', '特惠大床房', 200.00, '已入住', '未预定', NULL, NULL, NULL, '测试房间', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `room` VALUES (45, 'B609', NULL, '6楼', '特惠大床房', 200.00, '空净房', '未预定', NULL, NULL, NULL, '测试房间', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `room` VALUES (46, 'B701', NULL, '7楼', '豪华大床房', 200.00, '空净房', '未预定', NULL, NULL, NULL, '测试房间', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `room` VALUES (47, 'B702', NULL, '7楼', '豪华大床房', 200.00, '空净房', '未预定', NULL, NULL, NULL, '测试房间', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `room` VALUES (48, 'B703', NULL, '7楼', '豪华大床房', 200.00, '空净房', '未预定', NULL, NULL, NULL, '测试房间', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `room` VALUES (49, 'B704', 37, '7楼', '豪华大床房', 200.00, '脏房', '未预定', NULL, NULL, NULL, '测试房间', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `room` VALUES (50, 'B705', NULL, '7楼', '豪华大床房', 200.00, '空净房', '未预定', NULL, NULL, NULL, '测试房间', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `room` VALUES (51, 'B706', NULL, '7楼', '豪华大床房', 200.00, '空净房', '未预定', NULL, NULL, NULL, '测试房间', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `room` VALUES (52, 'B707', NULL, '7楼', '豪华大床房', 200.00, '空净房', '未预定', NULL, NULL, NULL, '测试房间', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `room` VALUES (53, 'B708', 33, '7楼', '豪华大床房', 200.00, '空净房', '未预定', NULL, NULL, NULL, '测试房间', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `room` VALUES (54, 'B709', NULL, '7楼', '豪华大床房', 200.00, '空净房', '未预定', NULL, NULL, NULL, '测试房间', NULL, NULL, NULL, NULL, NULL);

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
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of roomstate
-- ----------------------------
INSERT INTO `roomstate` VALUES (1, '空净房', NULL, NULL, NULL);
INSERT INTO `roomstate` VALUES (2, '已入住', NULL, NULL, NULL);
INSERT INTO `roomstate` VALUES (3, '脏房', NULL, NULL, NULL);

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
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

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
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of userclassinfo
-- ----------------------------
INSERT INTO `userclassinfo` VALUES (1, '系统管理员', '系统管理员');
INSERT INTO `userclassinfo` VALUES (2, '总经理', '总经理');
INSERT INTO `userclassinfo` VALUES (3, '前台员工', '前台员工');
INSERT INTO `userclassinfo` VALUES (4, '游客', '游客用户');

-- ----------------------------
-- Table structure for visitorinfo
-- ----------------------------
DROP TABLE IF EXISTS `visitorinfo`;
CREATE TABLE `visitorinfo`  (
  `visitorid` int(11) NOT NULL AUTO_INCREMENT,
  `visitorname` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `visitorgender` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `cardtype` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `cardnum` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `personnum` int(11) NULL DEFAULT NULL,
  `starttime` datetime NULL DEFAULT NULL,
  `endtime` datetime NULL DEFAULT NULL,
  `verifyway` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `visitdept` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `reason` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `accesstoperson` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `ex1` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `ex2` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `ex3` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `ex4` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `ex5` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`visitorid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 8 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of visitorinfo
-- ----------------------------
INSERT INTO `visitorinfo` VALUES (1, '张三', '男', '身份证', '5000045464', 1000003, '2018-03-02 11:25:31', '2018-03-02 12:25:31', '读卡', NULL, NULL, NULL, NULL, '东门', NULL, NULL, NULL, NULL);
INSERT INTO `visitorinfo` VALUES (2, '李四', '男', '身份证', '646546546', 1000004, '2018-03-02 13:25:31', '2018-03-02 15:25:31', '读卡', NULL, NULL, NULL, NULL, '东门', NULL, NULL, NULL, NULL);
INSERT INTO `visitorinfo` VALUES (3, 'XXX', '女', '身份证', '132134654', 21121212, '2018-03-02 13:25:31', '2018-03-02 13:25:31', '读卡', NULL, NULL, NULL, NULL, '西门', NULL, NULL, NULL, NULL);
INSERT INTO `visitorinfo` VALUES (4, 'CCC', '男', '身份证', '13215465546', 1321231321, '2018-03-02 13:25:31', '2018-03-02 13:25:31', '读卡', NULL, NULL, NULL, NULL, '东门', NULL, NULL, NULL, NULL);
INSERT INTO `visitorinfo` VALUES (5, 'VV', '男', '身份证', '12131213', 132123132, '2018-03-02 13:25:31', '2018-03-02 13:25:31', '读卡', NULL, NULL, NULL, NULL, '东门', NULL, NULL, NULL, NULL);
INSERT INTO `visitorinfo` VALUES (6, 'AAA', '女', '身份证', '12123231', 1221113, '2018-03-02 13:25:31', '2018-03-02 13:25:31', '读卡', NULL, NULL, NULL, NULL, '东门', NULL, NULL, NULL, NULL);
INSERT INTO `visitorinfo` VALUES (7, 'SSS', '男', '身份证', '1213132', 1313213, '2018-03-07 13:25:31', '2018-03-07 18:25:31', '读卡', NULL, NULL, NULL, NULL, '西门', NULL, NULL, NULL, NULL);

SET FOREIGN_KEY_CHECKS = 1;
