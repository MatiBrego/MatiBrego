public class Node<T>{
    Node<T> next;
    Node<T> prev;
    T element;

    public Node(T element){
        this.element = element;
        next = null;
        prev = null;
    }
}
