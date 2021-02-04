package Casa;

import ComponenteElectrico.ComponenteElectrico;

import java.util.ArrayList;
import java.util.List;

public class Casa {

    private List<ComponenteElectrico> componentes = new ArrayList<>();

    public void agregarComponente(ComponenteElectrico componente){
        this.componentes.add(componente);
    }

    public int getGastoTotal(){

        int gastoTotal = 0;

        for(ComponenteElectrico componente : componentes){
            gastoTotal += componente.getConsumo();
        }
        return gastoTotal;
    }
}
