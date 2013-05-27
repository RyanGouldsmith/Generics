public class Main{
	
	public static void main(String[] args){
		Stack<Object> s = new Stack<Object>();
		s.push(1);
		s.push(2);
		s.push("Comp Sci");
		System.out.println(s.peek());
		System.out.println(s.pop());
		System.out.println(s.pop());
		
		
	}
}