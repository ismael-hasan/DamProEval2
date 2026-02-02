## Ejercicio 9
_Crea una clase CancionStats con los atributos título y número de reproducciones.  
Añade un método reproducir() que incremente en uno el número de reproducciones.  
Desde la clase con main, simula varias reproducciones de una canción en un bucle con dicha función, y muestra el total usando el getter del objeto._

Este ejercicio **nos indica los atributos exactos que necesitamos** en el objeto. Nos dice explícitamente qué método tenemos que implementar. 

No nos indica que tenemos que crear Setters, así que haremos sólo los Getters que sean necesarios para resolver el enunciado, y crearemos el objeto con un **constructor**. Este constructor necesita sólo el parámetro del título de la canción, ya que al crear una nueva canción siempre se crea con 0 reproducciones.  

En la clase del `main` es donde comienza la ejecución del programa. Esta clase se encargará de crear los objetos y usar los métodos de los mismos para cumplir el enunciado. 

**Hemos incluído un añadido** de CancionStats donde modificamos su método [toString()](https://www.tpointtech.com/understanding-tostring()-method); este es un método que nos devuelve una representación textual del objeto para visualizarlo más fácil. 