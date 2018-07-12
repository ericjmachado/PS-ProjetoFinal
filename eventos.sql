drop database eventos_ufg;
create database eventos_ufg;
use eventos_ufg;
create table evento (
titulo varchar(30) not null;
local varchar(30) not null;

insert into evento values('Arraiá na CEU', 'Casa do Estudante I');
insert into evento values('CONPEEX', 'Centro de Eventos');
insert into evento values('Choppada Integrada', 'EMAC');
insert into evento values('Semana do Calouro', 'Instituto de Informática');

