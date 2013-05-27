import java.util.ArrayList;

//this is the stack class where items are added, removed and checked to see what they are
public class Stack<E> {
	//Use an ArrayList here
	private ArrayList<E> a;
	Stack(){
		a = new ArrayList<E>();
	}
	//Adds the type to the arrayList
	public void push(E obj){
		a.add(obj);
	}
	//Removes the element from the arrayList
	public E pop(){
		return (E) a.remove(a.size()-1);
	}
	//looks at what is last in the arrayList
	public E peek(){
		return (E) a.get(a.size() -1);
	}
	//checks to see if it's empty or not.
	public boolean isEmpty(){
		if (a.size() == 0){
			return true;
		}
		else {
			return false;
		}
	}
}
