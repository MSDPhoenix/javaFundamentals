import java.util.ArrayList;

public class ArraysAndLists {
    public static void main(String[] args){

        int[] myArray = new int[5];

        ArrayList<Integer> myList = new ArrayList<Integer>();
        
        myList.add(10);
        myList.add(11);
        
        System.out.println(myList);

        // GETTERS AND SETTERS

        Integer num = myList.get(0);
        System.out.println(num);

        myList.set(0,9);
        System.out.println(myList);

        ArrayList<Object> things = new ArrayList<Object>();
        things.add(10);
        things.add("Hello");
        things.add(new ArrayList<Integer>());
        things.add(12.5);
        System.out.println(things);

    }
    
}
