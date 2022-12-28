CREATE TABLE barang(
    id_barang VARCHAR(15) NOT NULL,
    nama_barang VARCHAR(30) NOT NULL,
    tanggal_terima DATE NOT NULL,
    stok_barang INT(15),
    PRIMARY KEY(id_barang)
);
DESC barang;
-- insert ADD
INSERT INTO barang(id_barang, nama_barang, tanggal_terima,stok_barang) VALUES(1123,'mouse', now(),300);

SELECT*from barang;

-- union
CREATE TABLE customer(
    id INT NOT NULL,
    nama VARCHAR(30),
    age INT,
    alamt VARCHAR(50),
    gaji int(12),
    PRIMARY KEY(id)
);

DESC customer;

CREATE TABLE ORDERS(
    IOD INT(3) NOT NULL,
    TGL DATE NOT NULL,
    CUSTOMER_ID INT(1) NOT NULL,
    AMOUNT INT(5) NOT NULL,
    PRIMARY KEY(IOD)
);

INSERT INTO ORDERS VALUES(111,NOW(),3,3000);
SELECT*FROM ORDERS;
SELECT id, nama, AMOUNT,TGL FROM customer LEFT JOIN ORDERS ON CUSTOMER_ID = ORDERS.CUSTOMER_ID UNION SELECT id, nama, AMOUNT, 
TGL FROM customer RIGHT JOIN ORDERS ON CUSTOMER.id = ORDERS.CUSTOMER_ID;