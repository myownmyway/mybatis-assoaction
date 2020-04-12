create table if not exists `company`
(
    id   int(11)      not null auto_increment comment '主键',
    name varchar(200) not null comment '公司名称',
    primary key (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;