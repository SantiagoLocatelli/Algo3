package ComponenteElectrico;

import java.util.ArrayList;
import java.util.List;
import TipoMadera.*;

public class Salamandra implements ComponenteElectrico {
    private final int capacidadMaxima = 15;
    private List<TipoMadera> maderas = new ArrayList<>();
    private int metros;
    private int kilos;

    public Salamandra(int metros){
        this.metros = metros;
        this.kilos = 0;
    }

    private boolean sePuedeAgregarMadera( TipoMadera madera ){
        return (capacidadMaxima >= kilos + madera.getKilos());
    }

    public void agregarMadera(TipoMadera madera) throws KilosDeMaderaExcedidosError {

        if( !sePuedeAgregarMadera(madera) ){
            throw new KilosDeMaderaExcedidosError();
        }else{
            this.maderas.add(madera);
            kilos += madera.getKilos();
        }
    }

    public int getConsumo(){
        int consumoTotal = 0;
        for( TipoMadera madera : maderas ){
            consumoTotal += madera.calcularConsumo(metros * metros);
        }
        return consumoTotal;
    }
}
