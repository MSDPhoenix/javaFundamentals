
public class OOPDemo {
    public static void main(String[] args){
        Vehicle newVehicle = new Vehicle("Ford","Mustang","green",1968);
        String myVehicle = String.format("This vehicle is a %d %s %s %s",newVehicle.year,newVehicle.color,newVehicle.make,newVehicle.model);
        System.out.println(myVehicle);
    }
    
}
