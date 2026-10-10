import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    private List<String> paragraphs = new ArrayList<>();
    private List<String> images = new ArrayList<>();
    private List<String> tables = new ArrayList<>();

    public Book(String title) {
        this.title = title;
    }

    public void createNewParagraph(String paragraph) {
        paragraphs.add(paragraph);
    }

    public void createNewImage(String image) {
        images.add(image);
    }

    public void createNewTable(String table) {
        tables.add(table);
    }

    public void print() {
        System.out.println("Book: " + title);
        System.out.println("Paragraphs: " + paragraphs);
        System.out.println("Images: " + images);
        System.out.println("Tables: " + tables);
    }
}