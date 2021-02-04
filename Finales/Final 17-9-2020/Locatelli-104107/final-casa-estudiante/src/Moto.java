

public class Moto implements Vehiculo{

    private PortaCarga portaCarga;

    public Moto() {
        this.portaCarga = new PortaCargaClasico();
    }

    public void cargar(Carga carga){
        this.portaCarga.cargar(carga);
    }

    public Carga descargar(){
        return this.portaCarga.descargar();
    }
}
