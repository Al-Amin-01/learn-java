import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.print("enter a number:");
        double num1=Double.parseDouble(scn.nextLine());
        System.out.print("enter another number:");
        double num2=Double.parseDouble(scn.nextLine());
        //scn.nextLine();
        System.out.print("operation:");
        String op=scn.nextLine();
        if(op.equals("sum")){
            System.out.printf("%f + %f = %f",num1,num2,num1+num2);
        }
        else if(op.equals("sub")){
            System.out.printf("%f - %f = %f",num1,num2,num1-num2);
        }
        else if(op.equals("div")){
            System.out.printf("%f / %f = %f",num1,num2,num1/num2);
        }
        else if(op.equals("mul")){
            System.out.printf("%f * %f = %f",num1,num2,num1*num2);
        }
        else{
            System.out.println("Not supported operator");
        }
        scn.close();
    }
}
