package Clases;

public class PicantePizzaBuilder extends PizzaBuilder{

    @Override
    public void builMasa(){
        pizza.setMasa("cocida");
    }

    @Override
    public void builSalsa() {
        pizza.setSalsa("picante");
    }

    @Override
    public void builRelleno() {
        pizza.setRelleno("salchicha + piña");
    }


}
