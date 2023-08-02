# Write your MySQL query statement below
select unique_id,NAME from Employees
left join employeeUNI ON Employees.ID= employeeUNI.ID