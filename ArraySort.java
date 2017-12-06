import java.util.Hashtable;
import java.util.Enumeration;
import java.util.*;


public class ArraySort{
	
	public static void main(String[] args){
	Enumeration country;
	String capital;

	Hashtable<String, String> hashtable = new Hashtable<String, String>();
	
	hashtable.put("Italy","Rome");
	hashtable.put("Luxembourg","Luxembourg");
	hashtable.put("Finland","Helsinki");
	hashtable.put("France","Paris");
	hashtable.put("Greece","Athens");

	country = hashtable.keys();

		while(country.hasMoreElements()){
			capital = (String) country.nextElement();
			System.out.println("The capital of " + capital + " is : " + hashtable.get(capital));
		}
	}
}