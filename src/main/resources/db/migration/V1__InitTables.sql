CREATE TABLE movie(
    id BIGSERIAL PRIMARY KEY,
    name text not null,
    release_date date not null,
    unique (name)
);