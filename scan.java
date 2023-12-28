import java.util.Scanner;


public class scan {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your name:");
        String name=sc.nextLine();
        System.out.println("you are "+name);
        System.out.println("enter age:");
        int age=Integer.parseInt(sc.nextLine());
        
        System.out.println("you are "+age+"gpa:");
        double gpa=Double.parseDouble(sc.nextLine());
        System.out.println(gpa);
        sc.close();
    }
}
  