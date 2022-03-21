package BookSorter;

public class Book implements Comparable<Book>{
    private String bookName;

    private String Author;

    private int pageCount;

    public Book(String bookName, String author, int pageCount) {
        this.bookName = bookName;
        Author = author;
        this.pageCount = pageCount;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    @Override
    public int compareTo(Book o) {
        return this.getBookName().compareTo(o.getBookName());
    }
}
