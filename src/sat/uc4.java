package sat;

import java.util.Random;

public class uc4 {

	public static void main(String[] args) {
		Random rand = new Random();
		int rand_int1 = rand.nextInt(10);
		System.out.println("total work Haur is "+rand_int1);
	
		switch (rand_int1) {
	      case 1:
				{
					System.out.println("salary is cradit total " +rand_int1*5);
					
			}
	        break;

	        // matching case
	      case 2:
				{
					System.out.println("salary is cradit total " +rand_int1*6);
					
			}
	        break;

	      case 3:
			{
				System.out.println("salary is cradit total " +rand_int1*8);
				
			}break;
	      
	      case 4:
				{
					System.out.println("salary is cradit total " +rand_int1*9);
					
				}break;
	      case 5:
				{
					System.out.println("salary is cradit total " +rand_int1*18);
					
				}break;
				
	      case 6:
				{
					System.out.println("salary is cradit total " +rand_int1);
				
				}break;
				
	      case 7:
				{
					System.out.println("salary is cradit total " +rand_int1*7);
					
				}
				break;
				
	      case 8:
				{
					System.out.println("salary is cradit total " +rand_int1*14);
					
				}break;
				
	      case 9:
		        
				{
					System.out.println("salary is cradit total " +rand_int1);
					
				}
				
	      default:
	        System.out.println("Default case");
	    }
	}

}
