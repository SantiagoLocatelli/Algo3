package TipoMadera;

public class Quebracho {
    private static final int PRECIO_KILO = 4;
    private static final int GRADO_PUREZA = 2;
    private int cantidadKilos;

    public Quebracho(int cantidadKiloskilos){
        this.cantidadKilos = cantidadKiloskilos;
    }

    public int calcularConsumo(int metrosCuadrados){
        return GRADO_PUREZA * cantidadKilos * metrosCuadrados * cantidadKilos;
    }

    public int getKilos(){
        return cantidadKilos;
    }
}
