import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SampleInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      try {
    	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	  System.out.println("Enter a string");
    	  String name =br.readLine();
    	  System.out.println("Entre a collegeName");
    	  String collName =br.readLine();
    	  System.out.print(name=" "+collName);
    	  
      }
      catch(Exception e) {
    	  
      }
	}

}
