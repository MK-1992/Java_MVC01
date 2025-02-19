-- member(회원) table
create table member(
num int primary key auto_increment,
id varchar(20) not null,
pass varchar(20) not null,
name varchar(30) not null,
age int not null,
email varchar(30) not null,
phone varchar(30) not null,
unique key(id)
);
-- SQL (CRUD), JDBC
select * from member;
insert into member(id,pass,name,age,email,phone)
values('admin','admin','관리자',40,'bit@naver.com','010-1234-1234')

update member set age=45,phone='010-1212-1212' where id='admin';

drop table member;