
public class Stack2 {
	
	int top;
	char stackArray[];
	int maxLen;

	
	public Stack2(int input) {
		this.stackArray = new char[input];
		this.top = -1;
		this.maxLen = this.stackArray.length;
	}
	
	public void push(char x)
	{
		top = top +1;
		stackArray[top] =  x;
	}
	
	public char pop()
	{
		char x;
		x = stackArray[top];
		top = top-1;
		return x;
	}
	
	public boolean empty()
	{
		boolean IsEmpty = false;
		if(top == -1){
			IsEmpty = true;
		}
		return IsEmpty;
	}
	
	public void reset()
	{
		top = -1;
	}
}
