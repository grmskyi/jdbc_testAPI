CREATE TABLE actor(
        id BIGSERIAL PRIMARY KEY,
        name text not null,
        movie bigint references movie(id),
        unique (name,movie)
);