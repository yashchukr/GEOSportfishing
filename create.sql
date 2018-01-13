create sequence fishingapp.role_seq start 1 increment 1
create sequence fishingapp.user_seq start 1 increment 1
create table fishingapp.roles (id int8 not null, creator varchar(255), name varchar(255), primary key (id))
create table fishingapp.user_role (user_id int4 not null, role_id int8 not null, primary key (user_id, role_id))
create table fishingapp.users (user_id int4 not null, email varchar(255), enabled int4, first_name varchar(255), last_name varchar(255), password varchar(255), user_name varchar(255), primary key (user_id))
alter table fishingapp.user_role add constraint FKt7e7djp752sqn6w22i6ocqy6q foreign key (role_id) references fishingapp.roles
alter table fishingapp.user_role add constraint FKj345gk1bovqvfame88rcx7yyx foreign key (user_id) references fishingapp.users
