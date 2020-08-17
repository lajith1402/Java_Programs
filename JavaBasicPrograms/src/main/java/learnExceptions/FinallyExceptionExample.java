package learnExceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FinallyExceptionExample {
	static String fileName = "ReadMe.txt";
	static BufferedReader br = null;
	static FileReader fr = null;	

	public static void main(String[] args) throws Exception {
		try {
			fr = new FileReader(fileName);
			br = new BufferedReader(fr);

			String currentLine;

			while((currentLine = br.readLine()) != null) {
				System.out.println(currentLine);
			}
			throw new Exception();  // Exception catch block will be executed
		}

		catch(IOException e) {
			e.printStackTrace();
			System.out.println("IO exception is handled");
		}
		
		catch(Exception e) {
			System.out.println("Throw exception is handled");
		}

		finally {
			try {
				if(br!=null) {
					br.close();
					System.out.println("buffered reader closed");
				}
				if(fr!=null) {
					fr.close();
					System.out.println("file reader closed");
				}
			}
			catch (IOException ex) {
				ex.printStackTrace();
			}
		}

	}

}
