package Clases;

public class HawaiPizzaBuilder extends PizzaBuilder{

    //crea objetos asignadole valores predeterminados,no se crean objetos de distintas clases sino de una sola
    @Override
    public void builMasa() {
        pizza.setMasa("suave");
    }

    @Override
    public void builSalsa() {
        pizza.setSalsa("dulce");
    }

    @Override
    public void builRelleno() {
        pizza.setRelleno("Pollo + tocineta");
    }
}
