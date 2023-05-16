import java.util.Set;
import java.util.HashMap;

public class HashMapFun {
    public static void main(String[] args){
        HashMap<String,String> userMap = new HashMap<String,String>();
        userMap.put("nninja@codingdojo.com","Nancy Ninja");
        userMap.put("ssamurai@codingdojo.com","Sam Samurai");
        userMap.put("wwizard@codingdojo.com","Walter Wizard");
        String name = userMap.get("nninja@codingdojo.com");
        System.out.printf("The full name is '%s'%s",name,"\n");

        // get the keys using the KeySet method
        Set<String> keys = userMap.keySet();
        for(String key : keys){
            System.out.print(key+" ");
            System.out.println(userMap.get(key));
        }
    }
}
