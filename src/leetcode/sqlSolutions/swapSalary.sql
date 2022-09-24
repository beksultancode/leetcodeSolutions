update Salary s
set s.sex = case when s.sex = 'f' then 'm' else 'f' end;