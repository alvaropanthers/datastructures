public class Test{

    public static void main(String[] args){
	int[] array = new int[2];
	array[0] = 10;
	array[1] = 20;

	int[] array2 = array;

	array2[0] = 50;

	System.out.printf("array is %d array2 is %d\n", array[0], array2[0]);

	array[0] = 43;
	System.out.printf("array is %d array2 is %d\n", array[0], array2[0]);

    }



}
