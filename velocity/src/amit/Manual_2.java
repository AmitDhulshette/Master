package amit;

import java.util.Random;

public class Manual_2 {
	
	static void manual_2()
	{
		Random rn = new Random();
	    int value = rn.nextInt(3);
	    System.out.print(value + ")");
	    
	    
		switch(value)
		{
		
		    case 0 : System.out.println("Question 1");
		    break;
		    
			case 1 : System.out.println("Question 2");
			break;
			
			case 2 : System.out.println("Question 3");
			break;
			
			default:System.out.println("Question 4");
			break;
		}
	}

}
