CREATE TABLE `dm_chatmsg` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键序列',
  `type` varchar(30) DEFAULT NULL COMMENT '消息类型',
  `rid` int(11) DEFAULT NULL COMMENT '房间id',
  `ct` int(11) DEFAULT NULL,
  `uid` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '发送人id',
  `nn` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT 'nickname',
  `txt` varchar(255) DEFAULT NULL,
  `cid` varchar(100) DEFAULT NULL COMMENT '弹幕唯一id',
  `level` int(11) DEFAULT NULL COMMENT '用户等级',
  `sahf` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '扩展',
  `cst` varchar(255) DEFAULT NULL,
  `bnn` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '徽章昵称',
  `bl` int(11) DEFAULT NULL COMMENT '徽章等级',
  `brid` int(30) DEFAULT NULL COMMENT '徽章房间id',
  `hc` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '徽章信息校验码',
  `createDate` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;