package mytemperatureconvertor;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Temperature Value in (Celsius or Fahrenheit): ");
        if(scanner.hasNextDouble()){
            double temperatureValue = scanner.nextDouble();

            System.out.print("Convert to? Select (F/C): ");
            String convertType = scanner.next();

            if(convertType.equalsIgnoreCase("F")){
                double result = Convertors.fahrenheit(temperatureValue);
                System.out.println(result);
            } else if (convertType.equalsIgnoreCase("C")){
                double result = Convertors.celsius(temperatureValue);
                System.out.println(result);
            } else {
                System.out.println("Invalid Conversion Type");
            }

        } else if (scanner.hasNextInt()) {
            int temperatureValue = scanner.nextInt();

            System.out.print("Convert to? Select (F/C): ");
            String convertType = scanner.next();

            if(convertType.equalsIgnoreCase("F")){
                int result = Convertors.fahrenheit(temperatureValue);
                System.out.println(result);
            } else if (convertType.equalsIgnoreCase("C")){
                int result = Convertors.celsius(temperatureValue);
                System.out.println(result);
            } else {
                System.out.println("Invalid Conversion Type");
            }
        } else {
            System.out.println("Please Enter a Valid Temperature");
        }

    }
}
class Convertors{

    static int fahrenheit(int temperatureValue){
        return (temperatureValue * 9/5) + 32;
    }
    static double fahrenheit(double temperatureValue){
        return (temperatureValue * 9/5) + 32;
    }

    static int celsius(int temperatureValue){
        return (temperatureValue -32) * 5/9;
    }
    static double celsius(double temperatureValue){
        return (temperatureValue -32) * 5/9;
    }
}