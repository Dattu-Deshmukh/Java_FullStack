package Day_8;

//example1 
//import java.io.*;
//public class Files {
//
//	public static void main(String[] args) throws IOException {
//		// TODO Auto-generated method stub
//		File f1 = new File("C:\\Users\\user\\OneDrive\\Desktop\\SemPrep.txt");
//		if(f1.createNewFile()) {
//			System.out.println("FIle is created Successfully ");
//		}else
//		{
//			System.out.println("File already exits!!");
//		}
//
//	}
//
//}

//example2 writing a file
//import java.io.*;
//public class Files {
//
//	public static void main(String[] args) throws IOException {
//		// TODO Auto-generated method stub
//		FileWriter f1 = new FileWriter("C:\\Users\\user\\OneDrive\\Desktop\\SemPrep.txt");
//		f1.write("This Content is Written Through java program from files concept");
//		f1.close();
//		System.out.println("File Created Successfully");
//
//	}

//example3 reading a file
import java.io.*;
import java.util.*;
public class Files {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try {
		File f1 = new File("C:\\Users\\user\\OneDrive\\Desktop\\SemPrep.txt");
		Scanner in = new Scanner(f1);
		while(in.hasNextLine()) {
			String data = in.nextLine();
			System.out.println(data);
			}
			in.close();
		}
		catch(FileNotFoundException e) {
			System.out.println("An error has occured !");
			e.printStackTrace();
		}

	}
}


