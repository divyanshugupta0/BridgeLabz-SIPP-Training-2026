CREATE DATABASE IF NOT EXISTS covid_db;
USE covid_db;

DROP TABLE IF EXISTS covid_cases;
DROP TABLE IF EXISTS covid_deaths;
DROP TABLE IF EXISTS covid_vaccination;

CREATE TABLE covid_cases (
    id INT PRIMARY KEY AUTO_INCREMENT,
    country VARCHAR(100),
    state VARCHAR(100),
    date DATE,
    confirmed_cases INT
);

CREATE TABLE covid_deaths (
    id INT PRIMARY KEY AUTO_INCREMENT,
    country VARCHAR(100),
    state VARCHAR(100),
    date DATE,
    death_count INT
);

CREATE TABLE covid_vaccination (
    id INT PRIMARY KEY AUTO_INCREMENT,
    country VARCHAR(100),
    vaccinated_population INT,
    total_population INT
);

INSERT INTO covid_cases(country,state,date,confirmed_cases) VALUES
('India','Mumbai','2021-05-01',900000),
('India','Mumbai','2021-05-15',1200000),
('India','Delhi','2021-05-01',850000),
('USA','New York','2021-05-01',1500000),
('Brazil','Sao Paulo','2021-05-01',1100000);

INSERT INTO covid_deaths(country,state,date,death_count) VALUES
('India','Mumbai','2021-05-01',12000),
('India','Delhi','2021-05-01',10000),
('USA','New York','2021-05-01',30000),
('Brazil','Sao Paulo','2021-05-01',22000),
('Mexico','Mexico City','2021-05-01',18000);

INSERT INTO covid_vaccination(country,vaccinated_population,total_population) VALUES
('India',950000000,1400000000),
('USA',230000000,331000000),
('Brazil',160000000,213000000),
('Mexico',90000000,128000000);
