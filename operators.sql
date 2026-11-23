SELECT DATABASE();

USE XYZ ;

# Arithmetic operators  + - * / %
SELECT * 
FROM employee
WHERE salary+1000<50000;

#Comparision operators = <  > <= >= 
 SELECT *
 FROM employee
 WHERE salary=50000;

# logical operators  AND OR NOT LIKE ANY ALL BETWEEN IN

 SELECT *
 FROM employee
 WHERE salary =50000 AND department="Research";

 SELECT *
 FROM employee
 WHERE salary =50000 OR department="HR";

 SELECT *
 FROM employee
 WHERE name LIKE"Zara Khan";

 SELECT *
 FROM employee
 where salary between 50000 and 70000;

  SELECT *
  from employee
  where city not in ("Lahore","Sialkot");

#LIMIT CLAUSE
    SELECT * 
    FROM employee
    LIMIT 5;  

# asc and desc order of data 
SELECT *
FROM employee
ORDER BY salary ASC ;

SELECT *
FROM employee
ORDER BY name DESC ;






