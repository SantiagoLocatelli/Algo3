public class Bici implements CargaDeAuto{

    public Bici(){

    }

    public boolean puedeSerCargadaPorClasico(){
        return false;
    }

    public boolean puedeSerCargadaPorCargaConBici(){
        return true;
    }
}
