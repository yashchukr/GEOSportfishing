----ROLES-----
INSERT INTO fishingapp.roles(id, creator, name) values (1,'ROD','ADMIN');
INSERT INTO fishingapp.roles(id, creator, name) values (2,'ROD','USER');
-----USERS---
INSERT INTO fishingapp.USERS (user_id, user_name, EMAIL) VALUES(1, 'yashchuk','yashchuk@gmail.com');
INSERT INTO fishingapp.USERS (user_id, user_name, EMAIL) VALUES(2, 'mazepa', 'rostyslav.mazepa@gmail.com');
INSERT INTO fishingapp.USERS (user_id, user_name, EMAIL) VALUES(3, 'bataeva', 'olha.i.b5@gmail.com');
------user_roles----
INSERT INTO fishingapp.user_role(user_id, role_id) VALUES (1,1);
INSERT INTO fishingapp.user_role(user_id, role_id) VALUES (1,2);
INSERT INTO fishingapp.user_role(user_id, role_id) VALUES (2,1);
INSERT INTO fishingapp.user_role(user_id, role_id) VALUES (3,2);