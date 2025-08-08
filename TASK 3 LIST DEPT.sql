CREATE DATABASE company_dbt3;
USE company_dbt3;

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
(3, 'Finance');

INSERT INTO employees (emp_id, name, dept_id) VALUES
(101, 'Alice', 1),
(102, 'Bob', 1),
(103, 'Charlie', 2),
(104, 'David', NULL),  
(105, 'Eva', 3),
(106, 'Frank', NULL);  

SELECT 
    e.name AS employee_name,
    d.dept_name
FROM 
    employees e
LEFT JOIN 
    departments d ON e.dept_id = d.dept_id;
