import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
	static char[] alphabet = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T',
		'U','V','W','X','Y','Z','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t',
		'u','v','w','x','y','z','_','$'};
	
	static ArrayList<Integer> Switch  = new ArrayList<Integer>(54);
	static char[] temp = new char[400];
	static int[] next = new int[400];
	static char[] symbol = new char[400];
	static String strValue;
	static char dummy;
	static String fileName;
	static int counter = 0;
	static int index=0;

	public static void main(String[] args) throws IOException{

		Scanner keyboard = new Scanner(System.in);

		//fills the ArrayList with -1 to symbolize no input yet recorded
		for(int i = 0; i < 54; i++){
			Switch.add(-1);
		}
		//Import txt file
		System.out.println("Enter the name of the file");
		fileName = keyboard.nextLine();
		//open file
		File myFile = new File(fileName);
		if(!myFile.exists()){
			System.out.println("The file does not exist");
			System.exit(0);
		}
		//read and ready to write to file
		Scanner input = new Scanner(myFile);
		PrintWriter outputFile = new PrintWriter(new FileWriter("output.txt"));
		//loop through the file and record the words
		while(input.hasNextLine()){
			strValue = input.nextLine();//record each line
			System.out.println("Next Row");
			temp = strValue.toCharArray();//convert each line to an array
			System.out.println(temp[0] + "------Is the starting value");
			dummy = temp[0];
			if(hasBeen(dummy))//check if the first char of the word has been used before
			{
				for(int i = Switch.get(temp[0]); i < counter; i++){
					if(symbol[i] != temp[i]){
						symbol[counter] = temp[i]; 
					}
				}
			}
			insert(temp);
		}
		
		System.out.println("Switch:");
		for(int i = 0; i < 54; i++){
			System.out.printf("%4c", alphabet[i]);

		}

		System.out.println();
		
		
		for(int i = 0; i < 54; i++){
			
			System.out.printf("%4d", Switch.get(i));

		}
		System.out.println();
		System.out.println("Symbol:");
		numberP();
		for(int i = 0; i < counter; i++){
			System.out.printf("%4c",symbol[i]);

		}
		System.out.println();
		System.out.println("Next: ");
		numberP();
		for(int i = 0; i < counter; i++){
			System.out.printf("%4d",next[i]);
		}
		System.out.println();
		
		input.close();
		outputFile.close();

	}
	static boolean hasBeen(char c){
		switch(c){
		case 'A': 
			if(!Switch.contains(c)){
				Switch.add(0, counter);
				return false;
			}
			else{
				return true;
			}
		case 'B':
			if(!Switch.contains(c)){
				Switch.add(1, counter);
				return false;
			}
			else{
				return true;
			}
		case 'C':
			if(!Switch.contains(c)){
				Switch.add(2, counter);
				return false;
			}
			else{
				return true;
			}
		case 'D':
			if(!Switch.contains(c)){
				Switch.add(4, counter);
				return false;
			}
			else{
				return true;
			}
		case 'E':
			if(!Switch.contains(c)){
				Switch.add(5, counter);
				return false;
			}
			else{
				return true;
			}
		case 'F':
			if(!Switch.contains(c)){
				Switch.add(5, counter);
				return false;
			}
			else{
				return true;
			}
		case 'G':
			if(!Switch.contains(c)){
				Switch.add(6, counter);
				return false;
			}
			else{
				return true;
			}
		case 'H':
			if(!Switch.contains(c)){
				Switch.add(7, counter);
				return false;
			}
			else{
				return true;
			}
		case 'I':
			if(!Switch.contains(c)){
				Switch.add(8, counter);
				return false;
			}
			else{
				return true;
			}
		case 'J':
			if(!Switch.contains(c)){
				Switch.add(9, counter);
				return false;
			}
			else{
				return true;
			}
		case 'K':
			if(!Switch.contains(c)){
				Switch.add(10, counter);
				return false;
			}
			else{
				return true;
			}
		case 'L':
			if(!Switch.contains(c)){
				Switch.add(11, counter);
				return false;
			}
			else{
				return true;
			}
		case 'M':
			if(!Switch.contains(c)){
				Switch.add(12, counter);
				return false;
			}
			else{
				return true;
			}
		case 'N':
			if(!Switch.contains(c)){
				Switch.add(13, counter);
				return false;
			}
			else{
				return true;
			}
		case 'O':
			if(!Switch.contains(c)){
				Switch.add(14, counter);
				return false;
			}
			else{
				return true;
			}
		case 'P':
			if(!Switch.contains(c)){
				Switch.add(15, counter);
				return false;
			}
			else{
				return true;
			}
		case 'Q':
			if(!Switch.contains(c)){
				Switch.add(16, counter);
				return false;
			}
			else{
				return true;
			}
		case 'R':
			if(!Switch.contains(c)){
				Switch.add(17, counter);
				return false;
			}
			else{
				return true;
			}
		case 'S':
			if(!Switch.contains(c)){
				Switch.add(18, counter);
				return false;
			}
			else{
				return true;
			}
		case 'T':
			if(!Switch.contains(c)){
				Switch.add(19, counter);
				return false;
			}
			else{
				return true;
			}
		case 'U':
			if(!Switch.contains(c)){
				Switch.add(20, counter);
				return false;
			}
			else{
				return true;
			}
		case 'V':
			if(!Switch.contains(c)){
				Switch.add(21, counter);
				return false;
			}
			else{
				return true;
			}
		case 'W':
			if(!Switch.contains(c)){
				Switch.add(22, counter);
				return false;
			}
			else{
				return true;
			}
		case 'X':
			if(!Switch.contains(c)){
				Switch.add(23, counter);
				return false;
			}
			else{
				return true;
			}
		case 'Y':
			if(!Switch.contains(c)){
				Switch.add(24, counter);
				return false;
			}
			else{
				return true;
			}
		case 'Z':
			if(!Switch.contains(c)){
				Switch.add(25, counter);
				return false;
			}
			else{
				return true;
			}
		case 'a':
			if(!Switch.contains(c)){
				Switch.add(26, counter);
				return false;
			}
			else{
				return true;
			}
		case 'b':
			if(!Switch.contains(c)){
				Switch.add(27, counter);
				return false;
			}
			else{
				return true;
			}
		case 'c':
			if(!Switch.contains(c)){
				Switch.add(28, counter);
				return false;
			}
			else{
				return true;
			}
		case 'd':
			if(!Switch.contains(c)){
				Switch.add(29, counter);
				return false;
			}
			else{
				return true;
			}
		case 'e':
			if(!Switch.contains(c)){
				Switch.add(30, counter);
				return false;
			}
			else{
				return true;
			}
		case 'f':
			if(!Switch.contains(c)){
				Switch.add(31, counter);
				return false;
			}
			else{
				return true;
			}
		case 'g':
			if(!Switch.contains(c)){
				Switch.add(32, counter);
				return false;
			}
			else{
				return true;
			}
		case 'h':
			if(!Switch.contains(c)){
				Switch.add(33, counter);
				return false;
			}
			else{
				return true;
			}
		case 'i':
			if(!Switch.contains(c)){
				Switch.add(34, counter);
				return false;
			}
			else{
				return true;
			}
		case 'j':
			if(!Switch.contains(c)){
				Switch.add(35, counter);
				return false;
			}
			else{
				return true;
			}
		case 'k':
			if(!Switch.contains(c)){
				Switch.add(36, counter);
				return false;
			}
			else{
				return true;
			}
		case 'l':
			if(!Switch.contains(c)){
				Switch.add(37, counter);
				return false;
			}
			else{
				return true;
			}
		case 'm':
			if(!Switch.contains(c)){
				Switch.add(38, counter);
				return false;
			}
			else{
				return true;
			}
		case 'n':
			if(!Switch.contains(c)){
				Switch.add(39, counter);
				return false;
			}
			else{
				return true;
			}
		case 'o':
			if(!Switch.contains(c)){
				Switch.add(40, counter);
				return false;
			}
			else{
				return true;
			}
		case 'p':
			if(!Switch.contains(c)){
				Switch.add(41, counter);
				return false;
			}
			else{
				return true;
			}
		case 'q':
			if(!Switch.contains(c)){
				Switch.add(42, counter);
				return false;
			}
			else{
				return true;
			}
		case 'r':
			if(!Switch.contains(c)){
				Switch.add(43, counter);
				return false;
			}
			else{
				return true;
			}
		case 's':
			if(!Switch.contains(c)){
				Switch.add(44, counter);
				return false;
			}
			else{
				return true;
			}
		case 't':
			if(!Switch.contains(c)){
				Switch.add(45, counter);
				return false;
			}
			else{
				return true;
			}
		case 'u':
			if(!Switch.contains(c)){
				Switch.add(46, counter);
				return false;
			}
			else{
				return true;
			}
		case 'v':
			if(!Switch.contains(c)){
				Switch.add(47, counter);
				return false;
			}
			else{
				return true;
			}
		case 'w':
			if(!Switch.contains(c)){
				Switch.add(48, counter);
				return false;
			}
			else{
				return true;
			}
		case 'x':
			if(!Switch.contains(c)){
				Switch.add(49, counter);
				return false;
			}
			else{
				return true;
			}
		case 'y':
			if(!Switch.contains(c)){
				Switch.add(50, counter);
				return false;
			}
			else{
				return true;
			}
		case 'z':
			if(!Switch.contains(c)){
				Switch.add(51, counter);
				return false;
			}
			else{
				return true;
			}
		case '_':
		case '$':

		}
		return false;
	}
	public static void insert(char[] temp){
		System.out.println(strValue.length() + " is the length of this row.");
		for(int i = 1; i < strValue.length(); i++){
			if(temp[i] == ' '){
				System.out.println("im in if " + temp[i] + " we are on " + i);
				System.out.println("current position " + temp[i++] + "is on position " + i );
				symbol[counter] = '@';
				counter++;
				System.out.println(temp[i++] + "------Is the starting value");
				if(hasBeen(temp[i]))//check if the first char of the word has been used before
				{
					int pointer = Switch.get(temp[0]);
					for(int j = pointer; j < counter; i++){
						if(symbol[j] != temp[i]){
							next[counter]=counter;
							symbol[counter] = temp[i]; 
							i++;
							counter++;
							for(int k = i; k < temp.length; k++){
								symbol[counter]= temp[i];
								i++;
								counter++;
							}
						}
						j++;
					}
				}
			}
			else{
				System.out.println("the rest is:---> " + temp[i]);
				symbol[counter] = temp[i];
				counter++;
			}
		}
		symbol[counter] = '@';
		counter++;
	}
	
	public static void numberP(){
		for(int i = 0; i < 54; i++){
			System.out.printf("%4d", i);
		}
		System.out.println();
	}
}
