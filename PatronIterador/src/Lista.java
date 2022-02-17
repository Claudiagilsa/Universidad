public class Lista {

    private Nodo inicio;
    private Nodo fin;


    public Lista(Nodo n){
        inicio=n;
        fin=inicio;
    }

    public void addElement(Nodo n){
        fin.setNext(n);
        fin=fin.getNext();
    }

    public Nodo getInicio(){
        return inicio;
    }
}
