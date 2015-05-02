import java.io.File;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {

		int[] array = readFile("data.txt");
		
		

		System.out.println("Using Tree:");
		Tree tree = new Tree();
		tree.buildBinaryTree(array);
		tree.inOrder(tree.root);
		System.out.println("\n"+ tree.compares + " comparisons");
		


		System.out.println("\nUsing BruteForce:");
		Sort sort = new Sort(array);
		sort.bruteSort();
		sort.print();
		System.out.println("\n"+ sort.compares + " comparisons");
		
		
		
		
	}
	public static int[] readFile(String file){
		try{
			Scanner sc = new Scanner(new File(file));
			int count = 0;
			while(sc.hasNext()){
				sc.nextInt();
				count++;
			}
			//defining size for names/hashed
			int[] temp = new int[count];

			sc = new Scanner(new File(file));
			count = 0;
			while(sc.hasNextLine()){
				temp[count] = sc.nextInt();
				count++;
			}
			sc.close();
			return temp;

		} catch (Exception e){
			System.out.println("No file found.");
			return null;
		}
	}

}
