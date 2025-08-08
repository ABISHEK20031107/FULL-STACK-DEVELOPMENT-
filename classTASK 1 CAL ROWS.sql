CREATE TABLE Productsti (
    product_id INT PRIMARY KEY,
    product_name VARCHAR(50),
    price DECIMAL(10,2)
);

INSERT INTO Productsti (product_id, product_name, price) VALUES
(1, 'Pen', 2),
(2, 'Notebook', 5);

    CREATE TABLE Quantitiesti (
    quantity_id INT PRIMARY KEY,
    quantity INT
);

INSERT INTO Quantitiesti (quantity_id, quantity) VALUES
(1, 10),
(2, 20);

SELECT p.product_id, p.product_name, p.price, q.quantity
FROM Productsti p
CROSS JOIN Quantitiesti q;

SELECT COUNT(*) AS total_rows
FROM Productsti p
CROSS JOIN Quantitiesti q;