import java.util.Scanner;
public class Series1	
{
	public static void main(String[] args) {
	    Scanner scan=new Scanner(System.in);
		System.out.println("Enter a value");
		int a=scan.nextInt();
	
		if(a%2==0){
		    for(int i=1;i<=(a*2)-2;i++){
		        if(i%2!=0){
		    System.out.print(i);
		}
}
	    }
	    if(a%2!=0){
		    for(int i=1;i<=a*2;i++){
		        if(i%2!=0){
		  System.out.print(i);
		            }
		       }  
}
	    }
}
