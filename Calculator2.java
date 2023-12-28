import java.util.Scanner;

public class Calculator2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        double num1=sc.nextDouble();
        System.out.println("enter another number:");
        double num2=sc.nextDouble();
        sc.nextLine();
        System.out.println("enter an operator:");
        String op=sc.nextLine();
        switch(op){
            case "sum":
                System.out.printf("%f+%f=%f",num1,num2,num1+num2);
                break;
            case "sub":
                System.out.printf("%f-%f=%f",num1,num2,num1-num2);
                break;
            case "mul":
                System.out.printf("%f*%f=%f",num1,num2,num1*num2);
                break;
            case "div":
                if(num2==0) System.out.printf("can not divide by zero");
                else System.out.printf("%f/%f=%f",num1,num2,num1/num2);
                break;
            default:
                System.out.println("unsupported operation");

        }
        sc.close();

    }
}
