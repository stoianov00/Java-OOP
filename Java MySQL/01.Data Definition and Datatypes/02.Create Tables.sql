USE minions;

CREATE TABLE minions(
    id INT(11) PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(50),
    age INT(11)
);

CREATE TABLE towns(
    id INT(11) PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(50)
);
