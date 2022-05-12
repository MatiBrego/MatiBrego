public class SortedList<T>{
    Node head;
    Node centinel;
    Node actual;
    int size;

    public SortedList(){
        head = new Node<T>(null);
        centinel = new Node<T>(null);
        size = 0;
    }

    public void next(){
        actual = actual.next;
    }

    public void insert(T element){
        if(size == 0) {
            Node aux = new Node<T>(element);
            head.next = aux;
            actual = aux;
        }
    }

}
