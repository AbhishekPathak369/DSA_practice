# Write your MySQL query statement below
select name,bonus from Employee e left Join Bonus b 
On e.empId = b.empId 
where bonus < 1000 OR e.empId Not in(
    select empId from Bonus
)