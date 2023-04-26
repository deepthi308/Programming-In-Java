package JavaBasics;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
			Scanner scanner = new Scanner(System.in);
			
			System.out.print("Please enter a integer number:	");
			int number = scanner.nextInt();

			System.out.print("Please enter a	character:	");
			char ch = scanner.next().charAt(0);
			
			System.out.print("Please enter a floating	point	number:	");
			float f = scanner.nextFloat();
			
			System.out.print("Please enter a double number:	");
			double d = scanner.nextDouble();
			
			System.out.print("Please enter a boolean number:	");
			boolean b = scanner.nextBoolean();
			
			System.out.print("Please enter a short number:	");
			short s = scanner.nextShort();
			
			System.out.print("Please enter a byte :	");
			byte bte = scanner.nextByte();
			
			System.out.println("Integer:	"+number);
			System.out.println("Character:	"+ch);
			System.out.println("Float:	"+f);
			System.out.println("Double:	"+d);
			System.out.println("Boolean	"+b	);
			System.out.println("Short:	"+s)	;
			System.out.println("Byte:	"+bte);
	}

}
