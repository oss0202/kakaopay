DROP TABLE IF EXISTS testtbl;
 
CREATE TABLE testtbl (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL
);
 
INSERT INTO testtbl (name) VALUES
  ('name1'),
  ('name2'),
  ('name3');

DROP TABLE IF EXISTS accounts;
 
CREATE TABLE accounts (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  email VARCHAR(255) NOT NULL
);
 
INSERT INTO accounts (email) VALUES
  ('email1@email.com'),
  ('email2@email.com'),
  ('email3@email.com');