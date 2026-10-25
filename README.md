# Sistema de Cálculo de Salarios de Empleados

## Descripción

Este proyecto consiste en un sistema de cálculo de salarios desarrollado en Java. Utiliza una clase abstracta `Empleado` y dos clases derivadas: `EmpleadoAsalariado` y `EmpleadoPorHora`, que implementan diferentes formas de calcular el sueldo de un empleado.

## Funcionamiento

El programa crea dos empleados con distintos métodos de remuneración:

* **Empleado asalariado:** recibe un sueldo mensual fijo.
* **Empleado por hora:** cobra según la tarifa por hora multiplicada por la cantidad de horas trabajadas.

Luego, el programa invoca el método `calcularSalario()` para obtener e imprimir el sueldo correspondiente a cada empleado.

### Ejemplo de ejecución

Con los datos definidos en el código:

* Mateo: sueldo mensual de 10.000.
* Juanjo: tarifa de 200 por hora y 48 horas trabajadas.

Los resultados calculados son:

* Sueldo de Mateo: `10000.0`
* Sueldo de Juanjo: `9600.0`

## Clases principales

### `Empleado`

Es una clase abstracta que contiene los atributos comunes de los empleados:

* `Nombre`
* `Dni`
* `Legajo`

Declara el método abstracto `calcularSalario()`, que debe ser implementado por las clases derivadas.

### `EmpleadoAsalariado`

Hereda de `Empleado` y agrega el atributo `sueldoMensual`. Implementa `calcularSalario()` para devolver el sueldo mensual fijo.

### `EmpleadoPorHora`

Hereda de `Empleado` y agrega los atributos `tarifaPorHora` y `horaTrabajadas`. Implementa `calcularSalario()` multiplicando ambos valores.

### `Main`

Contiene el método de entrada del programa. Crea los objetos de ambas clases, calcula sus salarios y muestra los resultados en la consola.

## Conceptos de programación utilizados

* **Abstracción:** la clase `Empleado` define características comunes y un método abstracto.
* **Herencia:** `EmpleadoAsalariado` y `EmpleadoPorHora` heredan de `Empleado`.
* **Polimorfismo:** una variable de tipo `Empleado` puede almacenar objetos de sus clases derivadas y ejecutar su propia versión de `calcularSalario()`.
* **Encapsulamiento:** los atributos están declarados como `private`.
* **Sobrescritura de métodos:** las clases derivadas implementan el método `calcularSalario()` mediante `@Override`.

## Ejecución

<img width="408" height="155" alt="image" src="https://github.com/user-attachments/assets/84919054-9a1a-4097-9784-17042c168a65" />

## Objetivo del ejercicio

Aplicar los conceptos fundamentales de la programación orientada a objetos mediante clases abstractas, herencia y polimorfismo, modelando diferentes formas de calcular el salario de los empleados.
