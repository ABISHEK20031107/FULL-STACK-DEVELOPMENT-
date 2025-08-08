CREATE DATABASE company_dbtask1l;
USE company_dbtask1l;


CREATE TABLE departments (
    dept_id INT PRIMARY KEY,
    dept_name VARCHAR(100)
);


CREATE TABLE employees (
    emp_id INT PRIMARY KEY,
    name VARCHAR(100),
    dept_id INT,
    FOREIGN KEY (dept_id) REFERENCES departments(dept_id)
);


INSERT INTO departments (dept_id, dept_name) VALUES
(1, 'HR'),
(2, 'IT'),
(3, 'Finance'),
(4, 'Marketing');

INSERT INTO employees (emp_id, name, dept_id) VALUES
(101, 'yuvan', 1),
(102, 'sri', 1),
(103, 'vishal', 2),
(104, 'sibi', 2),
(105, 'ajay', NULL); 


SELECT 
    d.dept_name,
    e.name AS employee_name
FROM 
    departments d
LEFT JOIN 
    employees e ON d.dept_id = e.dept_id;