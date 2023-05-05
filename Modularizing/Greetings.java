import java.util.Date;

class Greetings {

    public String getCurrentDate() {
        Date date = new Date();
        return "Current date is " + date;
    }
    public String greetingsEnglish(String name) {
        return "Hello, " + name;
    }
    public String greetingsSpanish(String name) {
        return "Hola, " + name;
    }
}