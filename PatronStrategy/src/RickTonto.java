public class RickTonto extends Rick{
    @Override
    public void mostrar() {
        System.out.println("soy Rick tonto");
    }

    public RickTonto() {
        comportamientoTeletransportacion=new NoTeletransportable();
        comportamientoMorty=new SinMorty();
    }
}
