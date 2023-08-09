CREATE TABLE "teacher"(
"id" int NOT NULL PRIMARY KEY,
"name" varchar(256) NOT NULL,
"last_name" varchar(256) NOT NULL
);
create table "course"(
"id" int not null primary key,
"title" varchar(256) not null,
"teacher_id" int default null,
constraint "FK_TEACHER" foreign key ("teacher_id")
references "teacher"("id")
);
create table "student"(
"id" int not null primary key,
"first_name" varchar(256) not null,
"last_name" varchar(256) not null
);
create table "course_student"(
"course_id" int not null,
"student_id" int not null,
primary key("course_id","student_id"),
constraint "FK_COURSE" foreign key("course_id")
references "course"("id"),
constraint "FK_STUDENT" foreign key("student_id")
references "student"("id")
);