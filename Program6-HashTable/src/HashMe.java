import java.util.Scanner;
import java.io.*;

public class HashMe {
	
	public String[] names;
	public int[] hashes;
	public int clashes = 0;
	
	public void readFile(){
		try{
			Scanner sc = new Scanner(new File("names.txt"));
			int count = 0;
			while(sc.hasNextLine()){
				sc.nextLine();
				count++;
			}
			//defining size for names/hashed
			this.names = new String[count];
			this.hashes = new int[count];

			sc = new Scanner(new File("names.txt"));
			count = 0;
			while(sc.hasNextLine()){
				this.names[count] = sc.nextLine();
				count++;
			}
		
			sc.close();

		} catch (Exception e){
			System.out.println("No file found.");
		}
	}

	public void sort(){
		for(int j=0; j<names.length;j++)
		 {
		     for (int i=j+1 ; i<names.length; i++)
		     {
		    	 if(names[i].trim().compareTo(names[j].trim())<0)
		         {
		             String temp = names[j];
		             names[j] = names[i]; 
		             names[i] = temp;
		         }
		     }

		 }
	}
	
	public void hash(int limit){
		
		for(int i = 0; i < names.length; i++){
			int _hash = getHashIndex(limit,i);
			while(true){
				if(!inArray(hashes,_hash)){
					this.hashes[i] = _hash;
					break;
				} else {
					_hash++;
				}
			}	
		}
		System.out.println(this.clashes  + " clashes in the hash table.");
	}
	
	public boolean inArray(int[] array, int item){
		for(int i = 0; i < array.length; i++){
			if(array[i] == item){
				return true;
			}
		}
		
		return false;
	}
		
	public int getHashIndex(int limit,int i){
		
		double d = (double) limit/ (double) names.length * i;

		return (int) Math.ceil(d);
	}
	
	public void print(){
		for(int i = 0; i < names.length; i++){

			System.out.println(
				(i + 1 ) + "\t" + 
				names[i] + "\t\t\t" +
				hashes[i]
			);
			
			
		}
	}
}
