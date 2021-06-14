class Main {
	public static void main(String[] args){
		Complex c1 = new Complex(2,4);
		Complex c2 = new Complex(1,3);
		
		System.out.println("c1: " + c1.re + " + " + c1.im + "i");
		System.out.println("c2: " + c2.re + " + " + c2.im + "i");
		
		System.out.println("--add --> c1 + c2");
		c1.add(c2);
		System.out.println("c1: " + c1.re + " + " + c1.im + "i");
		System.out.println("c2: " + c2.re + " + " + c2.im + "i");

		System.out.println("--sub --> c1 - c2");
		c1.sub(c2);
		System.out.println("c1: " + c1.re + " + " + c1.im + "i");
		System.out.println("c2: " + c2.re + " + " + c2.im + "i");

		System.out.println("--mul --> c1 * c1");
		c1.mul(c1);
		System.out.println("c1: " + c1.re + " + " + c1.im + "i");
		System.out.println("c2: " + c2.re + " + " + c2.im + "i");

		System.out.println("--conjugate --> c2.conjugate");
		c2.conjugate();
		System.out.println("c1: " + c1.re + " + " + c1.im + "i");
		System.out.println("c2: " + c2.re + " + " + c2.im + "i");

		System.out.println("--reciprocate --> c2.reciprocate");	
		c2.reciprocate();	
		System.out.println("c1: " + c1.re + " + " + c1.im + "i");
		System.out.println("c2: " + c2.re + " + " + c2.im + "i");

		System.out.println("--div --> c1 / c2");
		c1.div(c2);
		System.out.println("c1: " + c1.re + " + " + c1.im + "i");
		System.out.println("c2: " + c2.re + " + " + c2.im + "i");
		
	}
}
