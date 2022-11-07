use capstone;

CREATE TABLE customer (
acc_num int auto_increment primary key,
first_name varchar(50),
last_name varchar(50),
address varchar(50)
);

ALTER TABLE CUSTOMER auto_increment = 1000;

INSERT INTO CUSTOMER (
FIRST_NAME,LAST_NAME,ADDRESS) VALUES ("Rabeea","Saber","226 Rogers Street");

select * from customer;