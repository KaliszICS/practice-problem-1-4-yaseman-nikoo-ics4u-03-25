import java.io.*;
import java.util.*;
public class PracticeProblem {

	public static void main(String args[]) {
		
	}
	public static String getName(int Line, String file){
		String name = "";
		Scanner s = null;
		try{
			s = new Scanner(new BufferedReader(new FileReader(file)));
			int c;
		
				for(int i=0; i<2;i++){
					name = name + s.nextLine();
				}

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
		int age = -1;
		Scanner s = null;
		try{
			s = new Scanner(new BufferedReader(new FileReader(file)));
			while(s.hasNext()){
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
	public static int getNumber(int Line, String file){
		int number = -1;
		Scanner s = null;
		try{
			s = new Scanner(new BufferedReader(new FileReader(file)));
			while(s.hasNext()){
			number = s.nextInt();
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
		return number;
	}
}
