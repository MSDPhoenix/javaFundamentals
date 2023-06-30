
public interface ACPowerable {
    Integer voltage = 120;
    Integer frequency = 60;

    abstract void unplug();
    abstract boolean checkPluggedIn();

    public default void hasPower(){
        String message = "the device is ";
        if(!checkPluggedIn()){
            message += "not";
        }
        System.out.println(message + "plugged in.");
    }
}
