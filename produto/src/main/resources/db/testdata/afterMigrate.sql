
set foreign_key_checks = 0;

delete from produto;

set foreign_key_checks = 1;

alter table produto auto_increment = 1;

insert into produto (cest, cfop, ncm, cean, ceantrib, c_prod, dt_cadastro, ind_tot, n_item_ped, q_com, q_trib, u_com, u_trib, v_desc, v_prod, v_un_com, v_un_trib, x_prod)
values (1111111, 5405, 15131900, 71985291725, 71985291725, 911-4, utc_timestamp, 1, 1, 1.0000, 1.0000, 'UN', 124, 6.2, 124, 124, 124, 'Oleo de Coco Copra Extra Virgem 4 x 500ml');




