public class Book {
    private int bookId;
    private String bookIsbn;
    private String bookTitle;
    private boolean isCheckedOut;
    private String checkedOutTo;

    public Book(int bookId, String bookIsbn, String bookTitle) {
        this.bookId = bookId;
        this.bookIsbn = bookIsbn;
        this.bookTitle = bookTitle;
        this.isCheckedOut = false;
        this.checkedOutTo = "";

    }

    // Getters and Setters
    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookIsbn() {
        return bookIsbn;
    }

    public void setBookIsbn(String bookIsbn) {
        this.bookIsbn = bookIsbn;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public boolean isCheckedOut()
    {
        return isCheckedOut;
    }

    public void setCheckedOut(boolean checkedOut)
    {
        isCheckedOut = checkedOut;
    }

    public String getCheckedOutTo()
    {
        return checkedOutTo;
    }

    public void setCheckedOutTo(String checkedOutTo)
    {
        this.checkedOutTo = checkedOutTo;
    }

    //methods
    public void checkOut(String name)
    {
        if(!isCheckedOut)
        {
            isCheckedOut = true;
            checkedOutTo = name;
            System.out.println("Book has been successfully checked out to " + name + "!");
        }
        else
        {
            System.out.print("Sorry this book already checked out");
            System.out.print("Please try a different book or come back another day");
            System.out.print("Thank you");
        }
    }

    public void checkIn()
    {
        if(isCheckedOut)
        {
            isCheckedOut = false;
            checkedOutTo = "";
            System.out.println("Book has been successfully checked in");
        }
        else
        {
            System.out.println("Book is not currently checked out");
        }
    }
    public String toString()
    {
        return "Book{" +  "id=" + bookId + ", isbn='" + bookIsbn + '\'' +", title='" + bookTitle + '\'' +  ", isCheckedOut=" + isCheckedOut + ", checkedOutTo='" + checkedOutTo + '\'' +  '}';
    }
}

