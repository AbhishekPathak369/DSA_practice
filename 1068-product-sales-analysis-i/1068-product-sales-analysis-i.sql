/* Write your T-SQL query statement below */
select product_name, year,price From Sales as s Join Product as p On s.product_id  =  p.product_id;