public class Books {

    private String name;
    private String author;
    private int year;


    public Books (String name, String author, int year){
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }
}
