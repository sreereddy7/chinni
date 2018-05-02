import java.util.Scanner;

public class ReverseOfString {

	public static void main(String[] args) {
		String input,reverse="";
		System.out.println("Enter your string to reverse:");
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
        input=sc.nextLine();
        for(int i=input.length()-1;i>=0;i--)
        {
        	reverse=reverse+input.charAt(i);
        	
        }
        System.out.println(reverse);
        	
	}

}
