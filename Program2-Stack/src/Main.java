import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		String[] file = getFileContents("postfix");
		for(int i = 0; i < file.length; i++){
			String line = file[i];
			ParenthesisTest p = new ParenthesisTest(line);
			p.test();
			
			
		}
	
		
		
	}
	
	public static String[] getFileContents(String filename){
		String[] temp;
		int lines = 0;
		try {
			Scanner sc = new Scanner(new File(filename));
			while(sc.hasNextLine()){
				sc.nextLine();
				lines++;
			}
			temp = new String[lines];
			sc = new Scanner(new File(filename));
			int i = 0;
			while(sc.hasNextLine()){
				temp[i] = sc.nextLine();
				i++;
			}
			sc.close();
			return temp;
		} catch (FileNotFoundException e) {
			System.out.println("File ("+ filename + ") Not Found.");
		}
		
		return null;
		
	}

	
}
