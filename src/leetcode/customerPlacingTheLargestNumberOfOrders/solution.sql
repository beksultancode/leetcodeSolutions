select t.customer_number
from (select o.customer_number, count(*) as c
      from Orders o
      group by o.customer_number) t
order by t.c desc limit 1;