package Java_tut;


public class Appy {

	
	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("");
		sb.append("Bla Bly Bla ");
		sb.append("Blue Bla Bly ");
		sb.append("Kowabunga");
		
		System.out.println(sb.toString());
		
		StringBuilder sy=new StringBuilder("");
		sy.append("Bla Bly Bla ")
		.append("Blue Bla Bly ")
		.append("Kowabunga");
		
		System.out.println(sy.toString()+"2");
		
		
		///Formatting./////////////
		
		System.out.println("Here is an icon. \tThat was a tab.\nNewline.");
		
		//Printf in Java, works the same
		System.out.printf("Booey cost: %d\n", 155);
		
		
		//printf+ newline, in forloop,using %2d for using 2 spaces.
		for(int x=0; x<20; x++){
			System.out.printf("%2d: textyMcText, numbyMcNumber %d\n", x, x);
			System.out.printf("%-2d: textyMcText, numbyMcNumber %d\n", x, x);
		}
		//floats with float precision + spaces allocated
		
		System.out.printf("Numby McNumber:%6.2f", 5.44233);
		
		
		String a;
        StringBuilder sbzyy = new StringBuilder();
        for( int i = 0; i < 10; i++ ) {
        	sbzyy.setLength( 0 );
            sbzyy.append( "a" );
            sbzyy.append( "b" );
            sbzyy.append( "c" );
            sbzyy.append( "d" );
            sbzyy.append( "e" );
            a = sbzyy.toString();
        System.out.println("String"+i+" "+a);    
        }
				
	}
}
