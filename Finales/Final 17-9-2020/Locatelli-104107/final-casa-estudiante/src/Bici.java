public class Bici implements Carga{

    public Bici(){

    }

    public boolean puedeSerCargadaPorClasico(){
        return false;
    }

    public boolean puedeSerCargadaPorCargaConBici(){
        return true;
    }
}
