
CREATE TABLE contests
(
    id BIGSERIAL PRIMARY KEY
);

CREATE TABLE novels
(
    id BIGSERIAL PRIMARY KEY
);

CREATE TABLE translations
(
    id BIGSERIAL PRIMARY KEY
);


CREATE TABLE roles
(
    roles VARCHAR(255),
    user_id BIGINT REFERENCES users(id)
);