CREATE TABLE IF NOT EXISTS GREETINGS (
    id serial PRIMARY KEY,
    name varchar(50) NOT NULL
);

CREATE TABLE IF NOT EXISTS THINGS (
    id serial PRIMARY KEY,
    name varchar(50) NOT NULL,
    description varchar(255) NOT NULL
);

