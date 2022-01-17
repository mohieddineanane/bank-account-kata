CREATE TABLE customer (
  customer_id INT AUTO_INCREMENT  PRIMARY KEY,
  firstname VARCHAR(250) NOT NULL,
  lastname VARCHAR(250) NOT NULL,
  address VARCHAR(250) NOT NULL,
  phone VARCHAR(250) NOT NULL,
  country VARCHAR(250) NOT NULL,
  zip VARCHAR(250) NOT NULL,
  city VARCHAR(250) NOT NULL,
  civility VARCHAR(250) NOT NULL
);


CREATE TABLE account (
  account_id INT AUTO_INCREMENT  PRIMARY KEY,
  account_num VARCHAR(250) NOT NULL,
  total DOUBLE NOT NULL,
  activation_date DATE NOT NULL,
  status VARCHAR(250) NOT NULL,
  customer_id INT NOT NULL
);


INSERT INTO customer (customer_id, firstname, lastname, address, phone, country,zip, city, civility) 
VALUES (1, 'firstname','lastname', '40 rue de la gare', '0658568565','France','78260','Acheres', 'Mr' );

INSERT INTO account (account_id, account_num, total, activation_date, status, customer_id) VALUES (1, 'fr792525234552252',15000.55, '2012-10-02','',1);