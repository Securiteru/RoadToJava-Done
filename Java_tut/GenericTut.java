package Java_tut;

import java.util.ArrayList;

class M{

	@Override
	public String toString() {
		return "I am M";
	}
	
	public void start(){
		System.out.println("Starting and shit");
	}
	
}
class C extends M{
	@Override
	public String toString() {
		return "I am C";
	}
	@Override
	public void start(){
		System.out.println("C starting and shit");
	}
}


public class GenericTut {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ArrayList<String> strings=new ArrayList<String>();
		
		strings.add("cat");
		strings.add("dog");
		strings.add("alligator");
		
		String animal=strings.get(1);
		
		System.out.println(animal);
		
		ArrayList<M> list1=new ArrayList<>();
		
		list1.add(new M());
		list1.add(new M());
		
		ArrayList<C> list2=new ArrayList<>();
		
		list2.add(new C());
		list2.add(new C());
		
		showList2(list1);
		showList(list2);		
		
	}
	public static void showList(ArrayList<? extends M> list){
		for(M value:list){
			System.out.println(value);
			value.start();
		}
		
	}
	public static void showList2(ArrayList<? super C> list){
		for(Object value:list){
			System.out.println(value);
		}
		
	}
}
