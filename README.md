# Serial Friends

Aplicación para la prueba tecnica (Backend) para Alpinia, realizado por Antonio Ruiz Machio


## Configuración

La aplicación utiliza una base de datos MySQL. La configuracion del dataSource se encuentra en el fichero 'application.properties' (url, username y password).

Además, en la carpeta "src/main/resources/static" se encuentra un fichero 'schema.txt' en el que hay un script para la creación tanto de las tablas como de cargar unos datos de prueba iniciales.


Al arrancar la aplicacion (Tomcat embebido de Spring) se puede acceder mediante la url "http://localhost:8080/series"
