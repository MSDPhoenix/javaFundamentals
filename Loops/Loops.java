import java.util.ArrayList;

public class Loops {
    public static void main(String[] args){
        for(int i=0;i<5;i+=2){
            System.out.println(i);
        }
        int count = 0;
        while(count<5){
            System.out.println(count);
            count++;
        }
        String[] fruits = {"banana","orange","apple","kiwi"};
        for(String s : fruits ){
            System.out.println(s);
        }
        int[] numbers = {10,20,30,40,50};
        for(int s : numbers ){
            System.out.println(s);
        }

        ArrayList<String> snacks = new ArrayList<String>();
        snacks.add("Apples");
        snacks.add("Almonds");
        snacks.add("APretzels");
        snacks.add("AYogurt");
        System.out.println(snacks);
        for( int i=0; i<snacks.size();) {
            if(snacks.get(i).charAt(0) == 'A'){
                snacks.remove(i);
            } else {
                i++;
            }
        }
        System.out.println(snacks);
        // for( int i=0; i<snacks.size();i++) {
        //     if(snacks.get(i).charAt(0) == 'A'){
        //         snacks.remove(i);
        //     }
        // }
        // for(String snack : snacks){
        //     if(snack.charAt(0) == 'A'){
        //         snacks.remove(snack);
        //     }
        // }
    }
}
