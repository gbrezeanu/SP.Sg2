import java.util.ArrayList;
import java.util.List;

public class SubChapter {
    private String name;
    private List<Image> imageList = new ArrayList<>();
    private List<Paragraph> paragraphList = new ArrayList<>();
    private List<Table> tableList = new ArrayList<>();

    public SubChapter(String name) {
        this.name = name;
    }

    public void createNewParagraph(String name) {
        Paragraph paragraph = new Paragraph(name);
        paragraphList.add(paragraph);
    }

    public void createNewImage(String name) {
        Image image = new Image(name);
        imageList.add(image);
    }

    public void createNewTable(String name) {
        Table table = new Table(name);
        tableList.add(table);
    }

    public void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "SubChapter{" +
                "name='" + name + '\'' +
                ", imageList=" + imageList +
                ", paragraphList=" + paragraphList +
                ", tableList=" + tableList +
                '}';
    }
}
