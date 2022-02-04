public class Rick137 extends Rick{

    @Override
    public void mostrar() {
        System.out.println("soy 137");
    }

    public Rick137() {
        comportamientoMorty=new UnMorty();
        comportamientoTeletransportacion=new Teletransportable();
    }
}
