public class Iterador {

    private Lista l;
    private Nodo actual;
    private Nodo Current;

    public Iterador(Lista l){
        this.l=l;
        Current=l.getInicio();
    }

    public Nodo getCurrent(){
        return Current;
    }

    public boolean hasNext(){
        return (actual.getNext()!=null);
    }

    public Nodo getFirst(){
        return l.getInicio();
    }

    public Nodo getNext(){
        actual.getNext();
        return actual;
    }
}
