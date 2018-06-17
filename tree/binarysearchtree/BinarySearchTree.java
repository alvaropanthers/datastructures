public class BinarySearchTree{

    private BinarySearchTreeNode root;
    private int size;

    public BinarySearchTree(){
	this.size = 0;
    }

    public void insert(int key){
	insert(key, root);
    }
    
    /**
     * Inserts a new node in the tree
     * params: int key, BinarySearchTreeNode node
     * returns Node
     */
    public BinarySearchTreeNode insert(int key, BinarySearchTreeNode node){
	if(node == null){
	    ++size;
	    return new BinarySearchTreeNode(key);
	}
	
	if(key < node.key)
	    node.left = insert(key, node.left);
	else if(key > node.key)
	    node.right = insert(key, node.right);

	return node;
    }

    public void printTree(){
	printTree(this.root);
	System.out.println("");
     }

    private BinarySearchTreeNode printTree(BinarySearchTreeNode node){
	if(node != null){
	    printTree(node.left);
	    System.out.printf("%d ", node.key);
	    printTree(node.right);
	}

	return node;
    }

    public void findMin(){
	System.out.printf("min key is %d\n", findMin(this.root).key);
    }
    
    private BinarySearchTree findMin(BinarySearchTree node){
	if(node == null)
	    return;

	return findMin(node.left);
    }
    
    public int getSize(){ return this.size; }
}
