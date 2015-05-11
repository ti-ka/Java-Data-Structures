
public class Stack1 { 
	
	//basic stack methods
	
	int top;
	char stackArray[];
	int maxLen;

	
	public Stack1() {
		this.stackArray = new char[maxLen];
		this.top = -1;
		this.maxLen = this.stackArray.length;
	}
	
	public void push(char item)
	{
		top = top +1;
		stackArray[top] = item;
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
