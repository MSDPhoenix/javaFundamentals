
public class CappuccinoMaker2 extends CoffeeMaker{
    
    public CappuccinoMaker2(int maxVolumeOz){
        super(maxVolumeOz);
        this.milk = "whole";
    }

    public void makeCappuccino(String beans){
        super.brew(beans);
        System.out.println("Frothy!");
    }

    public void clean(){
        System.out.println("Cleaning the Froth!");
    }
}
