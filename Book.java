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
            System.out.println("Book checked out to " + name);
        }
        else
        {
            System.out.println("Book is already checked out");
        }
    }

    public void checkIn()
    {
        if(isCheckedOut)
        {
            isCheckedOut = false;
            checkedOutTo = "";
            System.out.println("Book checked in");
        }
        else
        {
            System.out.println("Book is not checked out");
        }
    }
    public String toString()
    {
        return "Book{" +  "id=" + bookId + ", isbn='" + bookIsbn + '\'' +", title='" + bookTitle + '\'' +  ", isCheckedOut=" + isCheckedOut + ", checkedOutTo='" + checkedOutTo + '\'' +  '}';
    }
}

