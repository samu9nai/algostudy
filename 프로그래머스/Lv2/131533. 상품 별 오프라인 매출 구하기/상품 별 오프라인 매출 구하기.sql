select
    p.product_code,
    sum(p.price * s.sales_amount) as sales
from product p
inner join offline_sale s
on p.product_id = s.product_id
group by p.product_id
order by sales desc, p.product_code