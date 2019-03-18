CREATE TABLE book
(
  book_id        SERIAL PRIMARY KEY,
  name      VARCHAR(255),
  genre     VARCHAR(255),
  year      INT,
  id INT,
  FOREIGN KEY (id) REFERENCES author (id)
);

drop table book;

CREATE TABLE author
(
  id      SERIAL PRIMARY KEY,
  name    VARCHAR(255),
  surname VARCHAR(255),
  country VARCHAR(255)
);

INSERT INTO author (name, surname, country)
VALUES ('Александр', 'Пушкин', 'Россия'),
       ('Василь', 'Быков', 'Беларусь'),
       ('Тарас', 'Шевченко', 'Украина'),
       ('Джоан', 'Роулинг', 'Великобритания'),
       ('Стивен', 'Кинг', 'США');

select *
from book

select *
from author;

SELECT id
FROM author
WHERE surname = 'Пушкин';

INSERT INTO book (name, genre, year, id)
VALUES ('Руслан и Людмила', 'Поэма', 1725, (SELECT id FROM author WHERE surname = 'Пушкин'));

INSERT INTO book (name, genre, year, id)
VALUES
       ('Евгений Онегин', 'Поэма', 1723, (SELECT id FROM author WHERE surname = 'Пушкин')),
       ('Три богатыря', 'Сказка', 1721, (SELECT id FROM author WHERE surname = 'Пушкин')),
       ('Сказка о царе Салтане', 'Сказка', 1723, (SELECT id FROM author WHERE surname = 'Пушкин'));

INSERT INTO book (name, genre, year, id)
VALUES
('Оно', 'Ужасы', 1999, (SELECT id FROM author WHERE surname = 'Кинг')),
('Лангольеры', 'Хоррор', 2001, (SELECT id FROM author WHERE surname = 'Кинг'));

INSERT INTO book (name, genre, year, id)
VALUES
('Люди на болоте', 'Рассказ', 1975, (SELECT id FROM author WHERE surname = 'Быков')),
('Пойти и не вернуться', 'Пьеса', 1963, (SELECT id FROM author WHERE surname = 'Быков'));

INSERT INTO book (name, genre, year, id)
VALUES
('Вечера на хуторе близ Диканьки', 'Рассказ', 1903, (SELECT id FROM author WHERE surname = 'Шевченко')),
('Гарри Поттер и Кубок Огня', 'Сказка', 2006, (SELECT id FROM author WHERE surname = 'Роулинг'));



SELECT book.name, book.year, author.name, author.surname
FROM book
INNER JOIN author ON book.id=author.id
ORDER BY book.year ASC;

SELECT book.name, author.name, author.surname
FROM book
       INNER JOIN author ON book.id=author.id
ORDER BY book.year DESC;

SELECT au.name, au.surname, count(*) as qty
FROM author au
INNER JOIN book b on au.id = b.id
GROUP BY au.id;