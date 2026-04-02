# Sistema de gestión de supermercado

Este proyecto implementa un sistema básico de productos de supermercado utilizando Programación Orientada a Objetos (POO) en Java.
Incluye el uso de interfaces, clases abstractas, polimorfismo, y una aplicación por consola para demostrar su funcionamiento.


# Funcionalidades

El proyecto incluye una aplicación por consola que:
- Permite registrar un producto nuevo (Detergente, Cereales, Vino), que agrupa en una colección de productos.
- Muestra los productos registrados.
- Calcula la suma de calorías totales de los alimentos registrados.


# Arquitectura

El proyecto utiliza una arquitectura modular:

### Interfaces 
- Interfaz ILiquido: define las características de un producto que es líquido, describiendo el volumen y el tipo de envase.
- Interfaz IAlimento: define las características de un producto que es alimento, describiendo la fecha de caducidad.
- Interfaz ICalorias: define las características de un producto que tiene calorías, calculando sus calorías.
- Interfaz IDescuento: define las características de un producto que puede tener descuento, calculando el precio tras aplicar este.

### Clases

- Clase abstracta Producto: define un prodcto de cualquier tipo mediante su marca y precio.
- Clase Detergente: representa una botella de detergente líquido que puede tener descuento.
- Clase Cereales: representa una caja de cereales que es un alimento y tiene calorías.
- Clase Vino: representa una botella de vino que puede tener descuentos y tiene calorías.
