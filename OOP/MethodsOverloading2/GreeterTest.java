
public class GreeterTest {
    public static void main(String[] args){
        Greeter g = new Greeter();

        String greeting = g.greet();
        String greetingWithName = g.greet("Betty");
        String greetingWithName2 = g.greet("Betty","White");
        System.out.println(greeting); 
        System.out.println(greetingWithName); 
        System.out.println(greetingWithName2); 
    }

}
