
public class ParenthesisTest {

	private String calc;
	private Stack numbers;
	private Stack operators;
	
	
	public ParenthesisTest(String c){
		calc = c;
		numbers = new Stack();
		operators =  new Stack();
		prep();
	}
	
	public boolean test(){
		char s = operators.pop();
		while(s != '0'){
			System.out.println(s);
		}
		
		
		
		return true;
	}
	
	public void prep(){
		for(int i = 0; i< calc.length(); i++){
			char at = calc.charAt(i);
			if(Character.getNumericValue(at) == -1){
				//Symbol
				operators.push(at);
			} else {
				//Number
				numbers.push(at);
			}
		}	
	}
}
