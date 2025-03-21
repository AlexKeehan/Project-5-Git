import java.util.Scanner;
import java.util.ArrayList;

/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        ArrayList results = new ArrayList<Double>();
        ArrayList results2 = new ArrayList<Double>();
        ArrayList operation = new ArrayList<String>();
        ArrayList equation = new ArrayList<Double>();
        ArrayList symbol = new ArrayList<String>();
        double num = -1;
        double num2 = -1000000000;
        double result = -1;
        int total = 0;
        while (!input.equals("")) {
            System.out.println("Welcome to my calculator! Your options for calculation include: \naddition(add), subtraction(sub), division(div), multiplication(mul),\npower(pow), root(root), ln(ln), log(log), sin(sin), cos(cos), tan(tan),\narc sin(asin), arc cosine(acos), arc tan(atan) and round(round).\nPlease enter the word in the parentheses to choose that calculation.\nEnter quit to leave\nEnter history to see past calculations");
            String calc = input.next();
            Calculations c = new Calculations();
            if (calc.equals("quit")) {
                System.out.println("Shutting down...");
                break;
            } else if (calc.equals("add")) {
                System.out.println("Please enter the first number for addition: ");
                num = input.nextDouble();
                System.out.println("Please enter the second number for addition: ");
                num2 = input.nextDouble();
                result = c.additionMethod(num, num2);
                System.out.println("Result: " + result);
                System.out.println("\n***********************\n");
                operation.add(calc);
                equation.add(num);
                equation.add(num2);
                results.add(result);
                symbol.add("+");
                total ++;
            } else if (calc.equals("sub")) {
                System.out.println("The first number is the one being subtracted from.\nPlease enter the first number: ");
                num = input.nextDouble();
                System.out.println("Please enter the second number: ");
                num2 = input.nextDouble();
                result = c.subtractionMethod(num, num2);
                System.out.println("Result: " + result);
                System.out.println("\n***********************\n");
                operation.add(calc);
                equation.add(num);
                equation.add(num2);
                results.add(result);
                symbol.add("-");
                total ++;
            } else if (calc.equals("div")) {
                System.out.println("Enter the number you wish to be divided: ");
                num = input.nextDouble();
                System.out.println("Enter the second number: ");
                num2 = input.nextDouble();
                result = c.divisionMethod(num, num2);
                System.out.println("Result: " + result);
                System.out.println("\n***********************\n");
                operation.add(calc);
                equation.add(num);
                equation.add(num2);
                results.add(result);
                symbol.add("/");
                total ++;
            } else if (calc.equals("mul")) {
                System.out.println("Enter the first number: ");
                num = input.nextDouble();
                System.out.println("Enter the second number: " );
                num2 = input.nextDouble();
                result = c.multiplicationMethod(num, num2);
                System.out.println("Result : " + result);
                System.out.println("\n***********************\n");
                operation.add(calc);
                equation.add(num);
                equation.add(num2);
                results.add(result);
                symbol.add("*");
                total ++;
            } else if (calc.equals("pow")) {
                System.out.println("Enter the base number: ");
                num = input.nextDouble();
                System.out.println("Enter what number you want the base raised to: ");
                num2 = input.nextDouble();
                result = c.powerMethod(num, num2);
                System.out.println("Result: " + result);
                System.out.println("\n***********************\n");
                operation.add(calc);
                equation.add(num);
                equation.add(num2);
                results.add(result);
                symbol.add("^");
                total ++;
            } else if (calc.equals("root")) {
                System.out.println("Enter a number: ");
                num = input.nextDouble();
                result = c.rootMethod(num);
                System.out.println("Result: " + result);
                System.out.println("\n***********************\n");
                operation.add(calc);
                equation.add(num);
                results.add(result);
                symbol.add("√ ");
                total ++;
            } else if (calc.equals("ln")) {
                System.out.println("Enter a number: ");
                num = input.nextDouble();
                result = c.lnMethod(num);
                System.out.println("Result: " + result);
                System.out.println("\n***********************\n");
                operation.add(calc);
                equation.add(num);
                results.add(result);
                symbol.add("ln");
                total ++;
            } else if (calc.equals("log")) {
                System.out.println("Enter a number: ");
                num = input.nextDouble();
                result = c.logMethod(num);
                System.out.println("Result: " + result);
                System.out.println("\n***********************\n");
                operation.add(calc);
                equation.add(num);
                results.add(result);
                symbol.add("log");
                total ++;
            } else if (calc.equals("sin")) {
                System.out.println("Enter a number: ");
                num = input.nextDouble();
                result = c.sinMethod(num);
                System.out.println("Result: " + result);
                System.out.println("\n***********************\n");
                operation.add(calc);
                equation.add(num);
                results.add(result);
                symbol.add("sin");
                total ++;
            } else if (calc.equals("cos")) {
                System.out.println("Enter a number: ");
                num = input.nextDouble();
                result = c.cosMethod(num);
                System.out.println("Result: " + result);
                System.out.println("\n***********************\n");
                operation.add(calc);
                equation.add(num);
                results.add(result);
                symbol.add("cos");
                total ++;
            } else if (calc.equals("tan")) {
                System.out.println("Enter a number: ");
                num = input.nextDouble();
                result = c.tanMethod(num);
                System.out.println("Result: " + result);
                System.out.println("\n***********************\n");
                operation.add(calc);
                equation.add(num);
                results.add(result);
                symbol.add("tan");
                total ++;
            } else if (calc.equals("asin")) {
                System.out.println("Enter a number: ");
                num = input.nextDouble();
                result = c.arcSinMethod(num);
                System.out.println("Result: " + result);
                System.out.println("\n***********************\n");
                operation.add(calc);
                equation.add(num);
                results.add(result);
                symbol.add("arc sin");
                total ++;
            } else if (calc.equals("acos")) {
                System.out.println("Enter a number: ");
                num = input.nextDouble();
                result = c.arcCosMethod(num);
                System.out.println("Result: " + result);
                System.out.println("\n***********************\n");
                operation.add(calc);
                equation.add(num);
                results.add(result);
                symbol.add("arc cos");
                total ++;
            } else if (calc.equals("atan")) {
                System.out.println("Enter a number: ");
                num = input.nextDouble();
                result = c.arcTanMethod(num);
                System.out.println("Result: " + result);
                System.out.println("\n***********************\n");
                operation.add(calc);
                equation.add(num);
                results.add(result);
                symbol.add("arc tan");
                total ++;
            } else if (calc.equals("round")) {
                System.out.println("Enter number to be rounded: ");
                num = input.nextDouble();
                result = c.roundMethod(num);
                System.out.println("Result: " + result);
                System.out.println("\n***********************\n");
                operation.add(calc);
                equation.add(num);
                results.add(result);
                symbol.add("≈");
                total ++;
            } else if (calc.equals("history")) {
                if (results.size() == 0) {
                    System.out.println("\nNo history available\nPlease try again");
                    System.out.println("\n***********************\n");
                } else {
                    for (int i=results.size()-1; i >=0; i--) {
                        if (equation.size() == 1) {
                            System.out.print(operation.get(i) + ": ");
                            System.out.print(symbol.get(i) + " ");
                            System.out.print(equation.get(i) + " = ");
                            System.out.print(results.get(i));
                            System.out.println("\n***********************\n");
                        } else if (operation.get(i).equals("add") || operation.get(i).equals("sub") || operation.get(i).equals("div") || operation.get(i).equals("mul") || operation.get(i).equals("pow") || operation.get(i).equals("root")) {
                            System.out.print(operation.get(i) + ": ");
                            System.out.print(equation.get(i) + " ");
                            System.out.print(symbol.get(i) + " ");
                            System.out.print(equation.get(i+1) + " = ");
                            System.out.print(results.get(i));
                            System.out.println("\n***********************\n");
                        } else {
                            System.out.print(operation.get(i) + ": ");
                            System.out.print(symbol.get(i) + " ");
                            System.out.print(equation.get(i) + " = ");
                            System.out.print(results.get(i));
                            System.out.println("\n***********************\n");
                        }
                    }
                    System.out.println("Total calculations: " + total + "\n");
                }
            } else {
                System.out.println("Error! Please enter a valid keyword");
                System.out.println("\n***********************\n");
            }
        }
    }
}
