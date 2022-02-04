package Clases;

public abstract class PizzaBuilder {
    protected Pizza pizza;

    public Pizza getPizza(){
        return pizza;
    }
//metodo para instanciar la pizza
    public void crearNuevaPizza(){
        pizza=new Pizza();
    }
//encargado de asignar valores predeterminados, sin darles un cuerpo por en de son abtrasctos
    public abstract void builMasa();
    public abstract void builSalsa();
    public abstract void builRelleno();

}
