
public class Driver {

	public static void main(String[] args) {
		HashMe hash = new HashMe();
		hash.readFile();
		hash.sort();
		hash.hash(400);
		hash.print();
	}
}