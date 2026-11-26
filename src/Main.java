import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args){

        List<Books> books = new ArrayList<>();

        books.add(new Books("Война и мир", "Лев Толстой", 1869));
        books.add(new Books("Анна Каренина", "Лев Толстой", 1878));
        books.add(new Books("Мастер и Маргарита", "Михаил Булгаков", 1967));

        Comparator<Books> byName =
                Comparator.comparing(Books::getAuthor, String.CASE_INSENSITIVE_ORDER);

        SortStrategy<Books> sorter = new BubbleSort<>();
        sorter.sort(books, byName);

        for (Books book : books) {
            System.out.println(book.getName());
        }
    }
    }

