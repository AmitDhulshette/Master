package amit;

import java.util.Random;

public class Java extends Selenium {
	
	static void java()
	{
		Random rn = new Random();
	    int value = rn.nextInt(19);
	    System.out.print(value + ")");
	    
	    
		switch(value)
		{
		
		    case 0 : System.out.println(" What is JAVA?");
		    break;
		    
			case 1 : System.out.println("What are the features of JAVA?");
			break;
			
			case 2 : System.out.println("How does Java enable high performance?");
			break;
			
			case 3 : System.out.println(" Name the Java IDE’s?");
		    break;
		    
			case 4 : System.out.println(" What do you mean by Constructor?");
		    break;
		    
			case 5 : System.out.println(" What do you mean by Constructor?");
		    break;
		    
			case 6 : System.out.println("  What is meant by the Local variable and the Instance variable?");
		    break;
		    
			case 7 : System.out.println(" What is a Class?");
		    break;
		    
			case 8 : System.out.println(" What is an Object?");
		    break;
		    
			case 9 : System.out.println(" What are the OOPs concepts?");
		    break;
		    
			case 10 : System.out.println(" What is Inheritance?");
		    break;
		    
			case 11 : System.out.println(" What is Encapsulation?");
		    break;
		    
			case 12 : System.out.println(" What is Polymorphism?");
		    break;
		    
			case 13 : System.out.println(" What is meant by Method Overriding?");
		    break;
		    
			case 14 : System.out.println(" What is meant by Overloading?");
		    break;
		    
			case 15 : System.out.println(" What is meant by Interface?");
		    break;
		    
			case 16 : System.out.println(" What is meant by Abstract class?");
		    break;
		    
			case 17 : System.out.println(" Difference between Array and Array List.");
		    break;
		    
			case 18 : System.out.println("  Explain about Public and Private access specifiers.");
		    break;
		    
			case 19 : System.out.println(" Difference between Default and Protected access specifiers.");
		    break;
		    
		    
			default:System.out.println("Please Enter Correct Value");
			break;
		}
	}

}
