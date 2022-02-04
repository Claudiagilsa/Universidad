package Clases;

public class OllasCocinaBuilder extends Instrumentos {

    //crea objetos asignadole valores predeterminados,no se crean objetos de distintas clases sino de una sola
    @Override
    public void builTamanio() {
        cubiertos.setTamanio("Grande");
    }

    @Override
    public void builTipo() {
        cubiertos.setTipo("Vapor");
    }

    @Override
    public void builMaterial() {
        cubiertos.setMaterial("Aluminio + Acero");
    }
}
