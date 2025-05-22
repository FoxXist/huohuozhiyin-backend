-- 插入测试数据
INSERT INTO `fox_club_schedule` (
    `club_id`, `game_type`, `team_count`, `total_players`, `registered_players`, `waiting_players`,
    `address`, `name`, `start_time`, `end_time`, `creator_id`, `description`, `notice_id`,
    `status`, `venue`, `fee`, `level`, `need_referee`, `need_medical`, `need_insurance`,
    `registration_deadline`
) VALUES
-- 五人制养生局
(1, 1, 4, 20, 15, 2,
 '浙江省杭州市西湖区文三路100号', '周末养生五人制足球赛',
 DATE_ADD(NOW(), INTERVAL 7 DAY),
 DATE_ADD(DATE_ADD(NOW(), INTERVAL 7 DAY), INTERVAL 2 HOUR),
 1, '周末养生局，欢迎各位球友参加！', 1,
 0, '西湖体育中心五人制足球场', 50, 1, 0, 0, 0,
 DATE_ADD(NOW(), INTERVAL 5 DAY)),

-- 七人制锻炼局
(1, 3, 6, 42, 35, 5,
 '浙江省杭州市滨江区滨盛路1500号', '滨江七人制足球联赛',
 DATE_ADD(NOW(), INTERVAL 14 DAY),
 DATE_ADD(DATE_ADD(NOW(), INTERVAL 14 DAY), INTERVAL 3 HOUR),
 1, '滨江区七人制足球联赛，每周一场，欢迎报名！', 2,
 0, '滨江体育公园七人制足球场', 80, 2, 1, 1, 1,
 DATE_ADD(NOW(), INTERVAL 12 DAY)),

-- 十一人制激情局
(1, 5, 8, 88, 88, 0,
 '浙江省杭州市拱墅区体育场路200号', '杭州市业余足球联赛',
 DATE_ADD(NOW(), INTERVAL 30 DAY),
 DATE_ADD(DATE_ADD(NOW(), INTERVAL 30 DAY), INTERVAL 4 HOUR),
 1, '杭州市业余足球联赛，专业裁判，医疗保障，欢迎各支球队报名！', 3,
 0, '杭州市体育中心主体育场', 100, 3, 1, 1, 1,
 DATE_ADD(NOW(), INTERVAL 25 DAY)),

-- 八人制锻炼局（进行中）
(1, 4, 6, 48, 48, 0,
 '浙江省杭州市江干区钱江新城体育公园', '钱江新城八人制足球赛',
 DATE_ADD(NOW(), INTERVAL -1 DAY),
 DATE_ADD(DATE_ADD(NOW(), INTERVAL -1 DAY), INTERVAL 3 HOUR),
 1, '钱江新城八人制足球赛，每周一场，欢迎报名！', 4,
 1, '钱江新城体育公园八人制足球场', 70, 2, 1, 0, 1,
 DATE_ADD(NOW(), INTERVAL -3 DAY)),

-- 六人制养生局（已过期）
(1, 2, 4, 24, 20, 0,
 '浙江省杭州市上城区体育中心', '上城区六人制友谊赛',
 DATE_ADD(NOW(), INTERVAL -7 DAY),
 DATE_ADD(DATE_ADD(NOW(), INTERVAL -7 DAY), INTERVAL 2 HOUR),
 1, '上城区六人制友谊赛，欢迎各位球友参加！', 5,
 2, '上城区体育中心六人制足球场', 60, 1, 0, 0, 0,
 DATE_ADD(NOW(), INTERVAL -9 DAY));