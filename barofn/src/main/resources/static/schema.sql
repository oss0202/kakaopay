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

DROP TABLE IF EXISTS TB_BRINFO;
 
CREATE TABLE TB_BRINFO(	
BR_CODE	VARCHAR(25),
BR_NAME	VARCHAR(25)
);	

DROP TABLE IF EXISTS TB_ACCTINFO;

CREATE TABLE TB_ACCTINFO(	
ACCT_NO varchar(100)	,
BR_NAME varchar(25)	,
BR_CODE varchar(25)	
);	

INSERT INTO TB_BRINFO VALUES
('A',	'�Ǳ���'),
('B',	'�д���'),
('C',	'������'),
('D',	'�����');

INSERT INTO TB_ACCTINFO VALUES
('11111111',	'����',		'A'),
('11111112',	'���̽�',		'A'),
('11111113',	'����',		'A'),
('11111114',	'�׵�',		'B'),
('11111115',	'���',		'B'),
('11111116',	'��',		'B'),
('11111117',	'�ɺ�',		'C'),
('11111118',	'���ӽ�',		'D'),
('11111119',	'�ֵ�',		'D'),
('11111120',	'����',		'C');
