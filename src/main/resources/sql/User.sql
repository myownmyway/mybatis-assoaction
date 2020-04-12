create table if not exists `user`
(
    id         int(11)     not null auto_increment comment '主键',
    name       varchar(50) not null comment '姓名',
    company_id int(11)     not null comment '公司id',
    primary key (`id`)
) engine = InnoDB
  DEFAULT CHARSET = utf8;