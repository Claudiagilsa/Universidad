package Clases;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import javax.xml.bind.SchemaOutputResolver;

public class Cuchara {

    private String tamanio = "";
    private String tipo = "";
    private String Material = "";


    public void setMaterial(String material) {
        this.Material = material;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void mostrarMSM(){
        System.out.println("ya se creo un elemento de cocina, de "+tamanio+" que es de "+ tipo +" y de " + Material);
    }

}
