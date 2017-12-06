import java.util.*;

public class TreeMapCoba
{
   public static void main(String args[])
   {
      TreeMap<String, String> tm= new TreeMap<String, String>();

      tm.put("Italy","Rome");
      tm.put("Luxembourg","Luxembourg");
      tm.put("Finland","Helsinki");
      tm.put("France","Paris");
      tm.put("Greece","Athens");
      // Get a set of the entries
      Set set = tm.entrySet();
      // Get an iterator
      Iterator i = set.iterator();
      // Display elements
      while(i.hasNext()) {
        Map.Entry me = (Map.Entry)i.next();
        System.out.print(me.getKey() + ": ");
        System.out.println(me.getValue());
      }
  }
}