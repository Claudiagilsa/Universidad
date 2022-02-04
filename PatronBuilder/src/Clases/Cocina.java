package Clases;

public class Cocina {

    private PizzaBuilder pizzaBuilder;

    public void setPizzaBuilder(PizzaBuilder piz){
        pizzaBuilder=piz;
    }

    public Pizza getPizza(){
        return pizzaBuilder.getPizza();
    }
//metodos que tienen un cuerpo, ya que recibe argumentos de clases heredada abstracta
    public void construirPizza(){
        pizzaBuilder.crearNuevaPizza();
        pizzaBuilder.builMasa();
        pizzaBuilder.builRelleno();
        pizzaBuilder.builSalsa();
    }
    //es el director que se encarga de hacer uso de los objetos builder
}
