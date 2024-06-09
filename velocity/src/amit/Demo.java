package amit;

public class Demo {
	
	public static void main(String[] args) {
		
	//fibbonaci series
		
		int a=0;
		int b=1;
		int fibbo = 0;
		System.out.println(a);
		System.out.println(a);
		
		for(int i=1; i<=10; i++)
		{
			fibbo = a+b;
			a=b;
			b=fibbo;
			System.out.println(fibbo);
			
		}
		
		
	}

}
