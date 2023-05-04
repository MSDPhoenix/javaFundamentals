// Equality - same object or same characters?

// Normal string assignment
String a = "same string";
String b = "same string";
System.out.println(a == b);  // true
// Creating new strings as 
separate objects
a = String("same letters");
b = String("same letters");
System.out.println(a == b);  // false.  not the same object.
System.out.println(a.equals(b)); // true.  same exact characters.

// == vs .equals()
//  == compares if both objects point to the same address/object in memory
//  .equals() compares if both objects have same value

String a = new String("Dojo");
System.out.println( a == "Dojo"); // false
System.out.println( a.equals("Dojo") ); // true

