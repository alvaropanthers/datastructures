
public class Main{

    public static void main(String[] args){

	
	LinkedList linkedList = new LinkedList();

	if(args.length > 0){
	    addElements(linkedList, Integer.parseInt(args[0]));	    
	    linkedList.printList();

	    if(args.length > 1){
		if(linkedList.isPresent(Integer.parseInt(args[1])))
      		   System.out.printf("%d was found\n", Integer.parseInt(args[1]));
	       else
		   System.out.printf("%d was not found\n", Integer.parseInt(args[1]));
	    }
	    
	    System.out.printf("size of list is %d\n", linkedList.getSize());

	    if(args.length > 2){
		System.out.printf("Deleting key %d\n", Integer.parseInt(args[2]));
		linkedList.delete(Integer.parseInt(args[2]));
		linkedList.printList();
	    }
	}

       
    }

    public static void addElements(LinkedList list, int amount){
	for(int x = 0; x < amount; ++x)
	    list.insert(x);
    }

}
