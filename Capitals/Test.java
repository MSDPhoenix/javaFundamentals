public class Test {
    public static void main(String[] args){
        Capitals capitalApp = new Capitals();
        capitalApp.getCapital("Brazil");
        String vienna = Capitals.getCountry("Vienna");
        System.out.println(vienna);
        capitalApp.getCapital("Croatia");
        String abuDhabi = Capitals.getCountry("Abu Dhabi");
        System.out.println(abuDhabi);
    }
}