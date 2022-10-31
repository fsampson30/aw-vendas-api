create table produto(
  id bigint not null auto_increment,
  nome varchar(60) not null,
  valor decimal(10,2) not null,

  primary key (id)
);