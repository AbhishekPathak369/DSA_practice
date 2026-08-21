/* Write your T-SQL query statement below */
select customer_id, Count(*) as count_no_trans from Visits
Where visit_id Not in(select visit_id from Transactions)
group by customer_id;
