class qwerty {

	String color;
	int price;

	
	
	void behaviour() {
	System.out.println("Pen is used for writing");	
		
	}

	
}
class Pen_Object{
	void behaviour() {
	System.out.println("Qwerty is intiallzing by thhis  class");	
		
	}

	public static void main(String args[]) {
		
		System.out.println("Testing the object classes");

		qwerty p1=new qwerty();
		Pen_Object q1=new Pen_Object();
		
		p1.color="Blue";
		p1.price=10;
		
		System.out.println("Here Object is pen and its Color and Price are "+p1.color+","+p1.price+"respectively");
		p1.behaviour();
		q1.behaviour();
		System.out.println("For Testing");
	}
	
	
}
