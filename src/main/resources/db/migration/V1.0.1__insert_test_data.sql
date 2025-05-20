-- 插入测试数据
INSERT INTO `fox_user` (
    `open_id`, `union_id`, `nickname`, `avatar_url`, `gender`, 
    `phone`, `is_player`, `player_number`, `player_position`, 
    `status`, `competence`, `last_login_time`
) VALUES 
-- 哈兰德 (曼城前锋)
('wx_openid_001', 'wx_unionid_001', 'Erling Haaland', 'https://example.com/avatars/haaland.jpg', 1,
'13800138001', 1, '9', 'FW', 1, 1, NOW()),

-- 姆巴佩 (巴黎圣日耳曼前锋)
('wx_openid_002', 'wx_unionid_002', 'Kylian Mbappé', 'https://example.com/avatars/mbappe.jpg', 1,
'13800138002', 1, '7', 'FW', 1, 1, NOW()),

-- 德布劳内 (曼城中场)
('wx_openid_003', 'wx_unionid_003', 'Kevin De Bruyne', 'https://example.com/avatars/debruyne.jpg', 1,
'13800138003', 1, '17', 'MF', 1, 1, NOW()),

-- 贝林厄姆 (皇马中场)
('wx_openid_004', 'wx_unionid_004', 'Jude Bellingham', 'https://example.com/avatars/bellingham.jpg', 1,
'13800138004', 1, '5', 'MF', 1, 1, NOW()),

-- 范戴克 (利物浦后卫)
('wx_openid_005', 'wx_unionid_005', 'Virgil van Dijk', 'https://example.com/avatars/vandijk.jpg', 1,
'13800138005', 1, '4', 'DF', 1, 1, NOW()),

-- 库尔图瓦 (皇马门将)
('wx_openid_006', 'wx_unionid_006', 'Thibaut Courtois', 'https://example.com/avatars/courtois.jpg', 1,
'13800138006', 1, '1', 'GK', 1, 1, NOW()),

-- 普通用户示例
('wx_openid_007', 'wx_unionid_007', '足球爱好者', 'https://example.com/avatars/fan1.jpg', 1,
'13800138007', 0, NULL, NULL, 1, 2, NOW()),

-- 访客用户示例
('wx_openid_008', 'wx_unionid_008', '新球迷', 'https://example.com/avatars/fan2.jpg', 0,
NULL, 0, NULL, NULL, 1, 0, NOW()),

-- 已禁用用户示例
('wx_openid_009', 'wx_unionid_009', '违规用户', 'https://example.com/avatars/banned.jpg', 1,
'13800138009', 0, NULL, NULL, 0, 0, NOW()),

-- 女球迷示例
('wx_openid_010', 'wx_unionid_010', '足球迷妹', 'https://example.com/avatars/fan3.jpg', 2,
'13800138010', 0, NULL, NULL, 1, 2, NOW()); 