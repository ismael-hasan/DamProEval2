
_Crea una clase llamada Cancion con los atributos título, artista y duración en segundos. Crea una segunda clase con un método main desde la que se creen dos objetos Cancion, se seteen todos sus atributos, se muestren sus datos por pantalla usando los getters y se modifique la duración de una de ellas usando el setter. A continuación, imprime el título de la canción más larga._

Este ejercicio **nos indica los atributos exactos que necesitamos** en el objeto. Sugiere usar getters y setters. 

En la clase del 'main' es donde comienza la ejecución del programa. Esta clase se encargará de crear los objetos y usar los métodos de los mismos para cumplir el enunciado. 

**Hemos incluído una alternativa** a la clase del 'main'; hay un código concreto que se repite 4 veces en el main, el que imprime el objeto. En lugar de escribir el mismo código 4 veces, lo externalizamos a una función (_idealmente, sobreescribiríamos el método 'toString()' del objeto, pero en este caso aún no hemos llegado a overriding de métodos_). La ventaja es que si queremos cambiar cómo se imprimen las canciones simplemente cambiamos el código una vez en ese nuevo método, y cada una de las 4 veces que llamemos a ese método usará el código actualizado. 
