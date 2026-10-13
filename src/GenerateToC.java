import java.util.ArrayList;
import java.util.List;

public class GenerateToC implements Visitor {
    private int pageNumber = 1; // Paginarea începe de la pagina 1
    private List<String> tocEntries = new ArrayList<>(); // Lista în care salvăm cuprinsul

    // Metodă pentru a afișa lista la final
    public void printToC() {
        System.out.println("=== Cuprins ===");
        for (String entry : tocEntries) {
            System.out.println(entry);
        }
    }

    @Override
    public void visit(Book book) {}

    @Override
    public void visit(Section section) {
        // Când intrăm într-un capitol/subcapitol, reținem numele lui și pagina curentă
        tocEntries.add(section.getTitle() + " .................... pg " + pageNumber);
    }

    @Override
    public void visit(TableOfContents tableOfContents) {}

    // Fiecare element de conținut ocupă o pagină, deci creștem contorul
    @Override
    public void visit(Paragraph paragraph) {
        pageNumber++;
    }

    @Override
    public void visit(ImageProxy imageProxy) {
        pageNumber++;
    }

    @Override
    public void visit(Image image) {
        pageNumber++;
    }

    @Override
    public void visit(Table table) {
        pageNumber++;
    }
}