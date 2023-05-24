import java.awt.*;

public class View {
    void muestraVelocidad(String matricula, Integer v){
        IU.speedNLabel.setText(""+v);
        IU.plateNLabel.setText(""+ matricula);
    }
}
