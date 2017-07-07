create database bookapp_db;
use bookapp_db;
create table users(id int primary key auto_increment, 
name varchar(30)  not null,
email varchar(30) not null,
password varchar(30) not null); 
insert into users values(1,'manisha','manisha@gmail.com','asdf');
select * from users;
insert into users values(2,'manisha','manish@gmail.com','adf');
delete from users where name='manish';
update users set name='manish' where id=2; 