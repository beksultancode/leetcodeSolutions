-- https://leetcode.com/problems/sales-analysis-iii/
select p.product_id, p.product_name from Product p where
    # sold in spring
(select case when (min(s.sale_date) >= '2019-01-01' and max(s.sale_date) <='2019-03-31') then true else false end from Sales s where s.product_id = p.product_id);