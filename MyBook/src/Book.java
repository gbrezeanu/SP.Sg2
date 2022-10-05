import java.util.ArrayList;
import java.util.List;

public class Book {
    private String name;
    private List<String> paragraph;
    private List<String> image;
    private List<String> table;
    public Book(String name) {
        this.name=name;
        paragraph = new ArrayList<>();
        image = new ArrayList<>();
        table = new ArrayList<>();
    }

    public void createNewParagraph(String s) {
        paragraph.add(s);
    }

    public void createNewImage(String s) {
        image.add(s);
    }

    public void createNewTable(String s) {
        table.add(s);
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", paragraph=" + paragraph +
                ", image=" + image +
                ", table=" + table +
                '}';
    }

    public void print() {
        System.out.println(this.toString());

    }
}
