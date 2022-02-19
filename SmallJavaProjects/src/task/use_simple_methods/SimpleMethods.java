package task.use_simple_methods;

public class SimpleMethods {

	public static void main(String[] args) {
	
	String s = ToUpperCase("Methods");
	System.out.println(s);
	
	BasicStuff a = new BasicStuff();
	a.whileLoop();
	
	BasicStuff b = new BasicStuff();
	b.forLoop();
	
	}

	public static String ToUpperCase(String s) {
		
		return s.toUpperCase();
	}

}


