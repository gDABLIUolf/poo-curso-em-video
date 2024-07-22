public class Book implements Publication{
    private String title;
    private String author;
    private int pages;
    private int currentPage;
    private boolean open;
    private Person reader;

    public Book(String title, String author, int pages, Person reader){
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.reader = reader;
        open = false;
        this.currentPage = 0;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public Person getReader() {
        return reader;
    }

    public void setReader(Person reader) {
        this.reader = reader;
    }

    public String details() {
        return "Book: " +
                "title='" + title + '\'' +
                ",\nauthor='" + author + '\'' +
                ",\npages=" + pages +
                ",\ncurrentPage=" + currentPage +
                ",\nopen=" + open +
                ",\nreader=" + reader;
    }
    @Override
    public void open(){
        this.setOpen(true);
    }

    @Override
    public void close(){
        this.setOpen(false);
    }

    @Override
    public void flipPages(int page) {
        if (page>getPages()){
            this.setCurrentPage(page);
            System.out.println("The current page is now " + this.getCurrentPage());
        }
    }

    @Override
    public void nextPage() {
        this.setCurrentPage(getCurrentPage()+1);
    }

    @Override
    public void previousPage() {
        this.setCurrentPage(this.getCurrentPage()-1);
    }
}
