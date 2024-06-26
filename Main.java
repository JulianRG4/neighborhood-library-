
import java.util.Scanner;

public class Main
{
    static Scanner userInput = new Scanner(System.in);

    public static void main(String [] args)
    {
        Book[] libraryBooks = {
                new Book(1, "9780141439792", "Animal Farm"),
                new Book(2, "9780061120084", "To Kill a Mockingbird"),
                new Book(3, "9780060850524", "The Catcher in the Rye"),
                new Book(4, "9780679783268", "The Great Gatsby"),
                new Book(5, "9780547928227", "The Hobbit"),
                new Book(6, "9781400043416", "Fahrenheit 451"),
                new Book(7, "9781400034773", "Brave New World"),
                new Book(8, "9780062315007", "The Alchemist"),
                new Book(9, "9780439023528", "The Hunger Games"),
                new Book(10, "9780743273565", "The Kite Runner"),
                new Book(11, "9780385534635", "Gone Girl"),
                new Book(12, "9780307588364", "The Girl with the Dragon Tattoo"),
                new Book(13, "9780345803481", "The Help"),
                new Book(14, "9781400079179", "Life of Pi"),
                new Book(15, "9781400067820", "The Book Thief"),
                new Book(16, "9780062313591", "The Goldfinch"),
                new Book(17, "9780140275360", "The Picture of Dorian Gray"),
                new Book(18, "9780486280615", "Pride and Prejudice"),
                new Book(19, "9780679723165", "One Hundred Years of Solitude"),
                new Book(20, "9780679735779", "The Bell Jar")
        };


        int choice =0;
        while(choice != 3)
        {
            System.out.println();
            System.out.println("----Neighborhood Library Home Screen----");
            System.out.println();
            System.out.println("1 - Show Available Books");
            System.out.println("2 - Show Checked Out Books");
            System.out.println("3 - Exit");
            System.out.println();
            System.out.println("Enter your command");
            choice = Integer.parseInt(userInput.nextLine());

            switch (choice)
            {
                case 1:
                showAvailableBooks(libraryBooks);
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("1) Checkout Book");
                    System.out.println("2) Return to Menu");

                    int subChoice = Integer.parseInt(userInput.nextLine());
                    switch (subChoice)
                    {

                        case 1:
                            checkOutBook(libraryBooks);
                            break;
                        case 2:
                            break;


                    }
                     break;

                case 2:
                //searchBy
                    showCheckedOutBooks(libraryBooks);
                    System.out.println();
                    System.out.println("(C) Check in Book");
                    System.out.println("(X) Return to menu");
                    String subInput = userInput.nextLine().strip().toUpperCase();

                    switch (subInput) {
                        case "C":
                            checkInBook(libraryBooks);
                            break;
                        case "X":
                            break;
                        default:
                            System.out.println("Invalid Choice");
                            break;
                    }
                    break;


                case 3:
                    System.out.println();
                    System.out.println("GoodBye!");
                    break;

            }
            System.out.println();
            System.out.println("Press Enter to Continue");
            userInput.nextLine();


        }
    }

    public static void showAvailableBooks(Book[] libraryBooks)
    {
        System.out.println();
        System.out.println("Available Books");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Book ID:                              Book ISBN:                           Book Title:                          is Checked Out:                  ");


        for (Book book : libraryBooks) {
            if (!book.isCheckedOut()) {
                System.out.printf("%-35d | %-35s | %-35s | %-35b | %-35s\n",book.getBookId(), book.getBookIsbn(), book.getBookTitle(), book.isCheckedOut(), book.getCheckedOutTo());
            }
        }

    }

    public static void showCheckedOutBooks(Book[] libraryBooks)
    {
        System.out.println("Books Checked out");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Book ID:                        Book ISBN:                        Book Title:                     is checked out:                 Checked out it:                  ");

                for (Book book : libraryBooks)
                {
                    if(book.isCheckedOut())
                    {
                        System.out.printf("%-30d | %-30s | %-30s | %-30b | %-30s", book.getBookId(), book.getBookIsbn(), book.getBookTitle(), book.isCheckedOut(), book.getCheckedOutTo());
                        System.out.println();
                        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------");
                    }
                }

    }

    public static void checkOutBook(Book[] libraryBooks)
    {
        System.out.println("Enter Book ID:");
        int bookId = Integer.parseInt(userInput.nextLine());

        for(Book book : libraryBooks)
        {
            if(book.getBookId() == bookId)
            {
                if(!book.isCheckedOut())
                {
                    System.out.println("Enter your name");
                    String name = userInput.nextLine();
                    book.checkOut(name);
                }
                else
                {
                    System.out.println("Book is already checked out");
                }
            }
        }

    }

    public static void checkInBook(Book[] libraryBooks)
    {
        System.out.println("\n Enter Book ID");
        int bookId = Integer.parseInt(userInput.nextLine());

        boolean bookFound = false;
        for(Book book : libraryBooks)
        {
            if (book.getBookId() == bookId && book.isCheckedOut())
            {
                book.checkIn();
                bookFound =true;
                break;
            }
        }
        if(!bookFound)
        {
            System.out.println("Book is not checked out");
        }
    }
}