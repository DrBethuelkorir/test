import java.util.Scanner;

public class NumberConverter {
    
    // Method to convert decimal to binary
    public static String decimalToBinary(int decimal) {
        return Integer.toBinaryString(decimal);
    }

    // Method to convert decimal to hexadecimal
    public static String decimalToHexadecimal(int decimal) {
        return Integer.toHexString(decimal).toUpperCase();
    }

    // Method to convert decimal to octal
    public static String decimalToOctal(int decimal) {
        return Integer.toOctalString(decimal);
    }

    // Method to convert binary to decimal
    public static int binaryToDecimal(String binary) {
        return Integer.parseInt(binary, 2);
    }

    // Method to convert hexadecimal to decimal
    public static int hexadecimalToDecimal(String hexadecimal) {
        return Integer.parseInt(hexadecimal, 16);
    }

    // Method to convert octal to decimal
    public static int octalToDecimal(String octal) {
        return Integer.parseInt(octal, 8);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Number Conversion Menu:");
        System.out.println("1. Binary to Decimal");
        System.out.println("2. Hexadecimal to Decimal");
        System.out.println("3. Octal to Decimal");
        System.out.println("4. Decimal to Binary");
        System.out.println("5. Decimal to Hexadecimal");
        System.out.println("6. Decimal to Octal");

        System.out.print("Enter choice (1-6): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter binary number: ");
                String binary = scanner.next();
                int decimalFromBinary = binaryToDecimal(binary);
                System.out.println("Binary to Decimal: " + decimalFromBinary);
                break;
            case 2:
                System.out.print("Enter hexadecimal number: ");
                String hex = scanner.next();
                int decimalFromHex = hexadecimalToDecimal(hex);
                System.out.println("Hexadecimal to Decimal: " + decimalFromHex);
                break;
            case 3:
                System.out.print("Enter octal number: ");
                String octal = scanner.next();
                int decimalFromOctal = octalToDecimal(octal);
                System.out.println("Octal to Decimal: " + decimalFromOctal);
                break;
            case 4:
                System.out.print("Enter decimal number: ");
                int decimalForBinary = scanner.nextInt();
                String binaryFromDecimal = decimalToBinary(decimalForBinary);
                System.out.println("Decimal to Binary: " + binaryFromDecimal);
                break;
            case 5:
                System.out.print("Enter decimal number: ");
                int decimalForHex = scanner.nextInt();
                String hexFromDecimal = decimalToHexadecimal(decimalForHex);
                System.out.println("Decimal to Hexadecimal: " + hexFromDecimal);
                break;
            case 6:
                System.out.print("Enter decimal number: ");
                int decimalForOctal = scanner.nextInt();
                String octalFromDecimal = decimalToOctal(decimalForOctal);
                System.out.println("Decimal to Octal: " + octalFromDecimal);
                break;
            default:
                System.out.println("Invalid choice! Please select between 1 and 6.");
        }

        scanner.close();
    }
}
