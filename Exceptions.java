public class Exceptions {
    public static void main(String[] args){
        int[] numbers = {5,10,50,0,2};
        for(int number:numbers){
            try {
                System.out.println(100/number);
            } catch(Exception e){
                System.out.println("Cannot divide by zero");
            }
        }
    }
}