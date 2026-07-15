USE covid_db;


SELECT country,SUM(death_count) AS total_deaths
FROM covid_deaths
GROUP BY country
HAVING SUM(death_count)>(
SELECT AVG(total_deaths)
FROM(
SELECT SUM(death_count) AS total_deaths
FROM covid_deaths
GROUP BY country
) avg_table
);
