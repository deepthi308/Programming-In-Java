package JavaBasics;
import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		
		float	result;
		boolean	loop	=	true;
		char b;

		Scanner scanner = new Scanner(System.in);
		
		while(loop){
			
			System.out.println("What do you want to convert(C/F):	");
			char userChoice = scanner.next().trim().toUpperCase().charAt(0);
			
			switch(userChoice) {
			case 'C':
				System.out.println("Enter  the fahrenheit value:	");
				float fah =	scanner.nextFloat();
				result	=	(fah-32)*(5/9);
				System.out.println("The	celsius value	is: "+result+" C");
				System.out.println("Do your want to convert again(Y/N): ");
				 b =scanner.next().trim().toUpperCase().charAt(0);
				if(b=='Y') {
				loop	=	true;
				}
				else {
					loop=false;
				}
				break;
			case 'F':
				System.out.println("Enter the celsius value:	");
				float	cel	=	scanner.nextFloat();
				result	=	(cel*9/5)+32;
				System.out.println("The	fahrenheit	 value is: "+result+" F");
				System.out.println("Do your want to convert again(Y/N): ");
				 b =scanner.next().trim().toUpperCase().charAt(0);
				if(b=='Y') {
				loop	=	true;
				}
				else {
					loop=false;
				}
				break;
			default:
				System.out.println("Error!! Wanna Rerun the program and enter the valid choices(Y/N):	");
				 b =scanner.next().trim().toUpperCase().charAt(0);
				if(b=='Y') {
				loop	=	true;
				}
				else {
				loop=false;
					}
			}
		}
		
		System.out.println("Bye!! See you next time...");
		scanner.close();
	}

}
