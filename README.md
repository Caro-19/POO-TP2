# 🚗 Trabajo Práctico 2 – Concesionaria de Autos y Motos

## 📖 Descripción del proyecto

Este proyecto consiste en una aplicación desarrollada en **Java** que simula el funcionamiento de una concesionaria de vehículos. El sistema carga un conjunto de automóviles y motocicletas y permite realizar diferentes operaciones de consulta, búsqueda y ordenamiento utilizando los principios de la Programación Orientada a Objetos (POO).

El objetivo principal fue aplicar conceptos como **abstracción, herencia, polimorfismo, encapsulamiento e interfaces**, junto con el uso de colecciones y la API Stream de Java para resolver problemas de forma eficiente y organizada.

---

# ❗ Problema

Las concesionarias administran distintos tipos de vehículos que comparten información en común, pero también poseen características propias. Sin una estructura orientada a objetos, el código termina siendo repetitivo, difícil de mantener y poco escalable.

Además, era necesario implementar funcionalidades como:

* Buscar el vehículo más caro.
* Buscar el vehículo más económico.
* Encontrar vehículos cuyo modelo contenga una letra determinada.
* Ordenar los vehículos por precio.
* Ordenarlos siguiendo un criterio natural.

Todo esto debía resolverse respetando las buenas prácticas de programación y aprovechando las características del lenguaje Java.

---

# 💡 Solución implementada

Para resolver el problema se diseñó una arquitectura basada en Programación Orientada a Objetos.

Se creó una clase abstracta llamada **Vehiculo**, encargada de contener los atributos y comportamientos comunes a todos los vehículos.

A partir de ella se desarrollaron dos clases específicas:

* 🚘 Auto
* 🏍 Moto

Cada una incorpora sus propias características particulares mientras reutiliza el comportamiento heredado.

La lógica de negocio fue centralizada dentro de la clase **Concesionaria**, que implementa una interfaz encargada de definir todas las operaciones del sistema.

Para realizar búsquedas, filtros y ordenamientos se utilizó la **Java Stream API**, permitiendo escribir código más limpio, legible y eficiente.

---

# ✨ Funcionalidades

* Registrar una lista de vehículos.
* Mostrar todos los vehículos.
* Obtener el vehículo de mayor precio.
* Obtener el vehículo de menor precio.
* Buscar vehículos cuyo modelo contenga una letra específica.
* Ordenar vehículos por precio (de mayor a menor).
* Ordenar vehículos por su orden natural.
* Mostrar toda la información por consola con un formato claro.

---

# 🛠 Tecnologías utilizadas

| Herramienta      | Descripción                                         |
| ---------------- | --------------------------------------------------- |
| Java 21          | Lenguaje principal del proyecto                     |
| Spring Boot      | Framework utilizado para la estructura del proyecto |
| Maven            | Gestión de dependencias y compilación               |
| Lombok           | Reducción de código repetitivo mediante anotaciones |
| Java Collections | Administración de listas de vehículos               |
| Java Stream API  | Búsquedas, filtros y ordenamientos                  |
| Git              | Control de versiones                                |
| GitHub           | Repositorio del proyecto                            |

---

# 🏗 Arquitectura del proyecto

```
src
 └── main
      └── java
           ├── clases
           │     ├── vehiculos
           │     │      ├── Vehiculo
           │     │      ├── Auto
           │     │      └── Moto
           │     │
           │     └── concesionarias
           │            ├── Concesionaria
           │            └── EjecutadorDeConcesionaria
           │
           └── interfaces
                  └── IGestionDeVehiculos
```

---

# 📚 Conceptos de Programación Orientada a Objetos aplicados

* Encapsulamiento
* Herencia
* Polimorfismo
* Abstracción
* Interfaces
* Clases abstractas
* Sobrescritura de métodos
* Comparable
* Colecciones
* Streams

---

# 🎯 Objetivos alcanzados

✔ Aplicación correcta de los pilares de POO.

✔ Implementación de una arquitectura organizada y escalable.

✔ Uso de Streams para simplificar operaciones sobre colecciones.

✔ Separación entre modelo, lógica de negocio e interfaz.

✔ Código reutilizable y fácil de mantener.

---

# 👩‍💻 Autor

**Carol Torrez**

Trabajo Práctico 2 – Programación Orientada a Objetos

Desarrollado con Java utilizando buenas prácticas de programación y principios de diseño orientado a objetos.
