CREATE DATABASE company_dbs;
USE company_dbs;

CREATE TABLE departments (
    dept_id INT PRIMARY KEY,
    dept_name VARCHAR(100)
);

-- 3. Create the 'employees' table
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
(4, 'Marketing');  -- This one will have no employees


INSERT INTO employees (emp_id, name, dept_id) VALUES
(101, 'Alice', 1),
(102, 'Bob', 1),
(103, 'Charlie', 2),
(104, 'David', 2),
(105, 'Eva', 3);

SELECT 
    d.dept_name,
    e.name AS employee_name
FROM 
    departments d
LEFT JOIN 
    employees e ON d.dept_id = e.dept_id;