package projectSeven;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Rectangle {
	private double length;
	private double width;
	
	public Rectangle() {
		length = 1.0;
		width = 1.0;
	}
	
	public double getLength() {
		return length;
	}
	
	public void setLength(double length) {
		if (length > 0.0 && length < 20.0) {
			this.length = length;
		} else {
			throw new IllegalArgumentException("Invalid length. Length must be between 0.0 and 20.0");
		}
	}
	
	public double getWidth() {
		return width;
	}
	
	public void setWidth(double width) {
		if (width > 0.0 && width < 20.0) {
			this.width = width;
		} else {
			throw new IllegalArgumentException("Invalid width. Width must be between 0.0 and 20.0");
		}
	}
	public double calculatePerimeter() {
		return 2 * (length + width);
	}
	
	public double calculateArea() {
		return (length * width);
	}
	

	
	
	
public class RectangleTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Josiah Barringer - PROGRAMMING: RECTANGLE CLASS ASSIGNMENT");
			
		
		Scanner scanner = new Scanner(System.in);
		Rectangle rectangle = new Rectangle();
		
		int choice = 0;
		do {
			try {
				System.out.println("Rectangle Menu:");
				System.out.println("1. Set length");
				System.out.println("2. Set width");
				System.out.println("3. Calculate perimeter");
				System.out.println("4. Calculate area");
				System.out.println("5. Exit");
				System.out.println("Enter your choice: ");
				choice = scanner.nextInt();
				
				switch (choice) {
				case 1:
					System.out.print("Enter the length:");
					double length = scanner.nextDouble();
					rectangle.setLength(length);
					break;
				case 2:
					System.out.print("Enter the width:");
					double width = scanner.nextDouble();
					rectangle.setWidth(width);
					break;
				case 3:
					double perimeter = rectangle.calculatePerimeter();
					System.out.println("Perimeter: " + perimeter);
					break;
				case 4:
					double area = rectangle.calculateArea();
					System.out.println("Area: " + area);
					break;
				case 5:
					System.out.println("Exiting the program...");
				default:
					System.out.println("Invlaid choice. Please try again.");
					break;
				}
			} catch (InputMismatchException e) {
				System.out.println("Invlaid input. Please enter a valid number.");
				scanner.nextLine();
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
		} while (choice != 5);
		
		scanner.close();

	}
 
}

}
