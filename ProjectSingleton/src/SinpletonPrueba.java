import java.sql.SQLOutput;

public class SinpletonPrueba {

    private String nombre;
    private static SinpletonPrueba soyUnico;

    private SinpletonPrueba(String nombre){
        this.nombre=nombre;
        System.out.println("Mi nombre es: " + this.nombre);
    }

    public static SinpletonPrueba getSingletonInstance(String nombre) {
        if (soyUnico == null){
            soyUnico = new SinpletonPrueba(nombre);
        }
        else{
            System.out.println("No se puede crear el objeto "+ nombre + " porque ya existe un objeto de la clase SoyUnico");
        }

        return soyUnico;
        }


}
