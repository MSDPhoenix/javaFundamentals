import java.util.HashMap;
import java.util.Set;

public class HashMapFun2 {
    public static void main(String[] args){
        HashMap<String, String> countryCapitals = new HashMap<String, String>();
        countryCapitals.put("USA","Washington DC");
        countryCapitals.put("UK","London");
        countryCapitals.put("France","Paris");
        countryCapitals.put("Spain","Madrid");
        countryCapitals.put("China","Beijing");

        Set<String> countries = countryCapitals.keySet();
        for(String country : countries){
            System.out.print(country+" ");
        }
        System.out.println("");
        for(String country : countries){
            System.out.printf("The capital of %s is %s\n", country,countryCapitals.get(country));
        }
    }
}
