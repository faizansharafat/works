CREATE DATABASE uni;
#===========================
# error due to already exsts
CREATE  DATABASE uni; 
#===========================
CREATE DATABASE IF NOT EXISTS uni;
USE uni;
CREATE TABLE student_detail(
    ID INT PRIMARY KEY,
    Name VARCHAR(100),
    FatherName VARCHAR(100)
);
SHOW TABLES;
SHOW TABLE STATUS;
INSERT INTO student_detail VALUE(001,"Muhammad Faizan","sharafat Ali");
INSERT INTO student_detail VALUE(002,"Faran Sharafat","sharafat Ali");
SELECT * FROM student_detail;




