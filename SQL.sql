create database empresas
default collate utf8_general_ci
default charset utf8

create table empresa(
id int auto_increment primary key,
nm_empresa varchar(200)
);
select * from empresa;
insert into empresa values (default,'Amazon');
insert into empresa values (default,'Google');
insert into empresa values (default,'Netflix');



