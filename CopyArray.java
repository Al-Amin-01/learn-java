import java.util.Arrays;

public class CopyArray{
    public static void main(String[] args){
        int num[]={1,2,3,4,5};
        int num2[]=Arrays.copyOf(num, num.length);
        int num3[]=Arrays.copyOfRange(num2, 1, 7);
        

        System.out.println(Arrays.toString(num));
        System.out.println(Arrays.toString(num2));
        System.out.println(Arrays.toString(num3));
        System.out.println(Arrays.equals(num,num2));

    }
}
