import java.io.*;
import java.util.*;
public class PracticeProblem {

	public static void main(String args[]) {
		
	}

	public static String getName(int Line, String file){
		String name="";
		Scanner s = null;
		try{
			
			s = new Scanner(new BufferedReader(new FileReader(file)));
		int counter = 1;
		while (s.hasNext() && counter < Line){
			s.nextLine();
			counter++;
		}

			if (counter == Line && s.hasNext()){
				name = s.next() + " " + s.next();


			}
		}
		catch(IOException e){
			System.out.println(e);
		}
		finally {
			if (s != null) {
				s.close();
			}
		}
		return name;
		
	}
	
	public static int getAge(int Line, String file){
		int age =-1;
		Scanner s = null;
		try{
			
			s = new Scanner(new BufferedReader(new FileReader(file)));
		int counter = 1;
		while (s.hasNext() && counter < Line){
			s.nextLine();
			counter++;
		}

			if (counter == Line && s.hasNext()){
				s.next();
				s.next();
				age = s.nextInt();
			}	
		}
		catch(IOException e){
			System.out.println(e);
		}
		finally {
			if (s != null) {
				s.close();
			}
		}
		return age;
		
	}
}
