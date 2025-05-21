-- 插入姆巴佩的球员基本信息
INSERT INTO `fox_player` (
    `user_id`,
    `name`,
    `english_name`,
    `age`,
    `birth_date`,
    `height`,
    `weight`,
    `preferred_foot`,
    `position`,
    `specific_position`,
    `jersey_number`,
    `club`,
    `market_value`,
    `region`,
    `city`,
    `local_fame`,
    `status`
) VALUES (
    2, -- user_id
    '基利安·姆巴佩',
    'Kylian Mbappé',
    25,
    '1998-12-20',
    178, -- 身高178cm
    73, -- 体重73kg
    2, -- 右脚
    'FW',
    '左边锋',
    '7',
    '巴黎圣日耳曼',
    180000000.00, -- 1.8亿欧元
    '法兰西岛',
    '巴黎',
    5, -- 最高名气
    1 -- 正常状态
);

-- 插入姆巴佩的能力值信息
INSERT INTO `fox_player_ability` (
    `player_id`,
    `enchantment`,
    `offensive_panel`,
    `defensive_panel`,
    `overall_rating`,
    `speed`,
    `strength`,
    `shooting`,
    `defending`,
    `dribbling`,
    `passing`,
    `weak_foot`,
    `skill_moves`,
    `futsal_rating`,
    `football_rating`,
    `stamina`,
    `reactions`,
    `balance`,
    `jumping`,
    `heading`
) VALUES (
    1, -- 假设player_id为1
    '闪电速度', -- 天赋
    '进攻核心', -- 进攻面板
    '边路防守', -- 防守面板
    91, -- 综合能力值
    99, -- 速度
    78, -- 力量
    89, -- 射门
    45, -- 防守
    92, -- 盘带
    85, -- 传球
    85, -- 逆足能力
    95, -- 花式技巧
    93, -- 五人制能力
    91, -- 11人制能力
    90, -- 体能
    95, -- 反应
    88, -- 平衡
    85, -- 弹跳
    82  -- 头球
); 