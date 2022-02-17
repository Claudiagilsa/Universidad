import java.util.Random;

public class Principal {

    public static void main(String[] args) {
        Vertice v=new Vertice(500,300);
        Nodo n=new Nodo(v);

        Random r=new Random();
        Lista l=new Lista(n);

        for(int i=0;i<4;i++){
            Vertice c=new Vertice(r.nextInt(),r.nextInt());
            Nodo f=new Nodo(c);
            l.addElement(f);
            System.out.println("Elemento generado: "+c.getX()+"," + c.getY());
        }

        Iterador i=new Iterador(l);
        System.out.println("vertice: (x,y): "+ ((Vertice)i.getFirst().getElement()).getX()+","+
                ((Vertice)i.getFirst().getElement()).getY());


        while ((i.hasNext())){
            Vertice q=(Vertice) i.getNext().getElement();
            System.out.println("vertice: (x,y): "+ q.getX()+","+q.getY());
        }

    }
}
