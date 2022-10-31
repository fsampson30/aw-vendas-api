create table item (
  id bigint not null auto_increment,
  venda_id bigint not null,
  produto_id bigint not null,
  quantidade numeric not null,

  primary key (id)
);

alter table item add constraint fk_item_venda foreign key (venda_id) references venda(id);
alter table item add constraint fk_produto_venda foreign key (produto_id) references produto(id);