-- MySQL dump 10.15  Distrib 10.0.19-MariaDB, for Linux (x86_64)
--
-- Host: 127.0.0.1    Database: workflow
-- ------------------------------------------------------
-- Server version	10.0.19-MariaDB-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `approve_log`
--

DROP TABLE IF EXISTS `approve_log`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `approve_log` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `workflow_id` int(11) NOT NULL,
  `status` tinyint(4) NOT NULL,
  `description` varchar(100) DEFAULT NULL COMMENT '拒绝理由',
  `user_code` varchar(20) NOT NULL,
  `user_name` varchar(20) NOT NULL,
  `flow_node` int(11) NOT NULL,
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8 COMMENT='审批日志';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `approve_log`
--

LOCK TABLES `approve_log` WRITE;
/*!40000 ALTER TABLE `approve_log` DISABLE KEYS */;
INSERT INTO `approve_log` VALUES (1,5,0,NULL,'vz110','陈海龙',5,'2015-07-16 02:53:16'),(2,5,0,NULL,'12345','12345',6,'2015-07-16 02:55:07'),(3,5,0,NULL,'v9','37740048@qq.com',7,'2015-07-16 02:56:16'),(4,5,0,NULL,'vz236','CFO',10,'2015-07-16 02:56:43'),(5,5,0,NULL,'vz110','陈海龙',11,'2015-07-16 02:59:31'),(6,6,0,NULL,'vz110','陈海龙',13,'2015-07-16 06:44:57'),(7,6,0,NULL,'12345','12345',14,'2015-07-16 07:02:58'),(8,6,1,NULL,'37740048@qq.com','37740048@qq.com',18,'2015-07-16 07:10:16'),(9,6,0,NULL,'vz110','陈海龙',13,'2015-07-21 02:55:13'),(10,6,0,NULL,'12345','12345',14,'2015-07-21 03:48:41'),(11,6,0,NULL,'12345','12345',14,'2015-07-21 05:59:23'),(12,6,0,NULL,'v9','37740048@qq.com',18,'2015-07-21 06:02:40'),(13,15,0,NULL,'12345','12345',14,'2015-07-23 09:41:36');
/*!40000 ALTER TABLE `approve_log` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `flow_node`
--

DROP TABLE IF EXISTS `flow_node`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `flow_node` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `jobs_id` int(11) NOT NULL COMMENT '岗位id',
  `model_id` int(11) NOT NULL,
  `node_type` tinyint(4) NOT NULL DEFAULT '1' COMMENT '节点类型类型 0开始节点 1.任务节点 2.判断节点 3.结束 ',
  `flow_test` varchar(256) DEFAULT NULL,
  `next_sort` int(11) NOT NULL COMMENT '下一个节点排序',
  `sort` int(11) NOT NULL COMMENT '节点排序',
  `name` varchar(10) NOT NULL COMMENT '审批流节点名称',
  `description` varchar(200) NOT NULL COMMENT '审批流节点描述',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `update_time` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `status` tinyint(4) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8 COMMENT='审批流节点';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `flow_node`
--

LOCK TABLES `flow_node` WRITE;
/*!40000 ALTER TABLE `flow_node` DISABLE KEYS */;
INSERT INTO `flow_node` VALUES (5,1,5,1,NULL,2,1,'财务组长','财务组长','2015-07-15 02:45:41','0000-00-00 00:00:00',0),(6,2,5,1,NULL,3,2,'财务经理审批','财务经理审批','2015-07-15 02:46:27','0000-00-00 00:00:00',0),(7,3,5,1,NULL,4,3,'财务主管审批','财务主管审批','2015-07-15 02:47:06','0000-00-00 00:00:00',0),(10,4,5,1,NULL,5,4,'CFO审批','CFO审批','2015-07-15 02:48:56','0000-00-00 00:00:00',0),(11,7,5,1,NULL,6,5,'总裁审批','总裁审批','2015-07-15 02:53:05','0000-00-00 00:00:00',0),(12,0,5,3,NULL,0,6,'借款审批结束','借款审批结束','2015-07-15 02:52:53','0000-00-00 00:00:00',0),(13,1,6,1,NULL,2,1,'财务组长','财务组长','2015-07-16 04:00:59','0000-00-00 00:00:00',0),(14,2,6,1,NULL,3,2,'财务经理','财务经理','2015-07-16 05:32:48','0000-00-00 00:00:00',0),(15,0,6,2,'[{\"compareArrays\":[{\"name\":\"money\",\"type\":-1,\"value\":200000}],\"sort\":4},{\"compareArrays\":[{\"name\":\"money\",\"type\":2,\"value\":200000}],\"sort\":5}]',0,3,'判断','大于200000需要财务主管审批','2015-07-21 09:25:18','2015-07-21 09:25:18',0),(16,0,6,3,NULL,0,4,'结束','','2015-07-16 06:27:45','0000-00-00 00:00:00',0),(18,3,6,1,NULL,4,5,'财务主管审批','财务主管，三级','2015-07-16 06:32:58','0000-00-00 00:00:00',0),(19,8,11,1,'aa',2,1,'财务组长审批','财务组长审批','2015-07-28 03:50:35','0000-00-00 00:00:00',0),(20,10,11,1,NULL,3,2,'经理审批','111','2015-07-29 09:48:03','0000-00-00 00:00:00',0),(21,10,11,1,NULL,4,3,'23121312','sadads','2015-07-29 09:55:30','0000-00-00 00:00:00',0),(22,13,11,3,NULL,0,4,'23121312','sadads','2015-07-29 09:58:15','0000-00-00 00:00:00',0);
/*!40000 ALTER TABLE `flow_node` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `jobs`
--

DROP TABLE IF EXISTS `jobs`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `jobs` (
  `id` tinyint(4) NOT NULL AUTO_INCREMENT,
  `name` varchar(10) NOT NULL COMMENT '岗位名',
  `system_id` tinyint(4) DEFAULT NULL COMMENT '系统id',
  `description` varchar(50) DEFAULT NULL COMMENT '岗位描述',
  `status` tinyint(4) NOT NULL DEFAULT '0' COMMENT '0 可用 1不可用',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `update_time` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  PRIMARY KEY (`id`),
  UNIQUE KEY `system_id` (`system_id`,`name`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8 COMMENT='岗位';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jobs`
--

LOCK TABLES `jobs` WRITE;
/*!40000 ALTER TABLE `jobs` DISABLE KEYS */;
INSERT INTO `jobs` VALUES (1,'财务组长',7,'财务组长，一级',0,'2015-07-21 09:46:19','0000-00-00 00:00:00'),(2,'财务经理',7,'财务经理，二级',0,'2015-07-21 09:46:19','0000-00-00 00:00:00'),(3,'财务主管',7,'财务主管，三级',0,'2015-07-21 09:46:19','0000-00-00 00:00:00'),(4,'CFO',7,'首席财务官，最高级',0,'2015-07-21 09:46:19','0000-00-00 00:00:00'),(5,'审批1',7,'审批1',0,'2015-07-21 09:46:19','0000-00-00 00:00:00'),(6,'审批2',7,'审批2',0,'2015-07-21 09:46:19','0000-00-00 00:00:00'),(7,'总裁',7,'总裁',0,'2015-07-21 09:46:19','0000-00-00 00:00:00'),(8,'财务组长',8,'财务组长',0,'2015-07-27 03:58:25','0000-00-00 00:00:00'),(10,'财务经理',8,'财务经理，二级权限',0,'2015-07-27 03:59:31','0000-00-00 00:00:00'),(11,'财务主管',8,'财务主管，三级权限',0,'2015-07-27 03:59:53','0000-00-00 00:00:00'),(12,'财务总监',8,'财务总监，四级权限',0,'2015-07-27 04:00:44','0000-00-00 00:00:00'),(13,'测试1',8,'测试描述',0,'2015-07-29 03:55:49','0000-00-00 00:00:00'),(14,'312312',8,'312312',0,'2015-07-29 04:01:31','0000-00-00 00:00:00');
/*!40000 ALTER TABLE `jobs` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `jobs_user`
--

DROP TABLE IF EXISTS `jobs_user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `jobs_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `jobs_id` int(11) NOT NULL COMMENT '岗位id',
  `user_code` char(8) NOT NULL COMMENT '用户id',
  `user_name` varchar(20) NOT NULL COMMENT '用户名',
  `status` tinyint(4) NOT NULL DEFAULT '0' COMMENT '0 可用 1不可用',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `update_time` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `system_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `jobs_id` (`jobs_id`,`user_code`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8 COMMENT='岗位关联';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jobs_user`
--

LOCK TABLES `jobs_user` WRITE;
/*!40000 ALTER TABLE `jobs_user` DISABLE KEYS */;
INSERT INTO `jobs_user` VALUES (8,1,'vz110','陈海龙',0,'2015-07-22 08:36:34','0000-00-00 00:00:00',7),(9,1,'vzxt9999','系统',0,'2015-07-22 08:36:34','0000-00-00 00:00:00',7),(10,5,'vzxt9999','系统',0,'2015-07-22 08:36:34','0000-00-00 00:00:00',7),(11,6,'vzxt9999','系统',0,'2015-07-22 08:36:34','0000-00-00 00:00:00',7),(12,4,'vz236','杨书华',0,'2015-07-22 08:36:34','0000-00-00 00:00:00',7),(13,3,'v9','37740048@qq.com',0,'2015-07-22 08:36:34','0000-00-00 00:00:00',7),(14,2,'12345','12345',0,'2015-07-22 08:36:34','0000-00-00 00:00:00',7),(15,7,'vz110','陈海龙',0,'2015-07-22 08:36:34','0000-00-00 00:00:00',7),(16,8,'vz110','陈海龙',0,'2015-07-27 07:05:29','0000-00-00 00:00:00',8),(17,8,'vz222','123',0,'2015-07-29 06:21:20','0000-00-00 00:00:00',8),(18,12,'vz236','yangshuhua',0,'2015-07-30 01:17:59','0000-00-00 00:00:00',8);
/*!40000 ALTER TABLE `jobs_user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `workflow`
--

DROP TABLE IF EXISTS `workflow`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `workflow` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `busy_type_id` tinyint(4) NOT NULL COMMENT '业务类型id',
  `busy_type_name` varchar(12) DEFAULT NULL COMMENT '业务类型',
  `name` varchar(10) NOT NULL COMMENT '审批工作名',
  `system_id` tinyint(4) DEFAULT NULL COMMENT '系统id',
  `model_id` tinyint(4) NOT NULL,
  `money` decimal(12,2) DEFAULT NULL COMMENT '申请金额',
  `description` varchar(50) DEFAULT NULL COMMENT '审批工作描述',
  `jobs_id` int(11) NOT NULL COMMENT '待审批岗位id',
  `workflow_node` int(11) NOT NULL COMMENT '下一个审批节点',
  `status` tinyint(4) NOT NULL DEFAULT '0' COMMENT '0 未开始审批，可以编辑更改 1 正在审批，不可以编辑更改 2 审批结束，不可以编辑更改',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `update_time` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `json` varchar(200) DEFAULT NULL,
  `userCode` varchar(12) DEFAULT NULL,
  `user_code` varchar(20) DEFAULT NULL,
  `user_name` varchar(20) DEFAULT NULL,
  `work_flow_code` varchar(32) NOT NULL DEFAULT '',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8 COMMENT='审批流';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `workflow`
--

LOCK TABLES `workflow` WRITE;
/*!40000 ALTER TABLE `workflow` DISABLE KEYS */;
INSERT INTO `workflow` VALUES (5,0,'借款申请','借款申请',7,5,200011.00,'借款申请',0,0,2,'2015-07-23 06:46:57','2015-07-15 18:59:31',NULL,NULL,NULL,NULL,''),(6,1,'提现申请','提现申请',7,6,999999999.11,'提现申请',0,0,2,'2015-07-23 06:46:57','2015-07-21 06:02:37','{\"money\":\"200001.00\"}',NULL,NULL,NULL,''),(7,2,'测试提现申请','提现申请',7,6,NULL,'提现申请测试阿拉啦啦啦',1,13,0,'2015-07-23 06:46:57','0000-00-00 00:00:00','{\"money\":\"999912150.1\"}',NULL,NULL,NULL,''),(8,2,'测试提现申请','提现申请',7,6,NULL,'提现申请测试阿拉啦啦啦',0,0,2,'2015-07-23 06:46:57','0000-00-00 00:00:00','{\"money\":\"150.1\"}',NULL,NULL,NULL,''),(9,2,'提现审批','提现审批',7,6,NULL,NULL,2,14,1,'2015-07-23 08:29:31','0000-00-00 00:00:00',NULL,NULL,NULL,NULL,'a0044444312'),(10,2,'提现审批','提现审批',7,6,NULL,NULL,2,14,1,'2015-07-23 08:30:40','0000-00-00 00:00:00',NULL,NULL,NULL,NULL,'a00444443'),(11,2,'提现审批','提现审批',7,6,NULL,NULL,0,0,2,'2015-07-23 08:43:03','0000-00-00 00:00:00','{\"money\":\"123\"}',NULL,NULL,NULL,'b00444443'),(12,2,'提现审批','提现审批',7,6,NULL,NULL,0,0,2,'2015-07-23 09:17:27','0000-00-00 00:00:00','{\"money\":\"123\"}',NULL,NULL,NULL,'b004144443'),(13,2,'提现审批','提现审批',7,6,NULL,NULL,2,14,1,'2015-07-23 09:21:59','0000-00-00 00:00:00','{\"money\":\"123\"}',NULL,NULL,NULL,'b004144443'),(14,2,'提现审批','提现审批',7,6,NULL,NULL,0,0,2,'2015-07-23 09:22:15','0000-00-00 00:00:00','{\"money\":\"123\"}',NULL,NULL,NULL,'b004144443'),(15,2,'提现审批','提现审批',7,6,NULL,NULL,0,0,2,'2015-07-23 09:41:14','2015-07-23 09:41:14','{\"money\":\"123\"}',NULL,NULL,NULL,'b104144443');
/*!40000 ALTER TABLE `workflow` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `workflow_model`
--

DROP TABLE IF EXISTS `workflow_model`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `workflow_model` (
  `id` tinyint(4) NOT NULL AUTO_INCREMENT,
  `busy_type_id` tinyint(4) NOT NULL COMMENT '业务类型id',
  `name` varchar(10) NOT NULL COMMENT '审批流节点名称',
  `description` varchar(200) NOT NULL COMMENT '审批流节点描述',
  `system_id` tinyint(4) NOT NULL COMMENT '系统id',
  `model_text` text COMMENT '工作流模板',
  `status` tinyint(4) NOT NULL DEFAULT '0' COMMENT '0 可用 1不可用',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `update_time` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  PRIMARY KEY (`id`),
  UNIQUE KEY `system_id` (`system_id`,`busy_type_id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8 COMMENT='审批流模板';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `workflow_model`
--

LOCK TABLES `workflow_model` WRITE;
/*!40000 ALTER TABLE `workflow_model` DISABLE KEYS */;
INSERT INTO `workflow_model` VALUES (5,0,'借款审批','借款审批',7,'',1,'2015-07-29 10:09:45','2015-07-29 10:09:45'),(6,2,'提现审批','提现审批',7,'',1,'2015-07-29 02:22:13','0000-00-00 00:00:00'),(7,1,'借款审批','',8,'',1,'2015-07-30 01:47:42','2015-07-30 01:47:42'),(8,2,'提现审批','',8,'',1,'2015-07-30 01:47:43','2015-07-30 01:47:43'),(11,3,'还款审批','',8,'',0,'2015-07-30 02:23:47','2015-07-30 02:23:47'),(12,1,'23423','31231',0,NULL,1,'2015-07-29 06:03:13','0000-00-00 00:00:00'),(14,4,'还款审批','还款审批啦啦啦拉拉',8,NULL,0,'2015-07-30 01:49:25','2015-07-30 01:49:25');
/*!40000 ALTER TABLE `workflow_model` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `xf9_system`
--

DROP TABLE IF EXISTS `xf9_system`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `xf9_system` (
  `id` tinyint(4) NOT NULL AUTO_INCREMENT,
  `name` varchar(10) NOT NULL COMMENT '系统名称',
  `user_code` varchar(10) NOT NULL COMMENT '登录用户帐号',
  `user_name` varchar(10) NOT NULL COMMENT '用户名',
  `user_pwd` varchar(32) NOT NULL COMMENT '用户密码',
  `description` varchar(200) NOT NULL COMMENT '系统描述',
  `status` tinyint(4) NOT NULL DEFAULT '0' COMMENT '0 可用 1不可用',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `update_time` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `system_code` varchar(4) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `name` (`name`),
  UNIQUE KEY `user_code` (`user_code`),
  UNIQUE KEY `system_code` (`system_code`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8 COMMENT='系统名称';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `xf9_system`
--

LOCK TABLES `xf9_system` WRITE;
/*!40000 ALTER TABLE `xf9_system` DISABLE KEYS */;
INSERT INTO `xf9_system` VALUES (6,'系统','vz238','槑槑的呆瓜','32f5d5d135fde0c690083cc9ebd272b8','系统管理员',0,'2015-07-27 08:36:18','0000-00-00 00:00:00','sys'),(7,'财务系统','vz236','杨书华','342e4297359f2dd89a0f0481dd1f4b0b','财务系统',0,'2015-07-27 08:36:32','0000-00-00 00:00:00','fms1'),(8,'财务测试1','vz110','陈海龙','815a490c745f57833109dc6ddb33e63e','',0,'2015-07-29 01:11:23','0000-00-00 00:00:00','fms');
/*!40000 ALTER TABLE `xf9_system` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-07-30 10:33:14
