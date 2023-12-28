class Pen{
    String color;
    String type;

    public void write(){
        System.out.println("writing");
    }
    public void printcolor(){
        System.out.println(this.color);
    }
    public void printType(){
        System.out.println(this.type);
    }
}
class Student{
    String name;
    int age;
    Student(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void info(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}

public class OOPS {
    public static void main(String[] args) {
        // Pen pen1=new Pen();
        // pen1.color="blue";
        // pen1.type="gel";

        // Pen pen2=new Pen();
        // pen2.color="black";
        // pen2.type="ballpoint";

        // pen1.printcolor();
        // pen2.printcolor();

        Student s1=new Student("jim",24);
        

        s1.info();
    }
}
