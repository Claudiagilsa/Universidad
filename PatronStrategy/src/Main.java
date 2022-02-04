public class Main {
    public static void main(String[] args) {
        Rick rick=new Rick137();
        rick.mostrar();
        rick.ejecutarllamarMorty();
        rick.ejecutarTeletransportar("C-137");

        rick.setComportamientoMorty(new MuchosMortys());
        rick.ejecutarllamarMorty();

        rick.setComportamientoTeletransportacion(new NoTeletransportable());
        rick.ejecutarTeletransportar("C-137");

        rick.setComportamientoTeletransportacion(new Teletransportable());
        rick.ejecutarTeletransportar("C-137");
    }
}
