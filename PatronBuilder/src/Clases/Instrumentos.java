package Clases;

public abstract class Instrumentos {
    protected Cuchara cubiertos;

    public Cuchara getInstrumentos(){
        return cubiertos;
    }
//metodo para instanciar la pizza
    public void crearNuevaCuchara(){
        cubiertos=new Cuchara();
    }
//encargado de asignar valores predeterminados, sin darles un cuerpo por en de son abtrasctos
    public abstract void builTamanio();
    public abstract void builTipo();
    public abstract void builMaterial();

}
