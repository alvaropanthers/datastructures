public class Main{

    public static void main(String[] args){
	List list = new List();
	for(int x = 0; x < args.length; ++x)
	    list.insert(Integer.parseInt(args[x]));
       	list.printList();
	System.out.printf("Adding %d on position %s\n", 1010, 5);
	list.insert(1010, 5);   
       	list.printList();
     }

}
