
-- Q1 
-- -----------------------------------------------------------------------------------------------------------
-- select first and last name of employees with salaries greater than 10000 and hired after 1998 
-- and do not include employees from Administration and the employees should be from Australia or Canada.   

SELECT 
    employees.first_name,
    employees.last_name,
    employees.salary,
    departments.department_name,
    countries.country_name
FROM
    employees,
    departments,
    countries
WHERE
    NOT departments.department_name LIKE 'Administration'
        AND employees.salary > 10000
        AND hire_date > 1998 - 01 - 01
        AND countries.country_name LIKE 'Australia'
        OR countries.country_name LIKE 'Canada';
    
-- Q2
-- -----------------------------------------------------------------------------------------------------------
-- Select the first 6 higly paid employees who are Accountants,Administration Assistant

SELECT 
    employees.first_name, departments.department_name
FROM
    employees
        INNER JOIN
    departments ON employees.department_id = departments.department_id
WHERE
    department_name LIKE 'Accounting'
        OR 'Administration'
ORDER BY salary DESC
LIMIT 0 , 6;

-- Q3 
-- -----------------------------------------------------------------------------------------------------------
-- Select dependents of the employees whose salaries are between 10000 and 20000
   
   SELECT 
    employees.department_id
FROM
    employees
WHERE
    employees.salary BETWEEN 10000 AND 20000;
   
   

    
    
   





