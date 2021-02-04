package TipoMadera;

public class Pino implements TipoMadera{
    private static final int PRECIO_KILO = 2;
    private static final int COEFICIENTE_CALORICO = 3;
    private int cantidadKilos;

    public Pino(int cantidadKiloskilos){
        this.cantidadKilos = cantidadKiloskilos;
    }

    public int calcularConsumo(int metrosCuadrados){
        return metrosCuadrados * cantidadKilos * PRECIO_KILO / COEFICIENTE_CALORICO;
    }

    public int getKilos(){
        return cantidadKilos;
    }

}
