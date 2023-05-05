public class Capitals {
    public void getCapital(String country){
        System.out.println("What is the capital of " + country + "?");
        switch(country){
            case "Austria":
                System.out.println(String.format("%s is the capital of ",country,"Vienna"));
                break;
            case "Brazil":
                System.out.println(String.format("The capital of %s is %s.",country,"Brasilia"));
                break;
            case "Cyprus":
                System.out.println(String.format("The capital of %s is %s.",country,"Nicosia"));
                break;
            case "Egypt":
                System.out.println(String.format("The capital of %s is %s.",country,"Cairo"));
                break;
            case "Ghana":
                System.out.println(String.format("The capital of %s is %s.",country,"Accra"));
                break;
            default:
                System.out.println(String.format("I don't know the capital of %s.",country));
                break;
        }

    }
    public static String getCountry(String capital){
        System.out.println(String.format("%s is the capital of which country?",capital));
        switch(capital){
            case "Vienna":
                return String.format("%s is the capital of %s.",capital,"Austria");
            case "Brasilia":
                return String.format("%s is the capital of %s.",capital,"Brazil");
            case "Nicosia":
                return String.format("%s is the capital of %s.",capital,"Cyprus");
            case "Cairo":
                return String.format("%s is the capital of %s.",capital,"Egypt");
            case "Accra":
                return String.format("%s is the capital of %s.",capital,"Ghana");
            default:
                return String.format("I don't know the capital of %s.",capital);
        }
    }
}