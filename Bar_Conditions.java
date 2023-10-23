package coditions;
import java.util.*;
public class Bar_Conditions {

		public static void main(String[] args) {
		
			Scanner scan = new Scanner( System.in);
			
		System.out.println("Enter name:");
		String name =scan.nextLine();
		
		System.out.println("Where you from?");
		String address =scan.nextLine();

		System.out.println("Welcome to the bar " + name +"!");
		
		System.out.println("Here's the menu");
		System.out.println("Gin ₱ 50");
		System.out.println("Empi ₱ 180");
		System.out.println("GSM ₱ 107");
		System.out.println("Alfonso ₱ 280");
		System.out.println("San Mig ₱ 45");
		System.out.println("Tequila ₱370");
		
		System.out.println("Input your money:");
		int m =scan.nextInt();
		
		if(m >= 45) {
			System.out.println("Pick your dinks");
		
		}else if(m <= 45) {
			System.out.println("Not Enough money to buy!");
			System.out.println("Sorry Sir!");
		  }
		int Gin = 50;
		int Empi = 180;
		int GSM = 107;
		int Alfonso = 280;
		int San_Mig = 45;
		int Tequila = 370;
		
		
		System.out.println("What drink would you like  to buy?");
		String w =scan.next();
		
		System.out.println("Input your money:");
		int n =scan.nextInt();
		
		
		
		if(w.equals("Gin")) {
			System.out.println("Your Change is " + (n-=Gin));
		
		}else if(w.equals("Empi")) {
			System.out.println("Your Change is " + (n-=Empi));
			
		}else if(w.equals("GSM")) {
		    System.out.println("Your Change is " + (n-=GSM));

		}else if(w.equals("Alfonso")) {
			System.out.println("Your Change is " + (n-=Alfonso));
			
		}else if(w.equals("San Mig")) {
			System.out.println("Your Change is " + (n-=San_Mig));
			
		}else if(w.equals("Tequila")) {
			System.out.println("Your Change is " + (n-=Tequila));
			
		}
		System.out.println("Thank you so much Sir. " + name);
		System.out.println("Have a nice day!");
		System.out.println("Enjoyy your drink!");
		
		}
	  
	}


