select s.name
from SalesPerson s
where s.sales_id not in (select sales_id
                         from Orders o
                         where o.com_id = (select c.com_id from Company c where c.name = 'RED'));