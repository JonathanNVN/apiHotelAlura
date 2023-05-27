create table reservas (
id bigint not null auto_increment,
fechaEntrada date,
fechaSalida date,
valor double,
formaPago varchar(255),
primary key (id)

);