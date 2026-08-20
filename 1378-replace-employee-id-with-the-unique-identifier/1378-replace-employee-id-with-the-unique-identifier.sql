/* Write your T-SQL query statement below */
select unique_id, name from EmployeeUNI eu right JOin Employees e On eu.id = e.id;