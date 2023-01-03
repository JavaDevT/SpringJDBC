create table userEmp (PersonID int not null AUTO_INCREMENT PRIMARY KEY ,Passwords varchar(100),
LastName varchar(200),FirstName varchar(200),Address varchar(200),age tinyint)
 insert into userEmp (Passwords,LastName,FirstName,Address,age)values ('Thavam','Thavam','Thavam','Thavam',25)
select * from  userEmp
select * from userEmp where FirstName = thavam and Passwords = thavam

select * from userEmp where FirstName = 'thavam' and Passwords = 'thavam'

select * from userEmp where FirstName = 'thavam' and Passwords = 'thavam'