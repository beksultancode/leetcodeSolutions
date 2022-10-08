-- https://leetcode.com/problems/user-activity-for-the-past-30-days-i/
select a.activity_date as day, count(distinct(a.user_id)) as active_users from Activity a
where a.activity_date >= DATE('2019-07-27' - INTERVAL 29 DAY) and a.activity_date <= '2019-07-27'
group by a.activity_date;
