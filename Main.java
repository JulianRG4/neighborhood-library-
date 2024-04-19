import java.util.Scanner;

public class Main
{
    static Scanner userInput = new Scanner(System.in);

    public static void main(String [] args)
    {
        Book[] libraryBooks = {
                new Book(1, "9780141439792", "Animal Farm", false, ""),
                new Book(2, "9780061120084", "To Kill a Mockingbird", false, ""),
                new Book(3, "9780060850524", "The Catcher in the Rye", false, ""),
                new Book(4, "9780679783268", "The Great Gatsby", false, ""),
                new Book(5, "9780547928227", "The Hobbit", false, ""),
                new Book(6, "9781400043416", "Fahrenheit 451", false, ""),
                new Book(7, "9781400034773", "Brave New World", false, ""),
                new Book(8, "9780062315007", "The Alchemist", false, ""),
                new Book(9, "9780439023528", "The Hunger Games", false, ""),
                new Book(10, "9780743273565", "The Kite Runner", false, ""),
                new Book(11, "9780385534635", "Gone Girl", false, ""),
                new Book(12, "9780307588364", "The Girl with the Dragon Tattoo", false, ""),
                new Book(13, "9780345803481", "The Help", false, ""),
                new Book(14, "9781400079179", "Life of Pi", false, ""),
                new Book(15, "9781400067820", "The Book Thief", false, ""),
                new Book(16, "9780062313591", "The Goldfinch", false, ""),
                new Book(17, "9780140275360", "The Picture of Dorian Gray", false, ""),
                new Book(18, "9780486280615", "Pride and Prejudice", false, ""),
                new Book(19, "9780679723165", "One Hundred Years of Solitude", false, ""),
                new Book(20, "9780679735779", "The Bell Jar", false, "")
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
                listAllAvailableBooks(libraryBooks);
                     break;

                case 2:
                //searchBy
                     break;

                case 3:
                    System.out.println();
                    System.out.println("GoodBye!");
                    break;

                default:
                    System.out.println();
                    System.out.println("Invalid Selection");
            }
            System.out.println();
            System.out.println("Press Enter to Continue");
            userInput.nextLine();

        }


    }

    public static void listAllAvailableBooks(Book[] libraryBooks)
    {
        System.out.println();
        System.out.println("Available Books");
        System.out.println("---------------");

        for(int i = 0; i < libraryBooks.length; i++)
        {
            Book books = libraryBooks[i];
            System.out.printf("%-40d, %-40s, %-40s, %-40b, %-40s\n", books.getBookId(),books.getBookIsbn(),books.getBookTitle(),books.isCheckedOut(),books.getCheckedOutTo());



        }


    }
    

    }


