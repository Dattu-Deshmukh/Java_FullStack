package Day_7;

// with try catch block 
import java.util.*;
import java.io.*;

public class Program2 {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws FileNotFoundException{
		//Scanner in = new Scanner(System.in);
		File obj = new File("C:\\Users\\user\\OneDrive\\Desktop\\data.txt");
		Scanner Reader = new Scanner(obj);
		while(Reader.hasNextLine()) {
			String data  = Reader.nextLine();
			System.out.println(data);		
			}
	}
}

//
