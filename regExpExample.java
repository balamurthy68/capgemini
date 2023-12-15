package Day5;
import java.util.regex.*;


public class regExpExample  {
    public static void main(String[] args) {
        /* Pattern for Time string hh:mm:ss
         *
         */
        //Pattern p = Pattern.compile("[0-9]{2}:[0-9]{2}:[0-9]{2}");
        //String exampleString = "10:20:45";
            
    	//Pattern to see if string has potter substring
    	//String exampleString = "Welcome to Capgemini";
    	//Pattern p = Pattern.compile(".*Welcome.*");
    	
        //Pattern to see if String begins with H
    	//Pattern p = Pattern.compile("^H.*");
    	Pattern p = Pattern.compile(".*y$");
    	String exampleString ="AAAHa";
        ////*[@id="ct"]
    	//hh:mm:ss
    	//Pattern p = Pattern.compile("[0-9]{2}:[0-9]{2}:[0-9]{2}");
        
     	
    	//String exampleString = "Jun 14, 2021";
    	
    	
    	//Pattern p = Pattern.compile("[A-Z,a-z]{3} [0-9]{2}, [0-9]{4}");
    	
    
    	Matcher m = p.matcher(exampleString);
        
        boolean b = m.matches();
        
        System.out.println(b);       
        
        //Close the browser
      //  driver.quit();
    }
}