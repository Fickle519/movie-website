-- You do not have to use this sql file if using Spark.

create database movie_db default character set='utf8';
use movie_db;

create table user(
	userID int primary key,
    gender varchar(2),
    age int,
    occupation int,
    zipCode varchar(15)
);


create table tag(
	userID int,
    movieID int,
    tag varchar(255),
    time varchar(15)
);


create table rating
(
	userID int,
    movieID int,
    score float,
    time varchar(15)

)