create table if not exists `account`
(
    id      int(11)      not null auto_increment comment '主键',
    name    varchar(200) not null comment '账户名称',
    user_id int(11)      not null comment '用户id',
    primary key (`id`)
) engine = InnoDB
  DEFAULT CHARSET = utf8;