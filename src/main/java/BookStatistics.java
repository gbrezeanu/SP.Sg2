public class BookStatistics implements Visitor {

    private int lengthParagraphs = 0;
    private int lengthImages = 0;
    private int lengthTables = 0;

    @Override
    public void visitBook(Book book) {

    }

    @Override
    public void visitSection(Section section) {

    }

    @Override
    public void visitTableOfContents(TableOfContents table) {

    }

    @Override
    public void visitParagraph(Paragraph paragraph) {
        lengthParagraphs++;
    }

    @Override
    public void visitImageProxy(ImageProxy imageProxy) {

    }

    @Override
    public void visitImage(Image image) {
        lengthImages++;
    }

    @Override
    public void visitTable(Table table) {
        lengthTables++;
    }


    public void printStatistics() {
        System.out.println("Book Statistics:");
        System.out.println("*** Number of images: " + lengthImages);
        System.out.println("*** Number of tables: " + lengthTables);
        System.out.println("*** Number of paragraphs: " + lengthParagraphs);
    }
}