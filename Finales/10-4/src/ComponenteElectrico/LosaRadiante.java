package ComponenteElectrico;


public class LosaRadiante implements ComponenteElectrico{
    private int precioKw;
    private int metros;

    public LosaRadiante( int precioKw, int metros ){
        this.precioKw = precioKw;
        this.metros = metros;
    }

    public int getConsumo(){
        return metros * metros * precioKw;
    }
}
