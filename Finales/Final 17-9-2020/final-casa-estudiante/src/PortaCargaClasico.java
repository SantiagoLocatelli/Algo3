import java.util.Stack;

public class PortaCargaClasico implements PortaCarga{

    Stack<Carga> cargas;

    public PortaCargaClasico(){
        this.cargas = new Stack<>();
    }

    public void cargar(Carga carga){
        if( carga.puedeSerCargadaPorClasico() ){
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
