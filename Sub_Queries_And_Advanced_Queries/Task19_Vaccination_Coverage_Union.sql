USE covid_db;


SELECT country,
vaccinated_population AS population,
'Vaccinated' AS status
FROM covid_vaccination
UNION
SELECT country,
(total_population-vaccinated_population) AS population,
'Unvaccinated' AS status
FROM covid_vaccination;
