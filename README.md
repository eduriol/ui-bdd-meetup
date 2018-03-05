# UI BDD Meetup
Ejemplo de uso de BDD para especificar tests de aceptación contra la interfaz gráfica, empleando Cucumber, Selenium & JUnit. Este código se usó originalmente en el meetup de [En mi local funciona](http://enmilocalfunciona.io/).
## Instalación
En primer lugar necesitas tener [Maven](https://maven.apache.org/) instalado, así como el navegador [Chrome](https://www.google.es/intl/es/chrome/). Una vez que lo tienes, para construir el proyecto, simplemente sigue los siguientes pasos:
```
git clone https://github.com/eduriol/ui-bdd-meetup.git
cd ui-bdd-meetup
mvn package
```
La construcción habrá tenido éxito si los tests pasan.
**Nota:** El proyecto está definido para su ejecución en Windows. Si deseas ejecutarlo en Linux, tienes que cambiar el fichero chromedriver.exe por su versión para Linux, que puedes descargar [aquí](https://sites.google.com/a/chromium.org/chromedriver/downloads). Igualmente, se tiene que cambiar la línea de código en la que se define el driver a usar, quitando el sufijo .exe para que encuentra el driver de Linux.
## Ejecución
Cada vez que necesites volver a ejecutar los tests, simplemente ejecuta el siguiente comando:
```
mvn test
```
## Seguimiento del meetup
Los commits y su mensaje asociado están pensados para facilitar el seguimiento y explicación del meetup, a modo de pasos explicativos de un taller. Por ello te resultará más sencillo seguir la explicación si vas haciendo checkout de cada commit del histórico y observando la evolución del código.