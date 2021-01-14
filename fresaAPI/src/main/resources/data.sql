INSERT INTO tb_client(name) VALUES ('Rosquinel');
INSERT INTO tb_client(name) VALUES ('Rafael');
INSERT INTO tb_client(name) VALUES ('Luis Luchiara');

INSERT INTO tb_gear_service(data, quantity, type, material, module, number_Of_Teeth, price) VALUES ('2021-01-14', 5, 'engrenagem', 'aço', 3.0, 60, 108.00);
INSERT INTO tb_gear_service(data, quantity, type, material, module, number_Of_Teeth, price) VALUES ('2021-01-14', 4, 'engrenagem', 'aço', 3.0, 44, 79.20);
INSERT INTO tb_gear_service(data, quantity, type, material, module, number_Of_Teeth, price) VALUES ('2021-01-10', 2, 'engrenagem', 'aço', 3.5, 14, 60.00);
INSERT INTO tb_gear_service(data, quantity, type, material, module, number_Of_Teeth, price) VALUES ('2021-01-02', 1, 'engrenagem helicoidal', 'aço', 2.0, 53, 150.00);

INSERT INTO tb_client_gear_service(client_id, gear_service_id) VALUES (1, 1);
INSERT INTO tb_client_gear_service(client_id, gear_service_id) VALUES (1, 2);
INSERT INTO tb_client_gear_service(client_id, gear_service_id) VALUES (2, 3);
INSERT INTO tb_client_gear_service(client_id, gear_service_id) VALUES (3, 4);