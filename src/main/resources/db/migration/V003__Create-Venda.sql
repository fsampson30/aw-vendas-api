create table venda (
  id bigint not null auto_increment,
  cliente_id bigint not null,
  frete decimal(10,2) not null,
  cadastro datetime not null,

  primary key (id)
);

alter table venda add constraint fk_venda_cliente foreign key (cliente_id) references cliente(id);