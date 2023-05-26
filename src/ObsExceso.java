import java.util.Observable;
import java.util.Observer;

public class ObsExceso implements Observer {
    View miVista = new View();

    /**
     * oberva cuando cambia la velocidad
     * @param o     the observable object.
     * @param arg   an argument passed to the {@code notifyObservers}
     *                 method.
     */
    @Override
    public void update(Observable o, Object arg) {
        //Precisamos castear el objeto a Coche
        Coche obxC = (Coche) arg;
        miVista.muestraVelocidad(obxC.matricula, obxC.velocidad);
        if (obxC.velocidad>120)
            Dialog.launch();

    }
}