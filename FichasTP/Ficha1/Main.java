import java.util.Scanner;
import java.util.Arrays;

public class Main extends Ficha1 {
    public static void main (String[] args) {
        // Ficha objects
        Ficha1 f1 = new Ficha1();
        Ficha2 f2 = new Ficha2();

        // Input variables:
        char inputChar = '0';
        int inputInt;
        int inputInt1;
        double inputDouble;
        double inputDouble1;
        String inputString;

        // Return variables:
        int retInt;
        double retDouble;
        String retString;
        long retLong;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Inputs that request a char will ignore everything but the first char");

        // Starting array (required Ficha2)
        System.out.println("Specify the arrays maximum length");
        inputInt = scanner.nextInt();
        int[] arr = new int[inputInt];

        while (inputChar != 'x') {
            System.out.println("Escolha uma ficha (1 ou 2)");
            inputChar = scanner.next().charAt(0);
            switch (inputChar) {
                case '1': // Ficha 1
                    System.out.println("Choose a question(1-7):");
                    inputChar = scanner.next().charAt(0);
                    switch (inputChar) {
                        case '1':
                            System.out.println("Choose a Temperature (ºC):");
                            inputDouble = scanner.nextDouble();
                            retDouble = f1.celsiusParaFarenheit(inputDouble);
                            System.out.printf("%f ºC = %f F\n", inputDouble, retDouble);
                            break;
                        case '2':
                            System.out.println("Choose your first int:");
                            inputInt = scanner.nextInt();
                            System.out.println("Choose your second int:");
                            inputInt1 = scanner.nextInt();
                            retInt = f1.maximoNumeros(inputInt, inputInt1);
                            System.out.printf("The maximum between %d and %d is %d\n", inputInt, inputInt1, retInt);
                            break;
                        case '3':
                            System.out.println("Choose a name:");
                            inputString = scanner.next();
                            System.out.println("Choose a balance:");
                            inputDouble = scanner.nextDouble();
                            retString = f1.criaDescricaoConta(inputString, inputDouble);
                            System.out.printf("%s\n", retString);
                            break;
                        case '4':
                            System.out.println("Choose a ammount to convert (€):");
                            inputDouble = scanner.nextDouble();
                            System.out.println("Choose a converstion rate:");
                            inputDouble1 = scanner.nextDouble();
                            retDouble = f1.eurosParaLibras(inputDouble, inputDouble1);
                            System.out.printf("%f€ is %f£ (%f conversion rate)\n", inputDouble, retDouble, inputDouble1);
                            break;
                        case '5':
                            System.out.println("Not implemented yet");
                            break;
                        case '6':
                            System.out.println("Choose a number:");
                            inputInt = scanner.nextInt();
                            retLong = f1.factorial(inputInt);
                            System.out.println("The factorial of " + inputInt + " is " + retLong);
                            break;
                        case '7':
                            retLong = f1.tempoGasto();
                            System.out.println("It takes " + retLong + "ms to calculate factorial(5000)");
                            break;
                    }
                    break;

                case '2': // Ficha 2
                    System.out.print("Choose a question (1-7):");
                    inputChar = scanner.next().charAt(0);
                    switch (inputChar) {
                        case '1':
                            System.out.print("Choose a question (a-c):");
                            inputChar = scanner.next().charAt(0);
                            switch (inputChar) {
                                case 'a':
                                    break;
                                case 'b':
                                    break;
                                case 'c':
                                    break;
                            }
                            break;
                        case '2':
                            System.out.print("Choose a question (a-i):");
                            inputChar = scanner.next().charAt(0);
                            switch (inputChar) {
                                case 'a':
                                    System.out.println("Not implemented yet");
                                    break;
                                case 'b':
                                    System.out.println("Not implemented yet");
                                    break;
                                case 'c':
                                    System.out.println("Not implemented yet");
                                    break;
                                case 'd':
                                    System.out.println("Not implemented yet");
                                    break;
                                case 'e':
                                    System.out.println("Not implemented yet");
                                    break;
                                case 'f':
                                    System.out.println("Not implemented yet");
                                    break;
                                case 'g':
                                    System.out.println("Not implemented yet");
                                    break;
                                case 'h':
                                    System.out.println("Not implemented yet");
                                    break;
                                case 'i':
                                    System.out.println("Not implemented yet");
                                    break;
                            }
                            break;
                        case '3':
                            System.out.print("Choose a question (a-c):");
                            inputChar = scanner.next().charAt(0);
                            switch (inputChar) {
                                case 'a':
                                    System.out.println("Not implemented yet");
                                    break;
                                case 'b':
                                    System.out.println("Not implemented yet");
                                    break;
                                case 'c':
                                    System.out.println("Not implemented yet");
                                    break;
                            }
                            break;
                        case '4':
                            System.out.print("Choose a question (a-b):");
                            inputChar = scanner.next().charAt(0);
                            switch (inputChar) {
                                case 'a':
                                    System.out.println("Not implemented yet");
                                    break;
                                case 'b':
                                    System.out.println("Not implemented yet");
                                    break;
                            }
                            break;
                        case '5':
                            System.out.print("Choose a question (a-d):");
                            inputChar = scanner.next().charAt(0);
                            switch (inputChar) {
                                case 'a':
                                    System.out.println("Not implemented yet");
                                    break;
                                case 'b':
                                    System.out.println("Not implemented yet");
                                    break;
                                case 'c':
                                    System.out.println("Not implemented yet");
                                    break;
                                case 'd':
                                    System.out.println("Not implemented yet");
                                    break;
                            }
                            break;
                        case '6':
                            System.out.print("Choose a question (a-d):");
                            inputChar = scanner.next().charAt(0);
                            switch (inputChar) {
                                case 'a':
                                    System.out.println("Not implemented yet");
                                    break;
                                case 'b':
                                    System.out.println("Not implemented yet");
                                    break;
                                case 'c':
                                    System.out.println("Not implemented yet");
                                    break;
                                case 'd':
                                    System.out.println("Not implemented yet");
                                    break;
                            }
                            break;
                        case '7':
                            System.out.println("Not implemented yet");
                            break;
                    }
                    break;

                case '3': // Ficha 3
                    System.out.println("Not implemented yet");
                    break;

                case 'x': // Exit condition
                    System.out.println("Goodbye");
                    break;
                default:
                    System.out.println("Invalid Input");
            }
        }
    }
}
