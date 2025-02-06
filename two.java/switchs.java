import java.util.Scanner;

public class switchs{

    public static void main(String[]args){
        Scanner one = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = one.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = one.nextInt();

        System.out.println("choose which operation do you want to use");
        System.out.println("1.addition");
        System.out.println("2.subtraction");
        System.out.println("3.multiplication");
        System.out.println("4.division");

        int choice = one.nextInt();

            int result;
        switch(choice){
            case 1:
            result=num1+num2;
            System.out.println("Result=" +result);
            break;

            case 2:
            result=num1-num2;
            System.out.println("Result=" +result);
            break;

            case 3:
            result=num1*num2;
            System.out.println("Result=" +result);
            break;

            case 4:
            result=num1/num2;
            if(num1>0){
            System.out.println("Result=" +result);
            }
            else{
                System.out.println("zero cannot divide a number");
            }
            break;
            
            default:
            System.out.println("invalid operation");
            break;
        }

    }
}