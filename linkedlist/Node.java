
public class Node{

    private int key;
    private Node next;

    public Node(int key){
	this.key = key;
    }

    public void setKey(int key){ this.key = key; }
    public void setNext(Node next){ this.next = next; }

    public int getKey(){ return this.key; }
    public Node getNext(){ return this.next; }


}
