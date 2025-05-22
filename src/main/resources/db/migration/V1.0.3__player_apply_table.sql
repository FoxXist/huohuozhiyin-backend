CREATE TABLE `fox_player_apply` (
                                    `id` BIGINT AUTO_INCREMENT PRIMARY KEY COMMENT '主键ID',
                                    `user_id` BIGINT COMMENT '申请人用户ID',
                                    `name` VARCHAR(64) COMMENT '申请人姓名',
                                    `phone` VARCHAR(20) COMMENT '申请人手机号',
                                    `age` INT COMMENT '申请人年龄',
                                    `height` INT COMMENT '申请人身高(cm)',
                                    `weight` INT COMMENT '申请人体重(kg)',
                                    `region` VARCHAR(64) COMMENT '申请人地区',
                                    `city` VARCHAR(64) COMMENT '申请人城市',
                                    `position` VARCHAR(64) COMMENT '申请人位置',
                                    `jersey_number` VARCHAR(16) COMMENT '申请人球衣号码',
                                    `status` TINYINT COMMENT '申请状态（0：待审核，1：已通过，2：已拒绝）',
                                    `reviewer_id` BIGINT COMMENT '审核人ID',
                                    `review_time` DATETIME COMMENT '审核时间',
                                    `review_remark` TEXT COMMENT '审核备注',
                                    `create_time` DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '申请时间',
                                    `update_time` DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
                                    `is_deleted` TINYINT DEFAULT 0 COMMENT '是否删除（0：未删除，1：已删除）'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='球员入队申请表';

-- 插入待审核的申请
INSERT INTO `fox_player_apply`
(`user_id`, `name`, `phone`, `age`, `height`, `weight`, `region`, `city`, `position`, `jersey_number`, `status`, `create_time`)
VALUES
    (1001, '张三', '13800138001', 25, 180, 75, '浙江省', '杭州市', '前锋', '10', 0, NOW()),
    (1002, '李四', '13800138002', 23, 175, 70, '浙江省', '宁波市', '中场', '8', 0, NOW()),
    (1003, '王五', '13800138003', 28, 185, 80, '江苏省', '南京市', '后卫', '4', 0, NOW());

-- 插入已通过的申请
INSERT INTO `fox_player_apply`
(`user_id`, `name`, `phone`, `age`, `height`, `weight`, `region`, `city`, `position`, `jersey_number`, `status`, `reviewer_id`, `review_time`, `review_remark`, `create_time`)
VALUES
    (1004, '赵六', '13800138004', 26, 178, 72, '浙江省', '温州市', '门将', '1', 1, 1, DATE_SUB(NOW(), INTERVAL 2 DAY), '技术全面，经验丰富', DATE_SUB(NOW(), INTERVAL 3 DAY)),
    (1005, '钱七', '13800138005', 24, 182, 78, '江苏省', '苏州市', '前锋', '11', 1, 1, DATE_SUB(NOW(), INTERVAL 1 DAY), '身体素质好，速度快', DATE_SUB(NOW(), INTERVAL 2 DAY));

-- 插入已拒绝的申请
INSERT INTO `fox_player_apply`
(`user_id`, `name`, `phone`, `age`, `height`, `weight`, `region`, `city`, `position`, `jersey_number`, `status`, `reviewer_id`, `review_time`, `review_remark`, `create_time`)
VALUES
    (1006, '孙八', '13800138006', 22, 170, 65, '浙江省', '嘉兴市', '中场', '6', 2, 1, DATE_SUB(NOW(), INTERVAL 3 DAY), '技术有待提高', DATE_SUB(NOW(), INTERVAL 4 DAY)),
    (1007, '周九', '13800138007', 30, 188, 85, '江苏省', '无锡市', '后卫', '5', 2, 1, DATE_SUB(NOW(), INTERVAL 1 DAY), '年龄偏大，不符合要求', DATE_SUB(NOW(), INTERVAL 2 DAY));

-- 插入一些特殊情况的申请
INSERT INTO `fox_player_apply`
(`user_id`, `name`, `phone`, `age`, `height`, `weight`, `region`, `city`, `position`, `jersey_number`, `status`, `reviewer_id`, `review_time`, `review_remark`, `create_time`)
VALUES
    (1008, '吴十', '13800138008', 20, 190, 82, '浙江省', '金华市', '前锋', '9', 0, NULL, NULL, NULL, NOW()),
    (1009, '郑十一', '13800138009', 27, 176, 71, '江苏省', '常州市', '中场', '7', 1, 1, DATE_SUB(NOW(), INTERVAL 5 DAY), '技术细腻，团队意识强', DATE_SUB(NOW(), INTERVAL 6 DAY)),
    (1010, '王十二', '13800138010', 29, 183, 79, '浙江省', '台州市', '后卫', '3', 2, 1, DATE_SUB(NOW(), INTERVAL 4 DAY), '位置已满', DATE_SUB(NOW(), INTERVAL 5 DAY));