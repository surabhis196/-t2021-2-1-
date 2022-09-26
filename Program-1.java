import java.util.Scanner;
public class Calculator
{
	public static void main(String[] args) {
	    Scanner scan=new Scanner(System.in);
	    String operator;
	    String Add;
	    String Sub;
	    double sum;
	    double sub;
	    System.out.println("Enter a value");
	    double a=scan.nextDouble();
	    System.out.println("Enter b value");
	    double b=scan.nextDouble();
	     System.out.println("Enter operation ");
	    operator=scan.next();
	    
	    switch(operator){
	        case "Add":
	            sum=a+b;
	            System.out.println(sum);
	            break;
	            
	         case "Sub":
	            sub=a-b;
	            System.out.println(sub);
	            break;
	            
	   }
	    
		
	}
}
