public class StringDemo {
    public static void main(String[] args) {

        // length
        String ninja = "Coding Dojo is Awesome";
        int length = ninja.length();
        System.out.println("String length is : " + length);

        // concatenate
        String string1 = "My name is ";
        String string2 = "Michael";
        String string3 = string1.concat(string2);
        System.out.println(string3);
        // format
        String ninja2 = String.format("Hi %s, you owe me $%.2f !","Jack", 25.0);
        System.out.println(ninja2);

        // indexOf
        String ninja3 = "Welcome to Coding Dojo!";
        int a = ninja3.indexOf("Coding");
        int b = ninja3.indexOf("co");
        int c = ninja3.indexOf("pizza"); // not found = -1
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        // trim
        String sentence = "     spaces everywhere!     ";
        System.out.println(sentence);
        System.out.println(sentence.trim());

        // uppercase/lowercase
        String d = "HELLO";
        String e = "world";
        System.out.println(d.toLowerCase());
        System.out.println(e.toUpperCase());
        
        // equality
        String f = "same string";
        String g = "same string";
        System.out.println(f == g); // true - same object in memory

        f = new String("same letters");
        g = new String("same letters");
        System.out.println(f == g); // false - not same object in memory
        System.out.println(f.equals(g)); // true - same characters 

        //  == tests to see if both variables point to same object/address in memory
        //  .equals() tests to see if two variables have the same value

        String h = new String("Dojo");
        System.out.println(h == "Dojo");  // false - not same object in memory
        System.out.println(h.equals("Dojo"));  // true - characters

    }
}