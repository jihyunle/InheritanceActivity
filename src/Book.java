public final class Book extends Product {

    private String author;
    private int pages;
    private long ISBN;

    public Book(){

    }

    public Book(String author, int pages) {
        this.author = author;
        this.pages = pages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public long getISBN() {
        return ISBN;
    }

    public void setISBN(long ISBN) {
        this.ISBN = ISBN;
    }

    public String toString() {
        return super.toString() +
                "Author:             " + author + "\n" +
                "Pages:              " + pages + "\n";
    }

    @Override
    public boolean equals(Object b){
        Book b1 = (Book) b;
        if (getISBN()==(b1.getISBN())){
            return true;
        } else {
            return false;
        }
    }
}