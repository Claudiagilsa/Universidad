package Principal;
import Clases.*;
public class Principal {

    public static void main(String[] args){
        //se isntancia objeto director
        Cocina cocina=new Cocina();//director
        //Instancias de los builder concretos
        Instrumentos OllaCocina_Build=new OllasCocinaBuilder();
        Instrumentos PlatoCocina_Build=new PlatosCocinaBuilder();


        cocina.setUtensiliosCocina(OllaCocina_Build);
        cocina.construirCuchara();

        Cuchara cubiertos= cocina.getCuchara();
        cubiertos.mostrarMSM();

        cocina.setUtensiliosCocina(PlatoCocina_Build);
        cocina.construirCuchara();
        Cuchara platos= cocina.getCuchara();
        platos.mostrarMSM();




    }
}
