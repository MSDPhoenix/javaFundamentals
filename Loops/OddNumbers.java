
public final class OddNumbers {
    public static void main(String[] args){
        int[] numbers = {0,1,2,3,4,5,6,7,8,9};
        for (int number : numbers){
            if (number%2!=0){
                System.out.print(number);          
            }
        }
    }
}
