import Casa.Casa;
import ComponenteElectrico.*;
import org.junit.Test;

public class CasaTest {
    @Test
    public void test(){

        Casa casa = new Casa();

        Estufa estufa = new Estufa(1000, 10 , 1);
        casa.agregarComponente(estufa);

        LosaRadiante losa = new LosaRadiante(10, 10);
        casa.agregarComponente(losa);

        CercoElectrico cerco = new CercoElectrico(10, 10);
        casa.agregarComponente(cerco);

        org.junit.Assert.assertEquals( 11100, casa.getGastoTotal());
    }
}
