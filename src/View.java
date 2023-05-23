public class View {

    void showInterface(){
        UI.launch();
    }
    boolean muestraVelocidad(String matricula, Integer v){
        System.out.println(matricula + ": " + v + "km/hr");
        return true;
    }
}
