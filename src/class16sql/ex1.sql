CREATE TABLE countries
(
  country_id        SERIAL PRIMARY KEY,
  name      VARCHAR(255) UNIQUE,
  population INT,
  square     INT,
  language VARCHAR (255)
  );

select * from countries order by population desc

INSERT INTO countries (name, population, square, language) VALUES
('Россия',150000,1300000,'Русский'),
('Беларусь',9350,207450,'Русский'),
('США',350000,950000,'Английский'),
('Германия',37000,450000,'Немецкий'),
('Франция',23500,395000,'Французский'),
('Испания',32000,420000,'Испанский'),
('Италия',22000,320000,'Итальянский'),
('Польша',18000,350000,'Польский'),
('Норвегия',34000,620000,'Норвежский'),
('Китай',1000000,800000,'Китайский');

SELECT name, population
FROM countries
WHERE (population>50000);

SELECT *
FROM countries
ORDER BY population;


select sum(sub.population)
from (
SELECT name, population
FROM countries
ORDER BY population
LIMIT 5) as sub;


UPDATE countries
SET language = 'Руссиш'
WHERE language = 'Русский';

DELETE
FROM countries c
WHERE c.country_id =  (
  SELECT cc.country_id from countries cc order by cc.population desc limit 1);

