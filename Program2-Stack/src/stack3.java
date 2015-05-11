
public class stack3{
	
	int top;
	int stackArray[];
	int maxLen;
	
	public stack3(int length) {
		this.stackArray = new int[length];
		this.top = -1;
		this.maxLen = this.stackArray.length;
	}

	public void push(int x)
	{
		top = top +1;
		stackArray[top] =  x;
	}
	
	public int pop()
	{
		int x;
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
