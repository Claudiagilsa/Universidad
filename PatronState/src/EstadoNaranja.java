public class EstadoNaranja extends EstadoSemaforo{
    public EstadoNaranja( Semaforo objSemaforo ) {
        this.objSemaforo = objSemaforo;
    }
    // -------------------------------------------
    @Override
    public void mostrar() {
        System.out.println("Reduce velocidad va a pasar a rojo");
    }
}
