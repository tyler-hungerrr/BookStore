import java.util.Scanner;

public class mainClass {

	public static void main(String[] args) {
		BookStore store = new BookStore("Amazon.com", 2, 3, "410 Terry Avenue North Seattle, WA 98109 United States, Seattle, WA");
		
		Scanner input = new Scanner(System.in);
		boolean continueChoice=true;
		do {			
			printMenu();
			int choice = input.nextInt();
			input.nextLine();
			switch(choice){
			case 1:
				System.out.println("Please enter a Book name");
				String bookName1 = input.nextLine();
				System.out.println("Please enter a Book ISBN");
				int isbnName1 = input.nextInt();
				Book add = new Book(bookName1, isbnName1);
				System.out.println(store.add(add));
				break;
			case 2:
				System.out.println("Please enter a Book name");
				String bookName2 = input.nextLine();
				System.out.println("Please enter a Book ISBN");
				int isbnName2 = input.nextInt();
				Book search = new Book(bookName2, isbnName2);
				int check = store.search(search);
				if (check==1)
					System.out.println("Book is currently held by the BookStore");
				else if (check==2)
					System.out.println("Book is under review by the bookstore");
				break;
			case 3:
				System.out.println("Please enter a Book name");
				String bookName3 = input.nextLine();
				System.out.println("Please enter a Book ISBN");
				int isbnName3 = input.nextInt();
				Book remove1 = new Book(bookName3, isbnName3);
				System.out.println(store.currRemove(remove1));
				break;
			case 4:
				System.out.println("Please enter a Book name");
				String bookName4 = input.nextLine();
				System.out.println("Please enter a Book ISBN");
				int isbnName4 = input.nextInt();
				Book remove2 = new Book(bookName4, isbnName4);
				System.out.println(store.ReviewRemove(remove2));
				break;
			case 5:
				System.out.println(store.getHold());
				break;
			case 6:
				System.out.println(store.getReview());
				break;
			case 7:
				System.out.println(store);
				break;
			case 8:
				System.out.println("Good Bye!");
				continueChoice = false;
				break;
			}      
        }
		while(continueChoice);
        System.out.println("Program ended");
    }
	
	
	public static void printMenu()
	{
		System.out.println("Please enter your choice:");
		System.out.println("1: Add a book to the bookstore.");
		System.out.println("2: Check if a book is currently hold or under review by the bookstore.");
		System.out.println("3: Remove a book from the current holding list.");
		System.out.println("4: Remove a book from under review.");
		System.out.println("5: Show the current holding book list.");
		System.out.println("6: Show the under-review book list.");
		System.out.println("7: Show complete bookstore information.");
		System.out.println("8: Exit menu.");
		
	}
		
		//Create a bookstore instance using the defined constructor
		
		//Print out a user menu contains
			//Add a book to the bookstore
			//Check if a book is currently hold or under review by the bookstore
			//Remove a book from the current holding list
			//Remove a book from under review
			//Show the current holding book list
			//Show the under-review book list
			//Show complete bookstore information 
			//Exit the menu
		
		//Implement methods that supports each menu function stated in 2

}
