public class Helatodo implements CargaDeAuto, CargaDeBici {

    public Helatodo(){

    }

    public boolean puedeSerCargadaPorClasico(){
        return true;
    }

    public boolean puedeSerCargadaPorCargaConBici(){
        return true;
    }
}
