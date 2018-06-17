public class Main{

    public static void main(String[] args){
	BinarySearchTree bst = new BinarySearchTree();
	bst.insert(10);
	bst.insert(20);
	bst.insert(400);
	bst.insert(3);

	bst.printTree();
	System.out.printf("%d is the size of the tree\n", bst.getSize());
	bst.findMin();
	System.out.println("End of execution");
    }



}
