package exercicios;

public class Variareis {
	public static void main(String[] args) throws Exception {
		
		int x = 5;
		
		int y = 5 + x++;
		
		System.out.println(x);
		System.out.println(y);
		
		int a = 0;
		int b = 1;
		
		int temp = 0;
		
		temp = b;
		b = a;
		a = temp;
		
		System.out.println(a);
		System.out.println(b);
	}

}
