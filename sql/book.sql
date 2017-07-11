create table book(id int primary key auto_increment,
name varchar(30) not null,
price int not null,
published_date date not null);
insert into book(name,price,published_date) values('c',500,'2018-05-15');
insert into book(name,price,published_date) values('c++',50,'2016-05-11');
insert into book (name,price,published_date)values('java',850,'2017-08-17');
select* from book;
delete from book where name='c';
update book set name='c' where price=50; 