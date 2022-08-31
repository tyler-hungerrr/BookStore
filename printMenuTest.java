import java.util.Scanner;

public class printMenuTest {

	public static void main(String[] args) {
		Student s = new Student("111", "Elsa");
		
		Scanner input = new Scanner(System.in);
		String continueChoice="Yes";
		do {			
			printMenu();
			int choice = input.nextInt();
			input.nextLine();
			switch(choice){
			case 1:
				System.out.println("You are going to change the name of the student, please enter the new name:");
				String newName = input.nextLine();
				s.setName(newName);
				System.out.println("Name changed to "+ newName +"!");
				break;
			case 2:
				System.out.println(s);
				break;
			case 3: System.out.println("Good Bye!");
				break;		
			}
			if(choice!=3) {
				System.out.println("Continue? Yes or No");
				continueChoice = input.nextLine();	
			}		
			else continueChoice="No";
		}while(continueChoice.compareToIgnoreCase("Yes")==0);
		System.out.println("The end!");
	}
	
	public static void printMenu()
	{
		System.out.println("Please enter your choice:");
		System.out.println("1: Change name.");
		System.out.println("2: View student information.");
		System.out.println("3: Exit menu.");
		
	}

}
