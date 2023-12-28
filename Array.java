import java.util.Arrays;

public class Array {
    public static void main(String[] args){
        char vowels[]={'i','e','a','o','u'};
        Arrays.sort(vowels,1,4); 
        System.out.println(Arrays.toString(vowels));
        char key='o';
        int index=Arrays.binarySearch(vowels, key);
        System.out.println(index); 

        char name[]=new char[5];
        Arrays.fill(name,'x');
        System.out.println(Arrays.toString(name));

    }
}
