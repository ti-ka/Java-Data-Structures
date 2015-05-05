
public class Queue {
	
	private int front, rear;
	private char[] queue = new char[100];
	
	public Queue()
	{
		front = 0;
		rear = -1;
	}
	
	public void push(char c)
	{
		if(rear >= 100){
			System.out.println("Queue Overflow");
		} else {
			rear++;
			queue[rear] = c;
				
		}
	}
	
	public int pop(){
		if(isEmpty()){
			System.out.println("Empty Queue");
			return -1;
		} else {
			char temp = queue[front];
			front++;
			return temp;	
		}
	}
	
	public boolean isEmpty(){
		if(front >= rear){
			return true;
		}
		return false;
	}
	
	

}
