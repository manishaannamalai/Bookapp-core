create table orders(id  int primary key auto_increment,
user_id int ,
foreign key(user_id) references users(id),
book_id int ,
foreign key(book_id) references book(id),
status varchar(20) not null default 'ordered',
quantity varchar(20),
order_date timestamp not null default current_timestamp);
insert into orders (user_id,book_id,quantity)values(1,1,2); 
insert into orders (user_id,book_id,quantity)values(2,3,1); 
insert into orders (user_id,book_id,quantity)values(5,1,3); 
select * from orders;