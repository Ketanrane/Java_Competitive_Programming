 import java.util.*; 
 public class DivisibleSum 
 { 
 	public static void main(String[] args)
 	{ 
 		Scanner sc = new Scanner(System.in);
 		System.out.println("Enter Your Number : "); 

 		long n = sc.nextLong(); 
 		long sum = 0; 
 		
 		for (long i= 1; i <= n; i++) { 
 			if (i % 3 == 0 || i % 5 == 0)
 			 sum += i; 
 		} 
 		System.out.println(sum); }
 }