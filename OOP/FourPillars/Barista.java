
public class Barista {
    private String name;
    private CoffeeMaker coffeeMaker;

    public Barista(String name){
        this.name = name;
        this.coffeeMaker = new CoffeeMaker(40);
    }

    public void makeCoffee(){
        this.coffeeMaker.brew();
    }
}
