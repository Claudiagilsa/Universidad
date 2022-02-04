package Clases;

public class PlatosCocinaBuilder extends Instrumentos {

    @Override
    public void builTamanio() {
        cubiertos.setTamanio("Mediano");
    }

    @Override
    public void builTipo() {
        cubiertos.setTipo("Sopero");

    }

    @Override
    public void builMaterial() {
        cubiertos.setMaterial("Ceramica");

    }
}
