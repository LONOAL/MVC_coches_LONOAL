# Arquitectura MVC

![mvc](https://miro.medium.com/v2/0*Qf1s2lG86MjX-Zcv.jpg)

Aplicación que trabaja con objetos coches, modifica la velocidad y la muestra.

En este caso se ha añadido un observer que detecta cuando se sobrepasan los 120km/h y lanza un jdialog que alerta de el exceso de velocidad.



---
## Diagrama de clases:

```mermaid
classDiagram
    class ObserverVelocidad {
        +update()
    }
    class Observable {
    }
    class Coche {
        String: matricula
        String: modelo
        Integer: velocidad
    }
    class Coche {
        String: matricula
        String: modelo
        Integer: velocidad
    }
      class Controller{
          +main()
          +crearCoche(String, String)
          +crearCoche(String)
          +subirVelocidad(String,Integer)
          +bajarVelocidad(String,Integer)
      }
      class View {+muestraVelocidad(String, Integer)}
      class Model {
          ArrayList~Coche~: parking
          +crearCoche(String, String, String)
          +getCoche(String)
          +cambiarVelocidad(String, Integer)
          +subirVelocidad(String, Integer)
          +bajarVelocidad(String, Integer)
          +getVelocidad(String)
      }

    Controller "1" *-- "1" Model : association
    Controller "1" *-- "1" View : association
    Model "1" *-- "1..n" Coche : association
    Observable <|-- Model
    Controller "1" *-- "1" ObserverVelocidad: association
      
```

---

## Diagrama de Secuencia

Ejemplo básico del procedimiento, sin utilizar los nombres de los métodos


```mermaid
sequenceDiagram
    participant Model
    participant Controller
    participant View
    Controller->>Model: Crear un coche
    activate Model
    Model-->>Controller: Creado
    deactivate Model
    Controller->>+View: Muestra la velocidad
    activate View
    View->>-View: Mostrando velocidad
    View-->>Controller: Listo
    deactivate View
    Controller->>Model: Aumentar velocidad
    activate Model
    Model-->>Controller: Aumentada
    deactivate Model
    Controller->>+View: Muestra la velocidad
    activate View
    View->>-View: Mostrando velocidad
    View-->>Controller: Listo
    deactivate View
    Controller->>Model: Dismunuye velocidad
    activate Model
    Model-->>Controller: Disminuida
    deactivate Model
    Controller->>+View: Muestra la velocidad
    activate View
    View->>-View: Mostrando velocidad
    View-->>Controller: Listo
    deactivate View
    Controller->>Model: Busca coche
    activate Model
    Model-->>Controller: Encontrado
    deactivate Model
    Controller->>+View: Muestra la velocidad
    activate View
    View->>-View: Mostrando velocidad
    View-->>Controller: Listo
    deactivate View
    
```
---

## Implementando observer:
![observer](https://stackabuse.s3.amazonaws.com/media/observer-design-pattern-in-python-01.jpg)

El patrón Observer es como un sistema de notificaciones. Un objeto se registra para recibir actualizaciones automáticas cada vez que ocurre un cambio en otro objeto.
```mermaid
sequenceDiagram
    participant View
    participant Controller
    participant ObserverVelocidad
    participant Model
    
    Controller->>Model: Aumenta velocidad
    activate Model
    Model->>ObserverVelocidad: Notificacion de cambio de velocidad
    deactivate Model
    activate ObserverVelocidad
    ObserverVelocidad->>+View: Muestra la velocidad
    deactivate ObserverVelocidad
    activate View
    View->>-View: Mostrando velocidad
    deactivate View
```
## Pasos para la configuración

1. Model:
    - Extender `Observable`
2. Metodos que debamos observar:
    - setChanged()
    - notifyObserver(valor)

3. Clase observer:
    - Crear método `update()`
3. Controller
    - Instanciar el observer.
    - Añadir este observer al observable con `addObserver()`

