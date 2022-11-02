import java.util.ArrayList;
import java.util.List;

public class SubChapter {
    final private String title;
    private List<Element> elements = new ArrayList<>();

    public SubChapter(String title) {
        this.title = title;
    }

    public void createNewParagraph(String paragraphText) {
        Paragraph paragraph = new Paragraph(paragraphText);
        elements.add(paragraph);
    }

    public void createNewImage(String imageText) {
        Image image = new Image(imageText);
        elements.add(image);
    }

    public void createNewTable(String tableText) {
        Table table = new Table(tableText);
        elements.add(table);
    }

    public void print() {
        System.out.println("Subchapter: "+title);
        for(Element el : elements)
            el.print();
    }
}
