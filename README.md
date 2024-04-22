# neighborhood-library-
# neighborhood-library-

1)Inbeded my secret screen option within first screen choice as a subchoise. 
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
2)checkOutBook is called wich contains the checkout method 
3)proud of terminal display screens 
4)  for(Book book : libraryBooks)
this loops through the book objects contained within libraryBooks
5)not all invalid inputs result in no error 
6)proud that code is written in a similar way to how the user navigates through it 
7)Learned new things in order to do this assignment in a way that worked for me 
