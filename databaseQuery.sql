CREATE TABLE records(
    id int(11) ,
    fname varchar(255),
    lname varchar(255),
    city varchar(255),
    phone int(11),
    Salary int(11)
);

CREATE TABLE canddetails (
    candId int NOT NULL AUTO_INCREMENT,
    address varchar(255),
    education varchar(255),
    skills varchar(255), 
    id int,
    PRIMARY KEY (candId),
    FOREIGN KEY (id) REFERENCES records(id)
);