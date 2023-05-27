create table usuarios (
id bigint not null auto_increment,
nombre varchar(255) not null,
apellido varchar(255) not null,
telefono varchar(255),
email varchar(255) not null,
contrasena varchar(255) not null,

primary key (id)

);