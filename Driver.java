import java.util.Random;


public class Driver 
{
	public static void main(String[] args) throws Exception
	{
		LinkedList ll = new LinkedList();
		ll.addFront(2);
		ll.addFront(3);
		ll.addFront(4);
		ll.addFront(5);
		ll.addFront(6);
		ll.addFront(7);
		ll.display();
		ll.displayInReverse();
		ll.display();
		ll.removeFront();
		ll.display();
		ll.removeEnd();
		ll.display();
		ll.removeAtIndex(2);
		ll.display();
		ll.addAtIndex(13, 2);
		ll.displayInReverse();
	}
}
