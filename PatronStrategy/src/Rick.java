public abstract class Rick {

    ComportamientoTeletransportacion comportamientoTeletransportacion;
    ComportamientoMorty comportamientoMorty;
    public abstract void mostrar();

    public void ejecutarTeletransportar(String dim){
        comportamientoTeletransportacion.teletransportar(dim);
    }

    public void ejecutarllamarMorty(){
        comportamientoMorty.llamarMorty();
    }

    public void setComportamientoTeletransportacion(ComportamientoTeletransportacion cdlm) {
        this.comportamientoTeletransportacion = cdlm;
    }

    public void setComportamientoMorty(ComportamientoMorty cdt) {
        this.comportamientoMorty = cdt;
    }
}
