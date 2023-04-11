# Bienvenido a AdoptaMe
La aplicación " AdoptaMe " es una herramienta tecnológica diseñada para ayudar a la asociación protectora de animales a ofrecer perros y gatos en adopción. La plataforma sirve como enlace para llegar a personas interesadas en adoptar una mascota. Además, permite la creación de entradas en un blog de noticias y la recepción de donativos a través de un motor de pagos en línea.

La aplicación cuenta con roles de administrador, voluntario, adoptador y anónimo, cada uno con sus respectivas funcionalidades. En la página principal, los usuarios pueden acceder al listado de perros y gatos en adopción, a las publicaciones del blog y a la opción de donar. También pueden iniciar sesión o crear una cuenta. La página de listado de mascotas incluye un buscador y un formulario para filtrar la lista actual de acuerdo con el sexo, tamaño y color de las mascotas. La página de noticias muestra las entradas cronológicamente por fecha de creación. La aplicación ofrece a los adoptadores la posibilidad de realizar donativos, visualizar la lista de donativos exitosos y pendientes de pago, y descargar comprobantes de pago.

## Instalación
Como primer paso, clona o descarga nuestro proyecto desde la rama main, en tu equipo.

## Requerimientos
Antes de ejecutar el proyecto, crea en MySQL una base de datos con el nombre "adoptame", a continuación te mostramos la sentencia:

> CREATE DATABASE adoptame;

Al concluir la creación de la base de datos, configura el application.properties colocando los datos correspondientes de tu usuario en MySQL.

> spring.datasource.username = root spring.datasource.password = root

Posteriormente de haber realizado la configuración, crearemos una carpeta en el directorio principal de tu disco local, con el siguiente nombre:

> C:/images

Cuando hayamos concluido, ejecutaremos el proyecto nuevamente.

## Registros necesarios
Es necesario ejecutar las siguientes sentencias en MySQL posterior a correr la aplicación:

> USE adoptame;

> INSERT INTO role(id, name) VALUES (1 , 'ROLE_ADMINISTRADOR'), (2, 'ROLE_VOLUNTARIO'), (3, 'ROLE_ADOPTADOR');

> INSERT INTO users (id, created_at, enabled, fist_lastname, name, password, second_lastname, username) VALUES (1, '2022-03-21 10:23:34', 1, 'Garcia','Pablo', '$2a$10$ril3o2EeV8py8pP5rTWbMunh0NFr6hy6pwsiqhWZPAnpreD6yPUpi', 'Martinez','admin@adoptame.com');

> INSERT INTO color (name) VALUES ('Blanco'),('Café'),('Gris'),('Negro'),('Atigrado'),('Bicolor'),('Con manchas'),('Varios colores');

> INSERT INTO personality(name) VALUES ('Activo'),('Independiente'),('Juguetón'),('Protector'),('Ruidoso'),('Tímido'),('Tranquilo'),('Amoroso');

> INSERT INTO size(name) VALUES ('Pequeño') , ('Mediano'), ('Grande');

> INSERT INTO users (id, created_at, enabled, fist_lastname, name, password, second_lastname, username) VALUES (2, '2022-03-21 10:23:34', 1, 'Gomez','Angel', '$2a$10$ril3o2EeV8py8pP5rTWbMunh0NFr6hy6pwsiqhWZPAnpreD6yPUpi', 'Díaz','voluntario@adoptame.com');

> INSERT INTO users (id, created_at, enabled, fist_lastname, name, password, second_lastname, username) VALUES (3, '2022-03-21 10:23:34', 1, 'Jaimes','Santiago', '$2a$10$ril3o2EeV8py8pP5rTWbMunh0NFr6hy6pwsiqhWZPAnpreD6yPUpi', 'Martinez','adoptador@adoptame.com');

> INSERT INTO authorities (username, authority) VALUES (1,1),(2,2),(3,3);

Una vez realizados todos los pasos anteriormente mencionados podrás usar la aplicación " AdoptaMe " correctamente.
