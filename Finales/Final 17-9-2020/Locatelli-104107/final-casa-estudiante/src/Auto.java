

public class Auto implements Vehiculo {

    private PortaCarga portaCarga;

    private Auto(PortaCarga portaCarga){
        this.portaCarga = portaCarga;
    }

    public static Auto conPortaCargaClasico(){
        PortaCarga portaCarga = new PortaCargaClasico();
        Auto auto = new Auto(portaCarga);
        return auto;
    }


    public static Auto conPortaCargaConBici(){
        PortaCarga portaCarga = new PortaCargaConBici();
        Auto auto = new Auto(portaCarga);
        return auto;
    }

    public void cargar(Carga carga){
        this.portaCarga.cargar(carga);
    }

    public Carga descargar(){
        return this.portaCarga.descargar();
    }
}
