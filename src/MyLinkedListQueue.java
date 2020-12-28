import java.util.LinkedList;

public class MyLinkedListQueue {
    private Node head;
    private Node tail;

    public MyLinkedListQueue() {
        this.head = null;
        this.tail = null;

    }

    public void enqueue(int key) {
        Node temp = new Node(key);
        if (this.head==null){
            this.head = this.tail = temp;
            return;
        }
        this.tail.next=temp;
        this.tail = temp;

    }
    public Node dequeue(){
        Node temp = head;
        if (this.head==null){
            return null;
        }
        head = head.next;
        if (head==null){
            this.tail = null;
        }
        return temp;

    }

}
