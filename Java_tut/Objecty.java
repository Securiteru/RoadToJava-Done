package Java_tut;

class Objectyus{
	private int id;
	private String name;
	
	public Objectyus(int id, String name){
		this.id=id;
		this.name=name;
	}
	
	//overriding the toString method which all classes usually have by default.
	public String toString(){
		StringBuilder sb=new StringBuilder();
		sb.append("V1: ").append(id).append(": ").append(name).append(" ");
		
		String.format("V2: %-2d: %-2s ", id, name);
		
		StringBuilder ss=new StringBuilder();
		ss.append(sb.toString()).append(String.format("V2: %d: %s ", id, name));
		return ss.toString();
	}

}


public class Objecty {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		Objectyus objy=new Objectyus(1,"Adi");
		Objectyus objy1=new Objectyus(2,"Secu");
		Objectyus objy2=new Objectyus(3,"Padu");
		Objectyus objy3=new Objectyus(4,"Borim");
		Objectyus objy4=new Objectyus(5,"Kawa");
		
		System.out.println(objy);
		System.out.println(objy1);
		System.out.println(objy2);
		System.out.println(objy3);
		System.out.println(objy4);
	}

}
