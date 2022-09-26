select t.actor_id, t.director_id
from (select ad.actor_id, ad.director_id, count(*) as c
      from ActorDirector ad
      group by ad.actor_id, ad.director_id) t
where t.c >= 3;