package session2.exercise4;

public class Main {

	public static void main(String[] args) {

		//SUMA
		Maths suma = (a, b) -> a + b;
		System.out.println("SUMA\t"+suma.operation(5, 5));
		
		//RESTA
		Maths resta = (a, b) -> a - b;
		System.out.println("RESTA\t"+resta.operation(10, 5));
		
		//ECUACIÓN
		Maths equ = (a,b) -> {
		
			int x = 3*a +2*b;
			int z = 2*x-3;
			return z;
		};
		System.out.println("Ecuación\t"+equ.operation(2, 2) );
		
	}

}
