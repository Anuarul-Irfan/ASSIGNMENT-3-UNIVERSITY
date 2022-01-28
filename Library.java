

import java.util.Scanner;
public class Library {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to University Utara Malaysia Library.");
		System.out.println("This system will lead you to our University Library Management System.");
		System.out.println("Please press anything and enter to register yourslef.");
		String proceed1 = sc.next();
		showRegister();
		System.out.println(" ");
		
		System.out.println("============================================================================================================================== ");
		
		System.out.println("Thank you for your registeration.");
		System.out.println("Next, the system will bring you to Library Borrow System.");
		System.out.println("Please press '1' if you want to borrow books. Press '2' if you want to return a book.");
		int proceed2 = sc.nextInt();
		System.out.println(" ");
		if (proceed2 == 1) {
		System.out.println("============================================================================================================================== ");
		System.out.println("Welcome to Library Borrow System.");
		int total =showLibraryBorrow();
		

		System.out.println(" ");
		
		System.out.println("============================================================================================================================== ");
		
		System.out.println(" ");
		
		System.out.println("Next we will explain about the fine system for books that returned overdue the date and the condition of it.");
		showFinesystem();
		
		System.out.println("============================================================================================================================== ");
		System.out.println("Thank you for using the University Library Management Sytsem ");
		System.out.println("There are  "+ total+ " books remaining in the library");
		System.out.println("Have a nice day! ");
		}
		else if (proceed2 ==2) {
			System.out.println("============================================================================================================================== ");
			System.out.println("Welcome to Library Borrow System.");
			showReturnBook();
		}
		
	}
		
		public static void showRegister() {
			String name;
			int Matric_id, age, sem, choice;
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Welcome to the University Library Management System.");
			System.out.println("Please enter your personal information to proceed to borrow a book.");
			System.out.print("Please enter your name: ");
			name = sc.nextLine();                                //Students enter their name
			
			System.out.print("Please enter your Matric id: ");
			Matric_id = sc.nextInt();							//Students enter their age
			
			System.out.print("Please enter your age: ");
			age = sc.nextInt();
			
			System.out.print("Please enter your current semester: Semester ");
			sem = sc.nextInt();									//Students enter their current semester
			}
		
		
		
		
		public static int showLibraryBorrow(){
			Scanner sc = new Scanner(System.in);
			int totalbooks = 10000;
			int choice;
			String books [] = new String [5];
			String date_1[] = new String[5];
			String date_2[] = new String[5];	
			
			
			System.out.println("There are  "+totalbooks+" books that students can borrow");
			System.out.println("How many books do you want to borrow? (maximum books that can be borrow = 5)");
			choice = sc.nextInt();
			if (choice <= 5){
				for (int i=0; i < choice; i++) {
				
					System.out.println("Enter the name of books you want to borrow ");
					books [i] = sc.next(); 									//Students enter the book that they wanted to borrow
					
					System.out.println("Please enter the date of issuing following date of return.");
					System.out.println("Date of issuing:");
					date_1[i] = sc.next();									//Students enter the date of issuing
					
					System.out.println("Date of return:");
					date_2[i]= sc.next();									//Students enter the date of return
					
					totalbooks = totalbooks - 1;						//Total books updated 
					System.out.println(" ");
					}
					
				}
			else {
				do {
				System.out.println("The number of books that you want to borrow exceeds the maximum books that can be borrowed.");
				System.out.println("How many books do you want to borrow? (maximum books that can be borrow = 5)");
				choice = sc.nextInt();
				}
				while (choice > 5);
				
				for (int i=0; i < choice; i++) {
				System.out.println("Enter the name of books you want to borrow ");
				books [i] = sc.next(); 									//Students enter the book that they wanted to borrow
				
				System.out.println("Please enter the date of issuing following date of return.");
				System.out.println("Date of issuing:");
				date_1[i] = sc.next();									//Students enter the date of issuing
				
				System.out.println("Date of return:");
				date_2[i]= sc.next();									//Students enter the date of return
				
				totalbooks = totalbooks - 1;						//Total books updated 
				System.out.println(" ");
				
				}
			}
			System.out.println("We will display back the books that you borrowed for your confirmation.");
			System.out.println("Please press anything and enter to proceed");
			String proceed = sc.next();
			for (int i=0; i<=choice ;i++) {
			System.out.println("Borrowed Books: "+books[i]);
			System.out.println("Date of issuing: "+date_1[i]);
			System.out.println("Date of return: "+date_2[i]);                   //System display back the borrowing system for user confirmation
			System.out.println();
			}
			
			return totalbooks;
		}
		
		public static void showFinesystem() {
			int fine1, fine2, fine3, fine4, fine5;	
			int fine = 1;
			int fineA = fine * 30;
			int fineB =fine * 40 ;
			int fineC =fine * 50;
			int fineD = fine * 80;
			
			System.out.println("Fine will be given if students return the books past date of return "); //System explain on how the fined implemented
			System.out.println("The amount of fix fined is RM "+fine+".00");
			
			System.out.println("");
			fine1 = fine*1;
			fine2 = fine*2;
			fine3 = fine*4;
			fine4 = fine*4;
			fine5 = fine*5;
			
			
			
			System.out.println("                Days after date of return           Fine                 Total to be paid ");
			System.out.println("                        1                           RM"+fine+" X 1              RM"+fine1+".00           ");
			System.out.println("                        2                           RM"+fine+" X 2              RM"+fine2+".00           ");
			System.out.println("                        3                           RM"+fine+" X 3              RM"+fine3+".00           ");
			System.out.println("                        4                           RM"+fine+" X 4              RM"+fine4+".00           ");
			System.out.println("                        5                           RM"+fine+" X 5              RM"+fine5+".00           ");
			
			System.out.println(" ");
			
			System.out.println("After 5 days past the date of return, students will be reprimanded and blacklist for borrowing books from the library");
			System.out.println(" ");
			
			System.out.println("Students will also be given fine if the condition of the books are damaged");
			System.out.println("The fine will be calculated based on the number of pages ");
			
			System.out.println(" ");
			
			System.out.println("                 Number of pages                    Fine                ");
			System.out.println("                 Less than 30                       RM"+fineA+".00                         ");
			System.out.println("                 Between 30 and 80                  RM"+fineB+".00                         ");
			System.out.println("                 Between 80 and 150                 RM"+fineC+".00                         ");
			System.out.println("                 More than 150                      RM"+fineD+".00                         ");
			
		
			System.out.println(" ");
		}

		

		public static void showReturnBook() {
			Scanner sc = new Scanner(System.in);
			int proceed, proceed2, proceed3;
			int pages;
			String books;
			int daypass;
			int fine1, fine2, fine3, fine4, fine5;	
			int fine = 1;
			fine1 = fine*1;
			fine2 = fine*2;
			fine3 = fine*4;
			fine4 = fine*4;
			fine5 = fine*5;
			
			int fineA = fine * 30;
			int fineB =fine * 40 ;
			int fineC =fine * 50;
			int fineD = fine * 80;
			
			
			System.out.println("Welcome to the Return Book system.");
			System.out.println("Please enter the book that you want to return.");
			books = sc.next();
			
			System.out.println(" ");
			
			System.out.println("Press '1' to add  another book that you want to return. Press any number to proceed.");
			proceed = sc.nextInt();
			
			do {
				System.out.println("Please enter the book that you want to return.");
				books = sc.next();
				System.out.println("Press '1' to add  another book that you want to return. Press any number to proceed.");
				proceed = sc.nextInt();
				System.out.println(" ");
				
			}
			while (proceed ==1);
			
			System.out.println(" ");
			
			System.out.println("Did you returned the book past the date return? Press '1' if yes and any number if no.");
			proceed2 = sc.nextInt();
			
			if (proceed2 == 1) {
				System.out.println("How many days has past after the date of return?");
				daypass = sc.nextInt();
				
				if (daypass == 1) 
					System.out.println("Fine given will be: RM"+fine1+".00");
				else if (daypass == 2)
					System.out.println("Fine given will be: RM"+fine2+".00");
				else if (daypass == 3)
					System.out.println("Fine given will be: RM"+fine3+".00");
				else if (daypass == 4)
					System.out.println("Fine given will be: RM"+fine4+".00");
				else if (daypass == 5)
					System.out.println("Fine given will be: RM"+fine5+".00");
				else
					System.out.println("You will be blacklist from borrowing books from the library");
				
				System.out.println(" ");
				System.out.println("Did the book you returned in its normal condition? Press '1' if yes and any number if no.");
				proceed3 = sc.nextInt();
				
				if (proceed3 == 1) {
					System.out.println("How many pages of the book that been damaged?");
					pages = sc.nextInt();
					
					if (pages < 30) {
						System.out.println("Fine given will be: RM"+fineA+".00");
					}
					else if ((pages >= 30) && (pages < 80)) {
						System.out.println("Fine given will be: RM"+fineB+".00");
					}
					else if ((pages >= 80) && (pages < 150)) {
						System.out.println("Fine given will be: RM"+fineC+".00");
					}
					else {
						System.out.println("Fine given will be: RM"+fineD+".00");
					}
					
					System.out.println(" ");
					System.out.println("============================================================================================================================== ");
				
					System.out.println("Thank you for returning the books.");
					System.out.println("Thank you for using the University Library Management Sytsem ");
					System.exit(0);
				
			}
			
			else {
				System.out.println(" ");
				System.out.println("Did the book you returned in its normal condition? Press '1' if yes and any number if no.");
				proceed3 = sc.nextInt();
				
				if (proceed3 == 1) {
					System.out.println("How many pages of the book that been damaged?");
					pages = sc.nextInt();
					
					if (pages < 30) {
						System.out.println("Fine given will be: RM"+fineA+".00");
					}
					else if ((pages >= 30) && (pages < 80)) {
						System.out.println("Fine given will be: RM"+fineB+".00");
					}
					else if ((pages >= 80) && (pages < 150)) {
						System.out.println("Fine given will be: RM"+fineC+".00");
					}
					else {
						System.out.println("Fine given will be: RM"+fineD+".00");
					}
					
					System.out.println(" ");
					System.out.println("============================================================================================================================== ");
				
					System.out.println("Thank you for returning the books.");
					System.out.println("Thank you for using the University Library Management Sytsem ");
					System.exit(0);
					}
				
				else {
					System.out.println(" ");
					System.out.println("============================================================================================================================== ");
				
					System.out.println("Thank you for returning the books.");
					System.out.println("Thank you for using the University Library Management Sytsem ");
					System.exit(0);
						}
					}
				}
			}
		}
