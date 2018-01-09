/* cannot overload  a function just with return type different*/
/* private , public and final cannot be overridden */

package arnabFiles;

import java.util.*;

public class FisrtDataStructure {

	public static void main(String[] args) 
	{	
			
	InfoClass s1 = new InfoClass();
	InfoClass s2 ;
	
	s1.setName("arnab");
	s1.setRank(1);
	s1.setRoll(251);

	s1.setAccount( "mypass", 970638380);
	
	System.out.println("The name is" + " "+s1.getName());
	System.out.println("The roll is" + " "+s1.getRoll());
	s1.getAccount();
	
          												//  System.out.println("object value = "+ s1);  // just experimenting 
 	
															/*
    															switch("")        // empty string "" == null string...
    															{
    															case "": System.out.println("a"+""+"b"); // lets see what happens
    																}
  															*/
    SubjectIntake s = new SubjectIntake();
    
    s.setName("name2");
    s.setRoll(5);
    s.setAccount("mypass",5600);
    
    System.out.println("The name is" + " "+s.getName());
	System.out.println("The roll is" + " "+s.getRoll());
    
   }             // end of main func( )
	
	

}
