import java.io.File;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int[] array = readFile("data.txt");
		long start, end;
		

		System.out.println("Using Tree:");
		
		start = System.currentTimeMillis();
			Tree tree = new Tree();
			tree.buildBinaryTree(array);
			tree.inOrder(tree.root);
		end = System.currentTimeMillis();
		
		
		System.out.println("\n"+ tree.compares + " comparisons");
		System.out.println(""+ (end-start) + " milliseconds");
		//System.out.println(ObjectSizeFetcher.getObjectSize(tree) + " bytes");
		


		System.out.println("\nUsing BruteForce:");
		start = System.currentTimeMillis();
			Sort sort = new Sort(array);
			sort.bruteSort();
			sort.print();
		end = System.currentTimeMillis();
		
		System.out.println("\n"+ sort.compares + " comparisons");
		System.out.println(""+ (end-start) + " milliseconds");
		
		System.out.println(""
				+ "\nComments :" +
				"\nTree uses less comparisons (saves computation time) but uses a lot of memory."
				+ "\nBruteForce is efficient for memory causes."
				+ "\nTree is fun to write."
				);
		
		
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
