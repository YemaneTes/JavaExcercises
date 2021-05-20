DROP DATABASE IF EXISTS School;
CREATE DATABASE School;
USE School;


CREATE TABLE Students (
    StudentId int, 
	FirstName varchar(255) NULL,
    LastName varchar(255) NULL,
    Address varchar(255) NULL,
  PRIMARY KEY (StudentId)
);


CREATE TABLE Courses (
CourseId int, 
CourseName Varchar(200) NULL,
CourseCredit int NULL,
PRIMARY KEY (CourseId)
);

INSERT INTO Students 
VALUES 
(1, 'Amanuel', 'Hailu', 'marryland'),
(2, 'Hagos', 'Welday', 'Dallas'),
(3, 'Aster', 'Gebreselasie', 'Colorado'),
(4, 'Biniam', 'Werku', 'Washington DC'),
(5, 'Samuel', 'Hagos', 'New York');


INSERT INTO Courses 
VALUES
(1, 'Database', 3),
(2, 'Java', 4),
(3, 'Web Services', 4),
(4, 'MuleSoft', 5),
(5, 'Career Strategy', 2);



SELECT * FROM School.Students;
SELECT * FROM School.Courses;

SELECT * FROM Students
WHERE StudentId = 3;

SELECT * FROM School.Courses
WHERE CourseId = 3;

Select CourseName, CourseCredit
from Courses
Where  CourseCredit= 4;

UPDATE Students
Set Address = 'North Corolina'
Where StudentId = 4;

Delete From Courses
Where CourseName = 'Java';

DELETE FROM Students
            WHERE studentId = 4;
            
INSERT into Students (StudentId, FirstName, LastName, address)
Values (4, 'Biniam', 'Werku', 'Washington DC');
            
