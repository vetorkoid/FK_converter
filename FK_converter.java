package ITEC2610;
import java.util.Scanner;
public class FK_converter {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); 
		
		System.out.print("Enter temperature in Fahrenheit: ");
		double tf = scan.nextDouble();
		
		double tk = (tf + 459.67)*5/9;
		
		System.out.println("Temperature in Kelvin: " + Math.round(tk * 100.0) / 100.0);

	}

}
