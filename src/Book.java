import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    // Cartea va stoca acum o listă de 'Elemente' (adică Secțiuni, Paragrafe, Imagini etc.)
    private List<Element> content = new ArrayList<>();

    public Book(String title) {
        this.title = title;
    }

    // Aceasta este metoda pe care Eclipse nu o găsea
    public void addContent(Element element) {
        content.add(element);
    }

    public void print() {
        System.out.println("Book: " + title);
        for (Element e : content) {
            e.print();
        }
    }
}