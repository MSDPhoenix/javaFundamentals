
public class CappuccinoMaker extends CoffeeMaker {

    public CappuccinoMaker(int maxVolumeOz) {
        super(maxVolumeOz);
        this.milk = "whole";
    }

    public void brew(String beans){
        super.brew(beans);
        System.out.println("Smooth.");
    }
}
