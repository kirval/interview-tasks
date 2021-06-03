-- Solution 1 --
SELECT id, email
FROM repeating_email AS re1
WHERE EXISTS(
              SELECT re2.id, re2.email
              FROM repeating_email as re2
              WHERE re1.id != re2.id
                AND re1.email = re2.email
          );

-- Solution 2 --
SELECT email, array_agg(id)
FROM repeating_email
GROUP BY email
HAVING count(id) > 1;