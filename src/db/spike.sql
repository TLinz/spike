CREATE TABLE `t_user` (
  `id` bigint PRIMARY KEY COMMENT 'user id(phone number)',
  `name` varchar(255) NOT NULL,
  `password` varchar(32) DEFAULT null COMMENT 'MD5(MD5(pswd+salt)+salt)',
  `salt` varchar(10) DEFAULT null,
  `avatar` varchar(128) DEFAULT null,
  `register_date` datetime DEFAULT null,
  `last_login_date` datetime DEFAULT null,
  `login_count` int(11) DEFAULT 0
);
