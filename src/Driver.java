import java.io.*;
import java.util.Scanner;


public class Driver {
	char[] alphabet = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T',
			'U','V','W','X','Y','Z','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t',
			'u','v','w','x','y','z','_','$'};
	static char[] temp = new char[200];
	int[] next = new int[200];
	char[] symbol = new char[200];
	static String strValue;

	static String fileName;
	int number;


	public static void main(String[] args) throws IOException{

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Enter the name of the file");
		fileName = keyboard.nextLine();
		//open file
		File myFile = new File(fileName);
		if(!myFile.exists()){
			System.out.println("The file does not exist");
			System.exit(0);
		}
		Scanner input = new Scanner(myFile);
		PrintWriter outputFile = new PrintWriter(new FileWriter("output.txt"));
		while(input.hasNext()){
			strValue = input.nextLine();
			System.out.println("Setting up");
			temp = strValue.toCharArray();
			System.out.println(temp[0] + "------Is the starting value");
			for(int i = 1; i < strValue.length(); i++){
				/*if(temp[i] ==' '){
					System.out.println("im in if");
					input.next();
				}*/
				System.out.println("the rest is:---> " + temp[i]);
				System.out.println(temp[26]);
			}
		}
		input.close();
		outputFile.close();

	}

}
