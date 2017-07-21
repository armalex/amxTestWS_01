package TestAndPoc;


import java.util.Enumeration;
import java.util.Hashtable;

public class hashmap {
	
	  public static void main(String[] args) {

		    Hashtable ht = new Hashtable();
		    ht.put(13, "printemps");
		    ht.put(10, "été");
		    ht.put(12, "automne");
		    ht.put(45, "hiver");
		    ht.put(46, "hiver");

		    Enumeration e = ht.elements();

		    while(e.hasMoreElements())
		      System.out.println(e.nextElement());

		  }

}
