public class RickVaquero extends Rick{
    @Override
    public void mostrar() {
        System.out.println("soy vaquero");
    }

    public RickVaquero() {
        comportamientoTeletransportacion=new Teletransportable();
        comportamientoMorty=new UnMorty();
    }
}
