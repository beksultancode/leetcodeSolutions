select a.player_id, a.event_date as first_login from Activity a
where a.event_date = (select min(a2.event_date) from Activity a2 where a2.player_id = a.player_id);