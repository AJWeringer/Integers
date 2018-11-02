import java.util.Scanner;

public class Lab4 
{ 

	private static Scanner in;

	public static void main(String[] args)
	{  in = new Scanner (System.in);
	   int choice=0;//user's input from menu (1,2,or 3)
	   int i;
	   int sum=0;//case 1 stored value of 1st m integers
	   int m;// case 1 variable entered by user
	   int fact=1;//case 2 stored value of 1st n integers
	   int n;//case 2 variable entered by user
	   
	   do{
		     System.out.println("Please choose your choice from following menu");
		     System.out.println("1) Calculate the sum of 1 to m integers");
		     System.out.println("2) Calculate the factorial of given number");
		     System.out.println("3) Quit");
		     
		 choice = in.nextInt();
	  
	   switch(choice)
	   {
       case 1:
       	{ System.out.println("Enter the number");
    	   m=in.nextInt();
    	   
    	   for (i=1;i<=m;i++)
    	    sum=sum+i;
    	   	System.out.println("The sum of first " +i+ " numbers is " +sum);
    	   }
            break;//end of case1
      
       case 2:
    	   {System.out.println("Enter the number");
    	   n=in.nextInt();
    	   
    	   for (i=1;i<=n;i++)
    	    fact=fact*i;
    	   	System.out.println("The Factorial of "+i+" is "+fact);
    	   }

            break;//end of case 2
	    
	   }//end of switch case
	  
	    }while (choice<3);//end of do loop
	  
	   
	}// end of method
}//end of class
