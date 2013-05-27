import java.util.ArrayList;


public class Stack<E> {
	
	private ArrayList<E> a;
	Stack(){
		a = new ArrayList<E>();
	}
	public void push(E obj){
		a.add(obj);
	}
	public E pop(){
		return (E) a.remove(a.size()-1);
	}
	public E peek(){
		return (E) a.get(a.size() -1);
	}
	public boolean isEmpty(){
		if (a.size() == 0){
			return true;
		}
		else {
			return false;
		}
	}
	}
