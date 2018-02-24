# configuration
Se crea repositorio centralizado de properties general para uso de ramas

CONFIG SERVER:

* Nomenclatura de archivo de configuracion:
| nombre de archivo | extension | profile |
-------------------------------------------
|proy-example-service-{profile}|.yml|{dev,cert,prod}|

dev = Entorno de Desarrollo
cert = Entorno de Certificacion
prod = Entorno de Produccion

* Documentacion Swagger:
|HEADER|QUERY PARAM|BODY|CODE|
|Param cabecera|Params|Request|{200,201,204,400,404,500}|

Generar archivo .md [swagger/notes/archivo.md]
