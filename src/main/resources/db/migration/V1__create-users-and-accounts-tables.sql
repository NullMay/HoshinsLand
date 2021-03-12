CREATE TABLE users
(
    id BIGSERIAL PRIMARY KEY,
    email VARCHAR(50) NOT NULL ,
    username VARCHAR(50) NOT NULL,
    password VARCHAR NOT NULL
);

CREATE TABLE accounts
(
    id BIGSERIAL PRIMARY KEY,
    balance REAL NOT NULL,
    user_id BIGINT REFERENCES users(id)
);