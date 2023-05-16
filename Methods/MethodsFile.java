// JAVA FUNDAMENTALS > METHODS

// METHOD = function that belongs to a class

// every file in Java is a class
// --> every function is a method

import java.util.Date;

class MethodsFile {
    public String greeter(String name, Date date){
        return "Hello world!" + date;
    }
    public String greeter(String name){
        return "Hello world!";
    }
}
// METHOD SIGNATURE = methodName(parameters)
// 'public' = access modifier
// 'String' = return type - method must return a string
// 'void' allows you to not return anything



// OVERLOADING METHODS 
//  = methods in same file have same name, different signatures

public final class Main {

    public static void main(String[] args) {
        // Print "Hello Sam, how are you today?" and "Hello Rick Jones, how are you today?"
        // Your code here
    }
    public static String greeting(String name) {
        return String.format("Hello %s, how are you today?", name);
    }
    public static String greeting(String firstName, String lastName){
        return String.format("Hello %s %s, how are you today?", firstName, lastName);
    }
}

// JAVA FUNDAMENTALS > MODULARIZATION

// What does Main method do?

// launchpad for application
public class ExecuteEverything {  
    public static void main(String[] args){
        // Main method tells other files to do things
    }
}
// only main method file can executte directly
class AwesomeAppStarter {
    public static void main(String[] args);
    // some code to start app 
    // or import and test code from other files
}

// IMPORTING + DEPENDENCY INJECTION

// Dependency injection = creating an instance of another class

//in TestGreetings.java
public class TestGreeting {
    public static void main(String[] args){
        Greetings greeterApp = new Greetings();
        String dateMessage = greeterApp.getCurrentDate();
        System.out.println(dateMessage);

    }
}

// in Greetings.java
import java.util.Date;

class Greetings {
    public String getCurrentDate() {
        Date date = new Date();
        return "Current date is " + date;
    }
    public String greetEnglish(String name){
        return "Hello, " + name;
    }
    public String greetSpanish(String name){
        return "Hola, " + name;

    }
}

// EXAMPLE 2
// in Capitals.java:
public class Capitals {
    public void getCapital(String country){
        System.out.println("What is the capital of " + country + "?");
        switch(country){
            case "Austria":
                System.out.println("The capital of " + country + " is Vienna.");
                break;
            case "Brazil":
                System.out.println("The capital of " + country + " is Brasilia.");
                break;
            case "Cyprus":
                System.out.println("The capital of " + country + " is Nicosia.");
                break;
            case "Egypt":
                System.out.println("The capital of " + country + " is Cairo.");
                break;
            case "Ghana":
                System.out.println("The capital of " + country + " is Accra.");
                break;
            default:
                System.out.println("I don't know the capital of " + country + ".");
                break;
        }
    }
    public static String getCountry(String capital){
        System.out.println(capital + " is the capital of which country?");
        switch(capital){
            case "Vienna":
                return capital + " is the capital of Austria.";
            case "Brasilia":
                return capital + " is the capital of Brazil.";
            case "Nicosia":
                return capital + " is the capital of Cyprus.";
            case "Cairo":
                return capital + " is the capital of Egypt.";
            case " Accra":
                return capital + " is the capital of Ghana.";
            default:
                return "I don't know that city.";
        }
    }
}

// in Test.java:
public class Test {
    public static void main(String[] args) {
        // Print the capitals of Brazil and Croatia
        Capitals capitalApp = new Capitals();
        capitalApp.getCapital("Brazil");
        capitalApp.getCapital("Croatia");
        // Print the countries where Vienna and Abu Dhabi are the capitals
        String vienna = Capitals.getCountry("Vienna");
        System.out.println(vienna);
        String abuDhabi = Capitals.getCountry("Vienna");
        System.out.println(vienna);
    }
}




















