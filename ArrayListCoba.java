import java.util.*;

public class ArrayListCoba {
   public static void main(String args[]) {

	  ArrayList<String> obj = new ArrayList<String>();

	  /*This is how elements should be added to the array list*/
	  obj.add("1");
	  obj.add("2");
	  obj.add("3");
	  obj.add("4");
	  obj.add("5");

	  /* Displaying array list elements */
	  System.out.println("Original :" + obj);

	  /*Add element at the given index*/
	  obj.add(3, "$");

	  /*Remove elements from array list like this*/
	  // obj.remove("Chaitanya");
	  // obj.remove("Harry");

	  System.out.println("After insert \"$\" : " + obj);
   }
}