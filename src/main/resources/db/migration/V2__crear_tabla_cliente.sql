create table clientes (
id bigint  auto_increment,
nombre varchar(255)not null,
apellido varchar(255)not null,
nacimiento date,
nacionalidad varchar(255)not null,
telefono varchar(255)not null,
primary key (id)
);