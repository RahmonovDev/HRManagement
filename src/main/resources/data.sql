CREATE EXTENSION IF NOT EXISTS "uuid-ossp";
insert into roles (role_name) values ('ROLE_DIRECTOR'),('ROLE_HR_MANAGER'),('ROLE_MANAGER'),('ROLE_EMPLOYEE');
insert into users (id,first_name,last_name,email,password,salary,is_account_non_expired,is_account_non_locked,is_credentials_non_expired,is_enabled)
values (uuid_generate_v4(),'director','superadmin','test@gmail.com','789',0,true,true,true,true);

insert into users_roles
select u.id,r.id from users u,roles r
where u.email = 'test@gmail.com' and r.id = 1

