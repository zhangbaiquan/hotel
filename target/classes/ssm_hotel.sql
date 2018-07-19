/*
 Navicat Premium Data Transfer

 Source Server         : apricots
 Source Server Type    : MySQL
 Source Server Version : 50520
 Source Host           : localhost:3306
 Source Schema         : ssm_hotel

 Target Server Type    : MySQL
 Target Server Version : 50520
 File Encoding         : 65001

 Date: 17/03/2018 21:36:03
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for department
-- ----------------------------
DROP TABLE IF EXISTS `department`;
CREATE TABLE `department`  (
  `deptID` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `deptName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `parentId` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `company` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `Isdelete` int(1) DEFAULT NULL,
  `EX1` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `EX2` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `EX3` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  PRIMARY KEY (`deptID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of department
-- ----------------------------
INSERT INTO `department` VALUES ('003', '前台', NULL, '2511', 0, NULL, NULL, NULL);
INSERT INTO `department` VALUES ('105000010099', '办公室', '', '公司总部', 0, '', '', '1050000100012658');
INSERT INTO `department` VALUES ('105000010199', '前台', '', '公司总部', 0, '', '', '1050000100000051');

-- ----------------------------
-- Table structure for employee
-- ----------------------------
DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee`  (
  `emplyeeId` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `usename` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `realname` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `phone` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `titleId` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `deptId` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `deptName` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `groupId` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `Isdelete` int(1) DEFAULT NULL,
  `EX1` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `EX2` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `EX3` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  PRIMARY KEY (`emplyeeId`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of employee
-- ----------------------------
INSERT INTO `employee` VALUES ('000004', '黄金三', '黄金三', '18883351481', '16', '105000010099', '办公室', '1', 0, NULL, NULL, NULL);
INSERT INTO `employee` VALUES ('1050000100000003', '000001', '张百全', '13908365966', '23', '105000010099', '管理员', '1', 0, '', '', '');
INSERT INTO `employee` VALUES ('1050000100000007', '000002', '2511工作室', '13908278452', '16', '105000010099', '总经理', '1', 0, '', '', '');

-- ----------------------------
-- Table structure for m_functioncontrol
-- ----------------------------
DROP TABLE IF EXISTS `m_functioncontrol`;
CREATE TABLE `m_functioncontrol`  (
  `ID` varchar(12) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `PXID` int(11) DEFAULT NULL,
  `NAME` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `URL` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `PID` varchar(12) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `IMAGE` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `PRI` int(11) DEFAULT NULL,
  `ISLEAF` int(11) DEFAULT NULL,
  `PARA` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `ACTIVATE` int(11) DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of m_functioncontrol
-- ----------------------------
INSERT INTO `m_functioncontrol` VALUES ('4ksbvSrbeOcy', 0, '办公用品管理', '', '0', NULL, NULL, NULL, NULL, 1);
INSERT INTO `m_functioncontrol` VALUES ('0gs6SJuFf4CQ', 1, '固定资产管理', '', '0', NULL, NULL, NULL, NULL, 1);
INSERT INTO `m_functioncontrol` VALUES ('JJhh4Cvbzla1', 1, '领用申请', 'office_useapply/sendAddDetail.action', '4ksbvSrbeOcy', NULL, NULL, NULL, NULL, 1);
INSERT INTO `m_functioncontrol` VALUES ('AsOSt2Z6XZID', 2, '领用申请查询', 'office_useapply/find.action', '4ksbvSrbeOcy', NULL, NULL, NULL, NULL, 1);
INSERT INTO `m_functioncontrol` VALUES ('RLVhdsIpHQ5W', 3, '采购申请', 'buy/sendAddDetail.action', '4ksbvSrbeOcy', NULL, NULL, NULL, NULL, 1);
INSERT INTO `m_functioncontrol` VALUES ('30UpylBmhkNF', 4, '采购申请查询', 'buy/find.action', '4ksbvSrbeOcy', NULL, NULL, NULL, NULL, 1);
INSERT INTO `m_functioncontrol` VALUES ('nnWnwRekkbZh', 1, '领用申请', 'fixed/sendUseApply.action', '0gs6SJuFf4CQ', NULL, NULL, NULL, NULL, 1);
INSERT INTO `m_functioncontrol` VALUES ('OZbp8bjFWRLE', 2, '领用申请查询', 'fixed/findlist.action', '0gs6SJuFf4CQ', NULL, NULL, NULL, NULL, 1);
INSERT INTO `m_functioncontrol` VALUES ('Pk1LK3ut240W', 3, '采购申请', 'fixedpurchase/sendUseApply.action', '0gs6SJuFf4CQ', NULL, NULL, NULL, NULL, 1);
INSERT INTO `m_functioncontrol` VALUES ('vXd70MHD6rKz', 4, '采购申请查询', 'fixedpurchase/findlist.action', '0gs6SJuFf4CQ', NULL, NULL, NULL, NULL, 1);
INSERT INTO `m_functioncontrol` VALUES ('1mb6vFAQndtF', 6, '系统设置', '', '0', NULL, NULL, NULL, NULL, 1);
INSERT INTO `m_functioncontrol` VALUES ('lkAezjHYX9r0', 1, '用户管理', 'user/list.action', '1mb6vFAQndtF', NULL, NULL, NULL, NULL, 1);
INSERT INTO `m_functioncontrol` VALUES ('2obIp8t4L5u3', 2, '部门管理', 'dept/list.action', '1mb6vFAQndtF', NULL, NULL, NULL, NULL, 1);
INSERT INTO `m_functioncontrol` VALUES ('dweCXvsDkQbb', 3, '商品管理', 'goods/list.action', '1mb6vFAQndtF', NULL, NULL, NULL, NULL, 0);
INSERT INTO `m_functioncontrol` VALUES ('ey5XM0RIxBFF', 4, '角色管理', 'group/list.action', '1mb6vFAQndtF', NULL, NULL, NULL, NULL, 1);
INSERT INTO `m_functioncontrol` VALUES ('4Dro6KwnGSxw', 5, '功能树管理', 'func/showIndex.action', '1mb6vFAQndtF', NULL, NULL, NULL, NULL, 1);
INSERT INTO `m_functioncontrol` VALUES ('9Og8pAiSqX4o', 3, '车辆管理', '', '0', NULL, NULL, NULL, NULL, 1);
INSERT INTO `m_functioncontrol` VALUES ('E4NXrX5tPDHY', 1, '油耗查询', 'oil/list.action?current=1', '9Og8pAiSqX4o', NULL, NULL, NULL, NULL, 1);
INSERT INTO `m_functioncontrol` VALUES ('brPXIIQEHi4Z', NULL, '车辆查询', 'car/list.action', '9Og8pAiSqX4o', NULL, NULL, NULL, NULL, 1);
INSERT INTO `m_functioncontrol` VALUES ('ouIB25v6IeIi', 3, '车辆使用申请', 'carUse/sendAdd.action', '9Og8pAiSqX4o', NULL, NULL, NULL, NULL, 1);
INSERT INTO `m_functioncontrol` VALUES ('iDViQad5XuWV', 4, '车辆使用申请查询', 'carUse/find.action', '9Og8pAiSqX4o', NULL, NULL, NULL, NULL, 1);
INSERT INTO `m_functioncontrol` VALUES ('gS6hlX3nKcLc', 5, '车辆使用审批', 'carApprove/list.action', '9Og8pAiSqX4o', NULL, NULL, NULL, NULL, 0);
INSERT INTO `m_functioncontrol` VALUES ('ViiTmg8C15h4', 6, '车辆维修申请', 'carUse/sendRepairApply.action', '9Og8pAiSqX4o', NULL, NULL, NULL, NULL, 1);
INSERT INTO `m_functioncontrol` VALUES ('wBFUK0RzaeF0', 6, '车辆维修申请查询', 'carUse/sendList.action', '9Og8pAiSqX4o', NULL, NULL, NULL, NULL, 1);
INSERT INTO `m_functioncontrol` VALUES ('aFNG9olO1fhF', 7, '车辆维修事故审批', 'carApprove/list.action', '9Og8pAiSqX4o', NULL, NULL, NULL, NULL, 0);
INSERT INTO `m_functioncontrol` VALUES ('HDpoaLoYeX9g', 4, '流程管理', '', '0', NULL, NULL, NULL, NULL, 1);
INSERT INTO `m_functioncontrol` VALUES ('96dd5HoovBau', 1, '待办任务', 'process/todoTask.action', 'HDpoaLoYeX9g', NULL, NULL, NULL, NULL, 1);
INSERT INTO `m_functioncontrol` VALUES ('q9GvGyOjjgF6', 2, '流程部署', 'process/processdeployment.action', 'HDpoaLoYeX9g', NULL, NULL, NULL, NULL, 0);
INSERT INTO `m_functioncontrol` VALUES ('iKRCc59fr4PH', 5, '领用审批', 'office_useapply/taskPage.action?s_name=process', '4ksbvSrbeOcy', NULL, NULL, NULL, NULL, 0);
INSERT INTO `m_functioncontrol` VALUES ('l2Wz2HxtVyHq', 1, '能耗查询', 'energy/list.action', 'wp12tfNEDaya', NULL, NULL, NULL, NULL, 1);
INSERT INTO `m_functioncontrol` VALUES ('IYappzdGJuA0', 5, '维修申请', 'fixed/sendRepairApply.action', '0gs6SJuFf4CQ', NULL, NULL, NULL, NULL, 0);
INSERT INTO `m_functioncontrol` VALUES ('ZkeqsrFFlXBI', 6, '维修申请查询', 'fixed/showRepairList.action', '0gs6SJuFf4CQ', NULL, NULL, NULL, NULL, 0);
INSERT INTO `m_functioncontrol` VALUES ('KlFFKlRKi6Y3', 2, '仓库管理', '', '0', NULL, NULL, NULL, NULL, 1);
INSERT INTO `m_functioncontrol` VALUES ('TJUV6TXzDChI', 1, '物品信息', 'good/list.action', 'KlFFKlRKi6Y3', NULL, NULL, NULL, NULL, 1);
INSERT INTO `m_functioncontrol` VALUES ('EKDKVOEZjdXt', 3, '新建流程图', 'models/create.action', 'HDpoaLoYeX9g', '', NULL, NULL, '', 1);
INSERT INTO `m_functioncontrol` VALUES ('CqKustlbFDKO', 4, '流程模型列表', 'models/modelList.action', 'HDpoaLoYeX9g', '', NULL, NULL, '', 1);
INSERT INTO `m_functioncontrol` VALUES ('pHNj0Opr4bZ5', 6, '领用已审批', 'office_useapply/taskHistory.action?s_name=process', '4ksbvSrbeOcy', NULL, NULL, NULL, NULL, 1);
INSERT INTO `m_functioncontrol` VALUES ('ONTmqDZTjMyF', 1, '流程定义管理', 'process/processList.action', 'HDpoaLoYeX9g', NULL, NULL, NULL, NULL, 1);
INSERT INTO `m_functioncontrol` VALUES ('zxNgpGSPOqWM', 7, '固定资产申请审批', 'fixed/checkList.action', '0gs6SJuFf4CQ', NULL, NULL, NULL, NULL, 0);
INSERT INTO `m_functioncontrol` VALUES ('Nz44MjZ9bVn0', 6, '安全管理', '', '0', NULL, NULL, NULL, NULL, 1);
INSERT INTO `m_functioncontrol` VALUES ('aSuaT3kxSN0a', NULL, '访客登记', 'defaultPage.action', 'Nz44MjZ9bVn0', NULL, NULL, NULL, NULL, 1);
INSERT INTO `m_functioncontrol` VALUES ('HL2Fx6zOqLLm', NULL, '考勤门禁', 'defaultPage.action', 'Nz44MjZ9bVn0', NULL, NULL, NULL, NULL, 1);
INSERT INTO `m_functioncontrol` VALUES ('6QMLN9WtmFc6', NULL, '巡更', 'defaultPage.action', 'Nz44MjZ9bVn0', NULL, NULL, NULL, NULL, 1);
INSERT INTO `m_functioncontrol` VALUES ('AOf8bAZNDkL4', NULL, '应急事件', 'defaultPage.action', 'Nz44MjZ9bVn0', NULL, NULL, NULL, NULL, 1);
INSERT INTO `m_functioncontrol` VALUES ('9RMuz9KclOUI', 2, '食堂管理', '', '0', NULL, NULL, NULL, NULL, 1);
INSERT INTO `m_functioncontrol` VALUES ('Ha7NQZikx6AM', NULL, '消费管理', 'defaultPage.action', '9RMuz9KclOUI', NULL, NULL, NULL, NULL, 1);
INSERT INTO `m_functioncontrol` VALUES ('LJJyjRKbClfL', NULL, '进销存管理', 'defaultPage.action', '9RMuz9KclOUI', NULL, NULL, NULL, NULL, 1);
INSERT INTO `m_functioncontrol` VALUES ('G3jkZpsm9gFW', NULL, '成本', 'defaultPage.action', '9RMuz9KclOUI', NULL, NULL, NULL, NULL, 1);
INSERT INTO `m_functioncontrol` VALUES ('iNYxPdc8pBEO', NULL, '卡片', 'defaultPage.action', '9RMuz9KclOUI', NULL, NULL, NULL, NULL, 1);
INSERT INTO `m_functioncontrol` VALUES ('CLni69Lj1fp8', 2, '商品入库', 'good/addpage.action', 'KlFFKlRKi6Y3', NULL, NULL, NULL, NULL, 1);
INSERT INTO `m_functioncontrol` VALUES ('JEORMSxkx1uJ', 3, '商品出库', 'good/delpage.action', 'KlFFKlRKi6Y3', NULL, NULL, NULL, NULL, 1);
INSERT INTO `m_functioncontrol` VALUES ('VMTZXFpolxQd', 4, '入库信息查询', 'good/indepodList.action', 'KlFFKlRKi6Y3', NULL, NULL, NULL, NULL, 1);
INSERT INTO `m_functioncontrol` VALUES ('q6EFlW5Y1Mkc', 5, '出库信息查询', 'good/outdepodList.action', 'KlFFKlRKi6Y3', NULL, NULL, NULL, NULL, 1);
INSERT INTO `m_functioncontrol` VALUES ('cbYDvbK8KiCS', 1, '已办任务', 'process/endTasks.action', 'HDpoaLoYeX9g', NULL, NULL, NULL, NULL, 1);

-- ----------------------------
-- Table structure for m_sys_funcsecurity
-- ----------------------------
DROP TABLE IF EXISTS `m_sys_funcsecurity`;
CREATE TABLE `m_sys_funcsecurity`  (
  `FID` int(11) NOT NULL AUTO_INCREMENT,
  `MIS_USERID` int(50) DEFAULT NULL,
  `FUNCTION_ID` varchar(12) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `lock` int(11) DEFAULT NULL,
  PRIMARY KEY (`FID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 629 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of m_sys_funcsecurity
-- ----------------------------
INSERT INTO `m_sys_funcsecurity` VALUES (112, 3, '4ksbvSrbeOcy', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (113, 3, 'JJhh4Cvbzla1', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (114, 3, 'AsOSt2Z6XZID', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (115, 3, 'iKRCc59fr4PH', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (116, 2, '4ksbvSrbeOcy', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (117, 2, 'JJhh4Cvbzla1', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (118, 2, 'AsOSt2Z6XZID', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (119, 2, 'iKRCc59fr4PH', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (574, 1, 'wp12tfNEDaya', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (575, 1, 'l2Wz2HxtVyHq', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (576, 1, '4ksbvSrbeOcy', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (577, 1, 'JJhh4Cvbzla1', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (578, 1, 'AsOSt2Z6XZID', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (579, 1, 'RLVhdsIpHQ5W', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (580, 1, '30UpylBmhkNF', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (581, 1, 'iKRCc59fr4PH', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (582, 1, '0gs6SJuFf4CQ', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (583, 1, 'nnWnwRekkbZh', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (584, 1, 'OZbp8bjFWRLE', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (585, 1, 'Pk1LK3ut240W', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (586, 1, 'vXd70MHD6rKz', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (587, 1, 'IYappzdGJuA0', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (588, 1, 'ZkeqsrFFlXBI', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (589, 1, 'zxNgpGSPOqWM', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (590, 1, 'KlFFKlRKi6Y3', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (591, 1, 'TJUV6TXzDChI', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (592, 1, 'CLni69Lj1fp8', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (593, 1, 'JEORMSxkx1uJ', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (594, 1, 'VMTZXFpolxQd', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (595, 1, 'q6EFlW5Y1Mkc', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (596, 1, '9RMuz9KclOUI', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (597, 1, 'Ha7NQZikx6AM', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (598, 1, 'LJJyjRKbClfL', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (599, 1, 'G3jkZpsm9gFW', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (600, 1, 'iNYxPdc8pBEO', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (601, 1, '9Og8pAiSqX4o', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (602, 1, 'brPXIIQEHi4Z', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (603, 1, 'E4NXrX5tPDHY', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (604, 1, 'ouIB25v6IeIi', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (605, 1, 'iDViQad5XuWV', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (606, 1, 'gS6hlX3nKcLc', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (607, 1, 'ViiTmg8C15h4', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (608, 1, 'wBFUK0RzaeF0', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (609, 1, 'aFNG9olO1fhF', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (610, 1, 'HDpoaLoYeX9g', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (611, 1, '96dd5HoovBau', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (612, 1, 'ONTmqDZTjMyF', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (613, 1, 'cbYDvbK8KiCS', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (614, 1, 'q9GvGyOjjgF6', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (615, 1, 'EKDKVOEZjdXt', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (616, 1, 'CqKustlbFDKO', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (617, 1, '1mb6vFAQndtF', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (618, 1, 'lkAezjHYX9r0', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (619, 1, '2obIp8t4L5u3', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (620, 1, 'dweCXvsDkQbb', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (621, 1, 'ey5XM0RIxBFF', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (622, 1, '4Dro6KwnGSxw', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (623, 1, 'Nz44MjZ9bVn0', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (624, 1, 'aSuaT3kxSN0a', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (625, 1, 'HL2Fx6zOqLLm', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (626, 1, '6QMLN9WtmFc6', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (627, 1, 'AOf8bAZNDkL4', 0);
INSERT INTO `m_sys_funcsecurity` VALUES (628, 1, 'cD4mHIJ307MU', 0);

-- ----------------------------
-- Table structure for title
-- ----------------------------
DROP TABLE IF EXISTS `title`;
CREATE TABLE `title`  (
  `titleId` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `titleName` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `EX1` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `EX2` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `EX3` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  PRIMARY KEY (`titleId`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of title
-- ----------------------------
INSERT INTO `title` VALUES ('1', '管理员', '', '', '');
INSERT INTO `title` VALUES ('16', '总经理', '', '', '');
INSERT INTO `title` VALUES ('17', '前台', '', '', '');
INSERT INTO `title` VALUES ('18', '工作人员', '', '', '');
INSERT INTO `title` VALUES ('23', '管理员', '', '', '');

-- ----------------------------
-- Table structure for userclassinfo
-- ----------------------------
DROP TABLE IF EXISTS `userclassinfo`;
CREATE TABLE `userclassinfo`  (
  `UserClassID` int(11) NOT NULL AUTO_INCREMENT,
  `UserClassName` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `ClassNotes` longtext CHARACTER SET utf8 COLLATE utf8_general_ci,
  PRIMARY KEY (`UserClassID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of userclassinfo
-- ----------------------------
INSERT INTO `userclassinfo` VALUES (1, '管理员', '3');
INSERT INTO `userclassinfo` VALUES (2, '普通用户', '2');
INSERT INTO `userclassinfo` VALUES (3, '前台', '1');

-- ----------------------------
-- Table structure for userinfo
-- ----------------------------
DROP TABLE IF EXISTS `userinfo`;
CREATE TABLE `userinfo`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `realname` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `username` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `pwd` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `isdelete` int(11) DEFAULT NULL,
  `sex` int(11) DEFAULT NULL,
  `unitid` int(11) DEFAULT NULL,
  `titleid` int(11) DEFAULT NULL,
  `groupid` int(11) DEFAULT NULL,
  `birthday` datetime DEFAULT NULL,
  `idcard` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `address` varchar(250) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 13 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of userinfo
-- ----------------------------
INSERT INTO `userinfo` VALUES (1, '管理员', 'admin', 'admin', 0, 0, 146, 1, 1, NULL, NULL, NULL);
INSERT INTO `userinfo` VALUES (6, '张三', 'user', 'user', 0, 0, 147, NULL, 2, NULL, NULL, NULL);
INSERT INTO `userinfo` VALUES (7, '李四', 'zhangsan', 'zhangsan', 0, 0, 146, NULL, 1, NULL, NULL, NULL);

SET FOREIGN_KEY_CHECKS = 1;
