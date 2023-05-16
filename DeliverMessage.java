import java.util.ArrayList;

public class DeliverMessage{
    public static void main(String[] args){
        ArrayList<Object> friend = new ArrayList<Object>();
        try{
            friend.deliverMessage();
            System.out.println("The message was delivered!");
        } catch (OutOfGasException e){
            System.out.println("Hey, uh, so, uh, I ran out of gas...");
            // BACK-UP PLAN HERE
        } 
    }
}