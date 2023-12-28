class Shape{
    public void area(){
        System.out.println("print area");
    }
}

class Triangle extends Shape{
    public void area(int l,int h){
        System.out.println(l/2*h);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Triangle t1=new Triangle();
        
    }
}
