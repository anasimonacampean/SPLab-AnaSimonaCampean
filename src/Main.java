public class Main {
    public static void main(String[] args) throws Exception {
        // Capitolul 1 începe la pagina 1
        Section cap1 = new Section("Capitolul 1");
        cap1.add(new Paragraph("Paragraf 1 (ocupa pg 1)"));
        cap1.add(new Paragraph("Paragraf 2 (ocupa pg 2)"));
        
        // Subcapitolul va începe la pagina 3
        Section subcap1 = new Section("Subcapitolul 1.1");
        subcap1.add(new Image("Image 1 (ocupa pg 3)"));
        subcap1.add(new Table("Table 1 (ocupa pg 4)"));
        
        // Adăugăm subcapitolul în capitolul principal
        cap1.add(subcap1);
        
        // Un nou paragraf care va fi la pagina 5
        cap1.add(new Paragraph("Paragraf 3 (ocupa pg 5)"));
        
        // Capitolul 2 va începe automat la pagina 6
        Section cap2 = new Section("Capitolul 2");
        cap2.add(new Paragraph("Paragraf 4 (ocupa pg 6)"));
        
        // 1. Apelăm vizitatorul
        GenerateToC toc = new GenerateToC();
        cap1.accept(toc);
        cap2.accept(toc);
        
        // 2. Afișăm rezultatul!
        toc.printToC();
    }
}