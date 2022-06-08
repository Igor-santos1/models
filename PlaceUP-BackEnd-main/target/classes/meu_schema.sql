create table Client(
ID INTEGER PRIMARY KEY AUTO_INCREMENT,
NAME VARCHAR(45) NOT NULL,
PASSWORD VARCHAR(45) NOT NULL,
birth DATE NOT NULL,
EMAIL VARCHAR(100),
PHONE VARCHAR(45),
STATUS VARCHAR(45) NOT NULL
);

create table Reservation(
ID INTEGER PRIMARY KEY AUTO_INCREMENT,
price FLOAT NOT NULL,
DATA TIMESTAMP NOT NULL,
Client_ID INTEGER REFERENCES Client (ID)
);

create table Address(
ID INTEGER PRIMARY KEY AUTO_INCREMENT,
zip_code VARCHAR(20) NOT NULL,
STREET VARCHAR(45) NOT NULL,
DISTRICT VARCHAR(45) NOT NULL,
CITY VARCHAR(45) NOT NULL,
NUMBER_HOUSE INT NOT NULL
);

create table Accessibility(
ID INTEGER PRIMARY KEY AUTO_INCREMENT,
wheelchair varchar(45) NOT NULL,
visually_impaired varchar(45) NOT NULL,
hearing_impaired varchar(45) NOT NULL,
MUTE varchar(45) NOT NULL
);


create table Seller(
ID INTEGER PRIMARY KEY AUTO_INCREMENT,
NAME VARCHAR(45) NOT NULL,
EMAIL VARCHAR(100) NOT NULL,
CNPJ VARCHAR(14) NOT NULL,
PASSWORD VARCHAR(45),
PHONE VARCHAR(20),
STATUS VARCHAR(45) NOT NULL,
Address_ID INTEGER REFERENCES Address (ID),
Accessibility_id INTEGER REFERENCES Accessibility (ID)
);

create table Product(
ID INTEGER PRIMARY KEY AUTO_INCREMENT,
price INT NOT NULL,
product_brand VARCHAR(45) NOT NULL,
products_name VARCHAR(45) NOT NULL,
category VARCHAR(45) NOT NULL,
expiration_date DATE NOT NULL,
STATUS VARCHAR(45) NOT NULL,
Seller_id INTEGER REFERENCES Seller (ID)
);

create table Reserve_items(
ID INTEGER PRIMARY KEY AUTO_INCREMENT,
reserve_quantity INT NOT NULL,
Reservation_id INTEGER REFERENCES Reservation (ID),
Product_id INTEGER REFERENCES Product (ID)
);