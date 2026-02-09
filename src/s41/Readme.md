_Se quiere modelar un videojuego sencillo. Cada jugador tiene un nombre y una cantidad de vida. Además, cada jugador tiene un inventario donde se guardan los objetos que posee. Diseña las clases necesarias y programa un ejemplo donde se cree un jugador, se le añadan varios objetos al inventario y se muestre su estado. El programa principal no debe acceder directamente a los datos del inventario._

Para este ejercicio tenemos que modelar una clase Jugador; aparte de sus atributos básicos, tiene un inventario donde puede haber varios objetos: 
- Debemos crear una clase para representar dichos objetos de inventario; le llamaremos Item. 
- En la clase Jugador incluiremos un atributo/variable que sea un array de items al que llamaremos inventario. 
- En la clase Jugador, sólo necesitamos como métodos el constructor y un método de mostrarEstado que nos diga el nombre, la vida y algún dato sobre el inventario (podemos mostrar todos los objetos, decir cuantos tiene...)

Como apartado extra en este ejercicio, hemos añadido a la clase Item un método `getTextoAMostrar()` que nos devuelve un String que construye con la información del objeto; así, cada vez que queremos imprimirlo, podemos obtener el texto a imprimir para ese objeto con ese método.