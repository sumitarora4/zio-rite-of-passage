CREATE DATABASE reviewboard;
\c reviewboard;

CREATE TABLE IF NOT EXISTS companies (
    id BIGSERIAL PRIMARY KEY,
    slug TEXT UNIQUE NOT NULL,
    name TEXT UNIQUE NOT NULL,
    url TEXT UNIQUE NOT NULL,
    country TEXT,
    location TEXT,
    industry TEXT,
    image TEXT,
    tag TEXT[]
);