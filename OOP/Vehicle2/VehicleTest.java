// METHOD OVERLOADING

public class VehicleTest {
    public static void main(String[] args){
        Vehicle redVehicle = new Vehicle("red");
        String color = redVehicle.getColor();
        System.out.println("The color of the vehicle is: "+color);
    }
}
