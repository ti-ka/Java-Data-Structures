
public class Queue {
	
	int front;
	int rear;
	char queueArray[];
	
	public Queue(int input) {
		this.queueArray = new char[input];
		this.front = 0;
		this.rear = -1;
	}
	
	public void push(char x)
	{
		rear = rear +1;
		queueArray[rear] =  x;
	}
	
	public char pop()
	{
		char x;
		x = queueArray[front];
		front = front+1;
		return x;
	}
	
	public boolean empty()
	{
		boolean IsEmpty = false;
		if(rear<front){
			IsEmpty = true;
		}
		return IsEmpty;
	}
	
}
