import java.util.Hashtable;
import java.util.Enumeration;

public class HashIndex{

	public static void main (String[] args){
		Enumeration names;
		Integer key;

		Hashtable<Integer, String> hashtable = new Hashtable<Integer, String>();

//4 => 'white', 6 => 'green', 11=> 'red'
		hashtable.put(4,"White");
		hashtable.put(6,"Green");
		hashtable.put(11,"Red");

		names = hashtable.keys();

		key = (Integer) names.nextElement();
		key = key - 2;
		System.out.println(hashtable.get(key));

	}
}