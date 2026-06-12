select b.book_id, a.author_name, b.published_date
from author a
inner join book b
on a.author_id = b.author_id
where b.category = '경제'
order by published_date