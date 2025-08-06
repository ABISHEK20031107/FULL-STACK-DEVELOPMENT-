
CREATE DATABASE company_dbdabi;


USE company_dbdabi;


CREATE TABLE departments (
    dept_id INT PRIMARY KEY,
    dept_name VARCHAR(50)
);


CREATE TABLE employees (
    emp_id INT PRIMARY KEY,
    emp_name VARCHAR(50),
    dept_id INT,
    FOREIGN KEY (dept_id) REFERENCES departments(dept_id)
);


INSERT INTO departments (dept_id, dept_name) VALUES
(1, 'HR'),
(2, 'Finance'),
(3, 'IT');

INSERT INTO employees (emp_id, emp_name, dept_id) VALUES
(101, 'Alice', 1),
(102, 'Bob', 2),
(103, 'Charlie', 3),
(104, 'David', 1),
(105, 'Eva', 2),
(106, 'Frank', 1);


SELECT 
    d.dept_name,
    COUNT(e.emp_id) AS employee_count
FROM 
    departments d
LEFT JOIN 
    employees e
ON 
    d.dept_id = e.dept_id
GROUP BY 
    d.dept_name;