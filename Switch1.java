public final class Switch1 {
    public static void main(String[] args) {
        int goals = 0;
        boolean watchReplay = false;
        System.out.println("Are we watching this?");

        switch(goals){
            case 0:
                System.out.println("Sounds like a boring game.");
                break;
            case 1:
                System.out.println("Was it a good goal?");
                watchReplay = true;
                break;
            case 2:
                System.out.println("Was it a tie?");
                watchReplay = true;
                break;
            case 3:
                System.out.println("I can't wait to see it!");
                watchReplay = true;
                break;
            default:
                System.out.println("More than three goals?  I'm in!");
        }
        System.out.println(watchReplay ? "I'll see you in a bit" : "I'll pass.");
    }
}