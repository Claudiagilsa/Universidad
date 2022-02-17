public class EstadoRojo extends EstadoSemaforo{

    public EstadoRojo( Semaforo objSemaforo ) {
        this.objSemaforo = objSemaforo;
    }
    // -------------------------------------------
    @Override
    public void mostrar() {
        System.out.println("Detente esta en rojo");
    }
}
