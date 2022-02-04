package Principal;
import Clases.*;
public class Principal {

    public static void main(String[] args){
        //se isntancia objeto director
        Cocina cocina=new Cocina();//director
        //Instancias de los builder concretos
        PizzaBuilder hawai_PizzaBuild=new HawaiPizzaBuilder();
        //PizzaBuilder picante_PizzaBuild=new PicantePizzaBuilder();

        cocina.setPizzaBuilder(hawai_PizzaBuild);
        //cocina.setPizzaBuilder(picante_PizzaBuild);
        cocina.construirPizza();

        Pizza pizza= cocina.getPizza();

    }
}
