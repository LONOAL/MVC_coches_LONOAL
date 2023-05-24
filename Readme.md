# Arquitectura MVC

Aplicación que trabaja con objetos coches, modifica la velocidad y la muestra

---
## Diagrama de clases:

```mermaid
classDiagram
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


