import java.util.Stack;

public class PortaCargaConBici implements PortaCarga{

    Stack<Carga> cargas;

    public PortaCargaConBici(){
        this.cargas = new Stack<>();
    }

    public void cargar(Carga carga){
        if( carga.puedeSerCargadaPorCargaConBici() ){
            this.cargas.push(carga);
        }else{
            throw new VehiculoNoAdmiteCargaError();
        }
    }

    public Carga descargar(){

        if( cargas.empty() ){
            throw new PortaCargaVacioError();
        }
        return this.cargas.pop();
    }
}
