package arnabFiles;

import org.seleniumhq.*;
import java.io.*;

         //using the StringBuffer class
 
public class FirstTestCase {

	public static void main(String[] args) {
	
      String str = new String("firstString");
     // System.out.println(str.contains("frt"));
      System.out.println(str.startsWith("ir"));
      
      StringBuffer s = new StringBuffer("letsroll");
      System.out.println("size="+s.length());
      System.out.println("capacity = "+ s.capacity()); // extra 16 character space is by defaut added by the string buffer class
      
      s.append("blue"); //adding string
      s.append(5);     //add an integer
      s.append(false);
      
      //AbstractStringBuilder s2 = s.append(str); 
      
      s.insert(2,0x223);
       
       s.reverse();
       s.delete(1,5);
       
       s.setLength(60);
       
      System.out.println(s);
      System.out.println("new length="+s.length());
		
	}

}

