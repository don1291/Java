import java.io.*;
import java.net.*;
import java.util.Scanner; 

public class Client{
	
	public static void main(String[] args) throws Exception{
		
		Socket s = new Socket("127.0.0.1", 3000);
		
		PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		
		String temp = br.readLine();
		
		String user="";
		do
		{
			System.out.println("Message from server: " + temp);
			Scanner input = new Scanner(System.in);
			pw.println("Did you get this?");
			System.out.println("Sending: Did you get this?");
			
			user = input.nextLine();
			pw.println(user);
			temp = br.readLine();
			
			System.out.println("Message from server: " + temp);
		}
		while(!user.equals("BYE"));
		
	}
		pw.close();
		br.close();
		s.close();
	
	
}