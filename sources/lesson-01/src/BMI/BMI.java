package BMI;

import java.util.Scanner;

import static java.lang.Math.*;

public class BMI {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your weight: ");
        double weight = scan.nextDouble();
        System.out.print("Enter your height: ");
        double height = scan.nextDouble();
        double BMI = weight / pow(height, 2);
        if (BMI < 18.5) {
            System.out.printf("%-20.2f%s", BMI, "Underweight");
        } else if (BMI >= 18.5 && BMI < 25.0) {
            System.out.printf("%-20.2f%s", BMI, "Normal");
        } else if (BMI >= 25.0 && BMI < 30.0) {
            System.out.printf("%-20.2f%s", BMI, "Overweight");
        } else if (BMI >= 30.0) {
            System.out.printf("%-20.2f%s", BMI, "Obese");
        }
    }
}
