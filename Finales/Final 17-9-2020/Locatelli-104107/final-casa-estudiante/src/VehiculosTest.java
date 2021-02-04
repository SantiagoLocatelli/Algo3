import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class VehiculosTest {

    @Test
    public void CargaSeCargaBienEnUnAuto() {

        Auto auto = Auto.conPortaCargaClasico();
        Carga helatodo = new Helatodo();

        auto.cargar(helatodo);

        assertEquals( helatodo, auto.descargar() );
    }

    @Test
    public void NoSePuedeCargarBiciEnAuto(){

        Auto auto = Auto.conPortaCargaClasico();
        Carga bici = new Bici();

        assertThrows(VehiculoNoAdmiteCargaError.class, ()->{
            auto.cargar(bici);
        });
    }

    @Test
    public void biciSeCargaBienEnAuto(){
        Auto auto = Auto.conPortaCargaConBici();
        Carga bici = new Bici();
        auto.cargar(bici);

        assertEquals( bici, auto.descargar() );
    }

    @Test
    public void sePuedenGuardaVariasCargasEnAutoConPortaBici(){

        Auto auto = Auto.conPortaCargaConBici();

        Carga helatodo = new Helatodo();
        auto.cargar(helatodo);

        Carga bici = new Bici();
        auto.cargar(bici);

        Carga helatodo2 = new Helatodo();
        auto.cargar(helatodo2);

        assertEquals(helatodo2, auto.descargar());
        assertEquals(bici, auto.descargar());
        assertEquals(helatodo, auto.descargar());
    }

    @Test
    public void portaCargaVacioNoSePuedeDescargar(){
        Moto moto = new Moto();

        assertThrows(PortaCargaVacioError.class, ()->{
            moto.descargar();
        });
    }
}
