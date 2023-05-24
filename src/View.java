import java.awt.*;

public class View {
    void muestraVelocidad(String matricula, Integer v){
        IU.speedNLabel.setText("V: " + v);
        IU.plateNLabel.setText("M: " + matricula);

    }
}
