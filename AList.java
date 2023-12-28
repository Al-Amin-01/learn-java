import java.util.ArrayList;
import java.util.Comparator;

public class AList {
    public static void main(String[] args) {
        ArrayList<Integer> nums=new ArrayList<>();

        nums.add(2);
        nums.add(3);
        nums.add(1);
        nums.add(5);
        nums.add(4);

        nums.sort(Comparator.reverseOrder());
        
        
        System.out.println(nums.toString());
        nums.forEach(num->{
            nums.set(nums.indexOf(num),num*2);
        });
        System.out.println(nums.toString());
    }
    
}
