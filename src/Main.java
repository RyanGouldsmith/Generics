public class Main{
	//creates a new stack which: Adds, peeks and removes items.
	public static void main(String[] args){
		//sets the generic type to be an object
		Stack<Object> s = new Stack<Object>();
		s.push(1);
		s.push(2);
		s.push("Comp Sci");
		System.out.println(s.peek());
		System.out.println(s.pop());
		System.out.println(s.pop());
		
		
	}
}
