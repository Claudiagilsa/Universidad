public class Nodo  {

    private ElementoGeometrico element;
    private Nodo next;

    public Nodo(ElementoGeometrico e)
    {
        this.element=e;
        next=null;
    }

    public ElementoGeometrico getElement() {
        return element;
    }

    public void setElement(ElementoGeometrico element) {
        this.element = element;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }
}
