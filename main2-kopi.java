import java.util.Scanner; 

public class Main2 {

	public static void main (String[] args){
		Scanner sc = new Scanner (System.in);

		System.out.println ("please type your name");
		String name = sc.nextLine();

		System.out.println (" Hi " + name);

		System.out.println ("please type your age");
		int age = sc.nextInt();

		System.out.println (age); 

		int retireage =67;	

		System.out.println (retireage-age);
	}
}
