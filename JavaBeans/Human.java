
public class Human implements java.io.Serializable {
    private String name;

    public Human(){
        this.name = "Human";
    }

    public Human(String name) {
        this.name = name;
    }

    public void setName(String n){
        this.name = n;
    }

    public String getName(){
        return name;
    }
}
