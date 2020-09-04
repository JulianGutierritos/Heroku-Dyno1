# Calcular funciones trigonométricas 

## Despliegue en Heroku ##

[![Heroku](https://www.herokucdn.com/deploy/button.png)](https://dyno-1-jg.herokuapp.com/calcular?func=cos&num=1)



## Prerrequisitos ##

La persona que quiera utilizar este programa debe tener conocimientos básicos en Java y Maven.

Para compilar y ejecutar este programa se debe contar con las siguientes herramientas: 

- Java 8
- Maven 
- Heroku (en caso de que se quiera desplegar localmente)

## Herramientas utilizadas para el desarrollo ##

Para el desarrollo de este programa se utilizó: 

- Java: Fue el lenguaje de programación utilizado para el desarrollo.

- Spark: Librería de Java que se utilizó para montar nuestra API REST.

- Maven: Fue la herramienta utilizada para la gestión y construcción del programa.

- Heroku: Fue la herramienta que se utilizó para desplegar el programa.


## Descripción ## 

Este es un programa que calcula las funciones trigonométricas (seno, coseno y tangent) a partir de datos insertados en su Query. 

En el caso de este programa, calcula las funciones utilizando la librería "Math" de java.


## Instrucciones para su compilación, ejecución y generación de documentación ##

Para compilar el programa, se debe primero ubicar en la carpeta del archivo y posteriormente ejecutar el siguiente comando: 

```
   mvn package 
```

Una vez compilado el programa, lo siguiente es ejecutarlo. Para esto, ejecute el siguiete comando:

```
java -cp target/classes:target/dependency/* edu.escuelaing.arep.SparkWebApp
```
 

Si desea generar una documentación del programa, debe ejecutar la siguiente lista de comandos:

```
   mvn javadoc:javadoc
   mvn javadoc:jar
   mvn javadoc:aggregate
   mvn javadoc:aggregate-jar
   mvn javadoc:test-javadoc
   mvn javadoc:test-jar
   mvn javadoc:test-aggregate
   mvn javadoc:test-aggregate-jar
```

## Licencia ## 

La licencia de este proyecto es: [**GNU General Public License v3.0**](LICENSE)

## Autor ##

Julián David Gutiérrez Vanegas
