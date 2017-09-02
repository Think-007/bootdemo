SET SESSION FOREIGN_KEY_CHECKS=0;

/* Drop Tables */

DROP TABLE IF EXISTS class;
DROP TABLE IF EXISTS teacher;




/* Create Tables */

-- 班级信息
CREATE TABLE class
(
	id bigint(20) NOT NULL,
	classid int,
	PRIMARY KEY (id)
) COMMENT = '班级信息';


-- 教师信息表
CREATE TABLE teacher
(
	id bigint NOT NULL,
	name varchar(20),
	classid int(10),
	PRIMARY KEY (id)
) COMMENT = '教师信息表';



