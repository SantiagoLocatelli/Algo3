package ComponenteElectrico;

public class CercoElectrico implements ComponenteElectrico{
    private int precioKw;
    private int metros;

    public CercoElectrico(int precioKw, int metros){
        this.precioKw = precioKw;
        this.metros = metros;
    }

    public int getConsumo(){
        return metros * precioKw;
    }
}
