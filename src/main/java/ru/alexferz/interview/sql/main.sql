-- Даны две табилицы
-- PERSONS со списком работников
-- ID   NAME
-- 1    Petr
-- 2    Nikolay
-- 3    Semen

-- SALARY с зарплатными начислениями ежемесячно
-- ID   PERSON_ID   AMOUNT
-- 1    1           10
-- 2    1           20
-- 3    3           15

DROP TABLE persons;
DROP TABLE salary;

CREATE TABLE persons (id bigint, name varchar(100));
CREATE TABLE salary (id bigint, person_id bigint, amount bigint);

INSERT INTO persons VALUES (1, 'Petr'), (2, 'Nikolay'), (3, 'Semen');
INSERT INTO salary VALUES (1, 1, 10), (2, 1, 20), (3, 3, 15);

-- Написать запрос, чтобы вывести сотрудников вместе с их зарплатными начислениями
-- Написать запрос, суммарная зарплата которых больше 16

-- SELECT name, amount FROM persons JOIN salary ON persons.id = salary.person_id;
SELECT name, SUM(amount) FROM persons JOIN salary ON persons.id = salary.person_id
GROUP BY name HAVING SUM(amount) > 16;

-- https://interview.cups.online/live-coding/?room=e7f90056-2dd1-489e-8942-5629af3bde6e