public class Controller {
    static Model miModelo = new Model();
    static View miVista = new View();
    public static void main(String[] args) {
        IU.start();
    }

    /**
     * Crea un coche y actualiza la UI
     * @param matricula
     * @param modelo
     */
    public static void crearCoche(String modelo, String matricula){
        Coche aux = miModelo.crearCoche(modelo,matricula);
        if(aux!=null){
            miVista.muestraVelocidad(aux.matricula, aux.velocidad);
        }
    }

    /**
     * Busca un coche y actualiza la UI
     * @param matricula
     */
    public static void getCoche(String matricula){
        Coche aux = miModelo.getCoche(matricula);
        if(aux!=null){
            miVista.muestraVelocidad(aux.matricula, aux.velocidad);
        }
    }

    /**
     * Sube el valor de velocidad y actualiza la UI
     * @param matricula
     * @param v -> velocidad a subir
     */
    public static void subirVelocidad(String matricula, Integer v ){
        Coche aux = miModelo.getCoche(matricula);
        if(aux!=null) {
        miModelo.subirVelocidad(aux.matricula,v);
        miVista.muestraVelocidad(aux.matricula, aux.velocidad);
        }
    }

    /**
     * Baja el valor de velocidad y actualiza la UI
     * @param matricula
     * @param v -> velocidad a bajar
     */
    public static void bajarVelocidad(String matricula, Integer v ){
        Coche aux = miModelo.getCoche(matricula);
        if(aux!=null) {
            miModelo.bajarVelocidad(aux.matricula,v);
            miVista.muestraVelocidad(aux.matricula, aux.velocidad);
        }
    }
}