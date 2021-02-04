package ComponenteElectrico;


public class Estufa implements ComponenteElectrico{
    private int calorias;
    private int precioKw;
    private int ambientes;

    public Estufa(int calorias, int precioKw, int ambientes){
        this.calorias = calorias;
        this.precioKw = precioKw;
        this.ambientes = ambientes;
    }

    public int getConsumo(){
        return precioKw * ambientes * calorias;
    }
}
