
public class FixedArrays {
    public static void main(String[] args){
        int[] myArray = new int[5];
        myArray[0] = 7;
        myArray[1] = 2;
        myArray[2] = 34;
        myArray[3] = 345625462;
        myArray[4] = 4534;
        for(int i=0;i<myArray.length; i++){
            System.out.println(myArray[i]);
        }

        String[] fruits = {"banana","pear","papaya","kiwi"};
        String temp = fruits[0];
        fruits[0] = fruits[fruits.length-1];
        fruits[fruits.length-1] = temp;
        for(int i=0;i<fruits.length; i++){
            System.out.println(fruits[i]);
        }
        String[] myArray2 = new String[5];
        System.out.println(myArray2);
        for(int i=0;i<myArray2.length; i++){
            System.out.println(myArray2[i]);
        }
    }
    
}
