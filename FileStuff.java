import java.io.*;

public class FileStuff{

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String userLine = "";
		try{
			PrintWriter pw = new PrintWriter(new FileWriter(new File("myfile.txt")));
		    while(userLine != "bye"){
				System.out.println("Please type a greeting: ");
			    userLine = scan.nextLine();
				pw.println(userLine);
			}
			pw.println("This should be the first line of the file.");
			pw.println("This should be the second line of the file.");
			pw.println("Third.");

			pw.close();
		
		}catch(FileNotFoundException fnfe){
			System.out.println(fnfe.getMessage());
		}catch(IOException ioe){
			System.out.println(ioe.getMessage());
		}
		
		try{
			BufferedReader br = new BufferedReader(new FileReader(new File("myfile.txt")));

			String line;

			while((line = br.readLine()) != null){
				System.out.println(line);			
			}
			br.close();
		}catch(FileNotFoundException fnfe){
			System.out.println(fnfe.getMessage());
		}catch(IOException ioe){
			System.out.println(ioe.getMessage());
		}
	}
}


