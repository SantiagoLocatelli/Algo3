import javax.sound.sampled.Port;
import java.util.Stack;

public interface Vehiculo {

    void cargar(Carga carga);

    Carga descargar();
}
