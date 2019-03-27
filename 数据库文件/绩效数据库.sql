/*
SQLyog Ultimate v11.33 (64 bit)
MySQL - 6.0.11-alpha-community : Database - performance
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`performance` /*!40100 DEFAULT CHARACTER SET utf8mb3 */;

USE `performance`;

/*Table structure for table `applicationattachdoc` */

DROP TABLE IF EXISTS `applicationattachdoc`;

CREATE TABLE `applicationattachdoc` (
  `id` int(10) NOT NULL,
  `projectId` varchar(100) DEFAULT NULL,
  `attachdoc` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

/*Data for the table `applicationattachdoc` */

/*Table structure for table `currentyear` */

DROP TABLE IF EXISTS `currentyear`;

CREATE TABLE `currentyear` (
  `projectYear` varchar(100) NOT NULL,
  `startTime` datetime DEFAULT NULL,
  `endTime` datetime DEFAULT NULL,
  PRIMARY KEY (`projectYear`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

/*Data for the table `currentyear` */

/*Table structure for table `item` */

DROP TABLE IF EXISTS `item`;

CREATE TABLE `item` (
  `itemId` int(11) NOT NULL,
  `itemName` varchar(100) DEFAULT NULL,
  `createTime` varchar(100) DEFAULT NULL,
  `creator` varchar(10) DEFAULT NULL,
  `isUsed` varchar(100) DEFAULT NULL,
  `parent_ItemId` int(11) DEFAULT NULL,
  PRIMARY KEY (`itemId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

/*Data for the table `item` */

/*Table structure for table `project` */

DROP TABLE IF EXISTS `project`;

CREATE TABLE `project` (
  `id` int(100) NOT NULL AUTO_INCREMENT,
  `submitter` varchar(100) DEFAULT NULL,
  `name` varchar(100) DEFAULT NULL,
  `projectYear` varchar(100) DEFAULT NULL,
  `jobDescription` varchar(100) DEFAULT NULL,
  `startTime` datetime DEFAULT NULL,
  `endTime` datetime DEFAULT NULL,
  `createTime` datetime DEFAULT NULL,
  `itemId` varchar(100) DEFAULT NULL,
  `num` int(10) DEFAULT NULL,
  `status` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

/*Data for the table `project` */

/*Table structure for table `projectmember` */

DROP TABLE IF EXISTS `projectmember`;

CREATE TABLE `projectmember` (
  `projectId` varchar(100) NOT NULL,
  `teacherId` varchar(100) NOT NULL,
  `score` double DEFAULT NULL,
  `createTime` varchar(100) DEFAULT NULL,
  `creator` varchar(10) DEFAULT NULL,
  `jobDescription` varchar(100) DEFAULT NULL,
  `orderId` int(10) DEFAULT NULL,
  PRIMARY KEY (`projectId`,`teacherId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

/*Data for the table `projectmember` */

/*Table structure for table `projectrefuse` */

DROP TABLE IF EXISTS `projectrefuse`;

CREATE TABLE `projectrefuse` (
  `id` int(10) NOT NULL,
  `projectId` varchar(100) DEFAULT NULL,
  `reason` varchar(100) DEFAULT NULL,
  `createTime` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

/*Data for the table `projectrefuse` */

/*Table structure for table `publicity` */

DROP TABLE IF EXISTS `publicity`;

CREATE TABLE `publicity` (
  `projectYear` varchar(100) NOT NULL,
  `startTime` datetime DEFAULT NULL,
  `endTime` datetime DEFAULT NULL,
  PRIMARY KEY (`projectYear`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

/*Data for the table `publicity` */

/*Table structure for table `teacher` */

DROP TABLE IF EXISTS `teacher`;

CREATE TABLE `teacher` (
  `tId` varchar(100) NOT NULL,
  `tName` varchar(100) DEFAULT NULL,
  `passwd` varchar(100) DEFAULT NULL,
  `administrators` int(11) DEFAULT NULL,
  `aprt` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`tId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

/*Data for the table `teacher` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
