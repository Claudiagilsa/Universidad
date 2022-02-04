package Clases;

public class Cocina {

    private Instrumentos utensiliosCocina;

    public void setUtensiliosCocina(Instrumentos Cuchara){
        utensiliosCocina =Cuchara;
    }

    public Cuchara getCuchara(){
        return utensiliosCocina.getInstrumentos();
    }
//metodos que tienen un cuerpo, ya que recibe argumentos de clases heredada abstracta
    public void construirCuchara(){
        utensiliosCocina.crearNuevaCuchara();
        utensiliosCocina.builMaterial();
        utensiliosCocina.builTipo();
        utensiliosCocina.builTamanio();
    }
    //es el director que se encarga de hacer uso de los objetos builder
}
