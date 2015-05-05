
public class Stack {
	private int top;
	private char[] stack = new char[100];
	
	public Stack(){
		top = -1;
	}
	
	public void push(char c){
		if(top >= 100){
			System.out.println("Stack Overflow");
		} else {
			top++;
			stack[top] = c;
		}
	}
	
	public char pop(){
		if(isEmpty()){
			System.out.println("Stack Empty");
			return '0';
		} else {
			char temp = stack[top];
			top--;
			return temp;	
		}
	}
	
	public boolean isEmpty(){
		if(top == -1){
			return true;
		}
		return false;
	}
	

}
