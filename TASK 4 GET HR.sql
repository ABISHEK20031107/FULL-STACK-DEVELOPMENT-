
CREATE DATABASE company_db44;


USE company_db44;


CREATE TABLE departments (
    dept_id INT PRIMARY KEY,
    dept_name VARCHAR(50)
);


CREATE TABLE employees (
    emp_id INT PRIMARY KEY,
    emp_name VARCHAR(50),
    salary DECIMAL(10,2),
    dept_id INT,
    FOREIGN KEY (dept_id) REFERENCES departments(dept_id)
);


INSERT INTO departments (dept_id, dept_name) VALUES
(1, 'HR'),
(2, 'Finance'),
(3, 'IT');

INSERT INTO employees (emp_id, emp_name, salary, dept_id) VALUES
(101, 'Alice', 50000, 1),
(102, 'Bob', 55000, 2),
(103, 'Charlie', 60000, 3),
(104, 'David', 52000, 1),
(105, 'Eva', 58000, 2);


SELECT 
    e.emp_id,
    e.emp_name,
    e.salary,
    d.dept_name
FROM 
    employees e
INNER JOIN 
    departments d
ON 
    e.dept_id = d.dept_id
WHERE 
    d.dept_name = 'HR';
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    