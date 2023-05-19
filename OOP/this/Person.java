
public class Person {
    private int age;
    private int cmHeight;
    private String name;

    public Person() {
        this(20,"John",171); 
    }

    public Person(int age, String name, int cmHeight) {
        this.age = age;
        this.name = name;
        this.cmHeight = cmHeight;
    }

    public void objectMethods(Person anotherObject){
        System.out.println("Class name: "+this.getClass());
        System.out.println("Class name: "+this.getClass().getSimpleName());
        System.out.println("toString: "+this.toString());
        System.out.println("Equals : "+this.equals(anotherObject));
    }
}

