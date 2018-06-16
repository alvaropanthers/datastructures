
public class LinkedList{


    private Node first;
    private int size;


    public LinkedList(){
	this.first = null;
	this.size = 0;
    }

    public LinkedList(Node first){
	this.first = first;
	this.size = 1;
    }

    public void insert(int key){
	this.first = insert(this.first, key);
    }

    private Node insert(Node first, int key){
	if(first == null){
	    ++size;
	    return new Node(key);
	}
	
	first.setNext(insert(first.getNext(), key));

	return first;
    }

    public boolean delete(int key){
	if(delete(this.first, key) == null)
	    return false;

	return true;
    }

    public Node delete(Node first, int key){
	if(first == null || first.getNext() == null)
	    return null;

	if(first.getNext().getKey() == key){
	    if(first.getNext().getNext() != null)
		first.setNext(first.getNext().getNext());
	    return first;
	}
	
	return delete(first.getNext(), key);
    }
    
    public boolean isPresent(int key){
	return isPresent(this.first, key);
    }
    
    private boolean isPresent(Node first, int key){
	if(first == null)
	    return false;

	if(first.getKey() == key)
	    return true;

	return isPresent(first.getNext(), key);
    }

    public void printList(){
	if(first == null){
	    System.out.println("LinkedList is empty");
	    return;
	}
	printList(this.first);
	System.out.println("");
    }

    private Node printList(Node first){
	if(first != null){
	    System.out.printf("%d ", first.getKey());
	    printList(first.getNext());
	}

	return first;
    }

    public int getSize(){ return this.size; }
}
