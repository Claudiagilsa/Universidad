public class RickSimple extends Rick{
    @Override
    public void mostrar() {
        System.out.println("soy Rick simple");
    }

    public RickSimple() {
        comportamientoTeletransportacion=new NoTeletransportable();
        comportamientoMorty=new UnMorty();
    }
}
