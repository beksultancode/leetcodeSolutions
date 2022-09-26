-- https://leetcode.com/problems/find-total-time-spent-by-each-employee/
select t.event_day as day,
t.emp_id,
sum(t.total) as total_time
from (select e.emp_id, e.event_day, (e.out_time - e.in_time) as total from Employees e) t
group by t.emp_id, t.event_day;