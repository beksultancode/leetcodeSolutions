select t.class
from (select c.class, count(*) as c
      from Courses c
      group by c.class) t
where t.c >= 5;