create table breeds
(
    id          bigint auto_increment
        primary key,
    name        varchar(255) null,
    temperament varchar(255) null
);

create table cat
(
    id     bigint auto_increment
        primary key,
    height int          null,
    url    varchar(255) null,
    width  int          null
);

create table favourites
(
    favourite_id  int          not null
        primary key,
    image_id      varchar(45)  null,
    favourites_id bigint       not null,
    url           varchar(255) null
);

create table images
(
    id     bigint auto_increment
        primary key,
    url    varchar(255) null,
    width  int          null,
    height int          null
);