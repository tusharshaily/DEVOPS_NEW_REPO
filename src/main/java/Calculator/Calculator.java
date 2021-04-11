package Calculator;


import java.util.*;
import java.lang.Math;
public class Calculator
{

    public Calculator() {
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        double number1=0,number2=0;
        do {
            System.out.println("Calculator-DevOps, Choose to perform operation");
            System.out.print("Press 1 for Square Root\nPress 2 for Factorial\nPress 3 for Natural Logarithm\nPress 4 for Power Function\n" +
                    "Press any other key to exit\nEnter your choice: ");
            int choice;
            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException error) {
                return;
            }
            try {
                if(choice > 0 && choice <4)
                {
                    System.out.print("Enter the number : ");
                    number1=scanner.nextDouble();
                }
                else if (choice == 4)
                {
                    System.out.print("Enter the base number : ");
                    number1 = scanner.nextDouble();
                    System.out.print("Enter the power number : ");
                    number2 = scanner.nextDouble();
                }
            } catch (InputMismatchException error) {
                return;
            }
            switch (choice) {
                case 1:
                    // Find square root
                    System.out.println("Square Root result is : " + calculator.squareroot(number1));
                    break;
                case 2:
                    // Find factorial
                    System.out.println("Factorial result is : " + calculator.factorial((int)number1));
                    break;
                case 3:
                    // Find natural logarithm
                    System.out.println("Natural Logarithm result is : " + calculator.natlog(number1));
                    break;
                case 4:
                    // Find power function
                    System.out.println("Power Function result is : " + calculator.power(number1, number2));
                    break;
                default:
                    System.out.println("Exiting....");
                    return;
            }
        } while (true);
    }


    public double squareroot(double number1) {
        double result=0;
        try {
            if(number1<0)
            {
                result=Double.NaN;
                throw new ArithmeticException("Case of Square Root of Negative Number");
            }
            else
            {
            result = Math.sqrt(number1);
            }
        }
        catch (ArithmeticException error) {
        }
        return result;
    }

    public int factorial(int number1) {
        int result=1;
        try {
            if(number1<0)
            {
                result=-1;
                throw new ArithmeticException("Case of factorial of Negative Number");
            }
            else
            {
                for(int i=2;i<=number1;i++)
                    result*=i;
            }
        }
        catch (ArithmeticException error) {
        }
        return result;
    }

    public double natlog(double number1) {
        double result=0;
        try {
            if(number1<=0)
            {
                result=Double.NaN;
                throw new ArithmeticException("Case of natural logarithm of Negative Number or zero");
            }
            else
            {
                result = Math.log(number1);
            }
        }
        catch (ArithmeticException error) {
        }
        return result;
    }

    public double power(double number1, double number2) {
                double result = Math.pow(number1,number2);
        return result;
    }
}


