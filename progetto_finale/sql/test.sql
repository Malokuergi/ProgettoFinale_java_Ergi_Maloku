SELECT a.id, a.category_id, c.id, c.name
FROM articles a
LEFT JOIN categories c ON c.id = a.category_id;
