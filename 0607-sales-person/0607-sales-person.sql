# Write your MySQL query statement below
select name
from SalesPerson where sales_id not in(
    select distinct sales_id
    from orders o
    join company c on c.com_id=o.com_id
    where c.name="RED"
);