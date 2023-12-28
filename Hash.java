import java.util.HashMap;
public class Hash {
    public static void main(String[] args) {
        HashMap<String,Integer> score=new HashMap<String,Integer>();
        score.put("Phy",90);
        score.put("che",98);
        score.put("mat",87);
        score.putIfAbsent("bio", 78);
        score.replace("mat",97);
        score.put("che",58);

        System.out.println(score.toString());
        System.out.println(score.getOrDefault("rat",-1));
        System.out.println(score.containsValue(90));

        score.forEach((a,b)->{
            System.out.println(a+" "+b);
        });
    }
    
}
