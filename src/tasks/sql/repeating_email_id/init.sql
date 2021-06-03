CREATE SEQUENCE repeating_email_id_seq START 1;
CREATE TABLE repeating_email
(
    id    BIGINT PRIMARY KEY DEFAULT nextval('repeating_email_id_seq'),
    email TEXT NOT NULL
);

INSERT INTO repeating_email (email)
VALUES ('rep_email_1'),
       ('rep_email_1'),
       ('rep_email_2'),
       ('rep_email_2'),
       ('un_email_1'),
       ('un_email_2');