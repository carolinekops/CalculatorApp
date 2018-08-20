import java.util.Scanner;
public class Calculator{

public static void main(String[] args) {

	Scanner keyboard = new Scanner(System.in);
	System.out.println("Want to find out how many days old you are?");
	String enter = keyboard.next();
do {	
	System.out.println("Awesome! please enter the month, day, and year of your birth. \n Example: 1 10 1996");
	int month = keyboard.nextInt();
	int day = keyboard.nextInt();
	int year = keyboard.nextInt();
	
	Days user = new Days(month, day, year);
	System.out.println(user.FinalDays());

}while(enter=="yes");	
}
}