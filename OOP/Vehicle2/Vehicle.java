// METHOD OVERLOADING
// = DEFINING NEW METHOD SIGNATURES FOR SAME METHOD NAME

class Vehicle {
    private int numberOfWheels;
    private String color;
    
    // main method
    public Vehicle(){
    }
    public Vehicle(String color){
        this.color = color;
    }
    public Vehicle(String color,int numberOfWheels){
        this.color = color;
        this.numberOfWheels = numberOfWheels;
    }
    // getter
    public int getNumberOfWheels() {
        return numberOfWheels;
    }
    // setter
    public void setNumberOfWheels(int number) {
        this.numberOfWheels = number;
    }
    // getter
    public String getColor(){
        return this.color;
    }
    // setter
    public void setColor(String color){
        this.color = color;
    }

}
