create table countries (
                           id bigserial primary key,
                           name varchar(255) not null,
                           continent varchar(255) not null
);

create table authors (
                         id bigserial primary key,
                         created_at timestamp,
                         updated_at timestamp,
                         name varchar(255) not null,
                         surname varchar(255) not null,
                         country_id bigint not null,
                         constraint fk_authors_country
                             foreign key (country_id) references countries(id)
);

create table books (
                       id bigserial primary key,
                       created_at timestamp,
                       updated_at timestamp,
                       name varchar(255) not null,
                       category varchar(255) not null,
                       book_state varchar(255) not null,
                       available_copies integer not null,
                       author_id bigint not null,
                       constraint fk_books_author
                           foreign key (author_id) references authors(id)
);