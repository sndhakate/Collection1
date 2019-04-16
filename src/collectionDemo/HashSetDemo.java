package collectionDemo;  // Duplicate keys are not Allowed
import java.util.HashSet;
public class HashSetDemo {
   public static void main(String args[]) {
	      // create a hash set
	      HashSet hs = new HashSet();
	      
	      // add elements to the hash set
	      hs.add("Y");
	      hs.add("W");
	      hs.add("D");
	      hs.add("E");
	      hs.add("C");
	      hs.add("Z");
	      hs.add("D");
	      
	      System.out.println("Size of HashSet  :" + hs.size());
	      System.out.println(hs);
	      
	      System.out.println("removing element from HashSet  :"+ hs.remove("C"));   // deletion method
	      
	      System.out.println("HashSet size after deletion  :" + hs.size());
	      System.out.println("HashSet after deletion" + hs);   
	      
	      hs.add("M");
	      hs.add("W");
	      System.out.println("HashSet After deletion method and adding element " + hs);
	      
	      System.out.println (hs.contains("W"));
	   }
	}

