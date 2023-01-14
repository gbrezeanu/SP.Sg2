import java.util.ArrayList;
import java.util.List;

public class Book extends Section {
    List<Author> authors;

    public Book(String title) {
        super(title);
        authors = new ArrayList<>();
    }

    public void addAuthor(Author author) {
        this.authors.add(author);
    }

    public void print() {
        System.out.println("Book: " + title);
        System.out.println();
        System.out.println("Authors:");
        for (Author a : authors) {
            a.print();
        }
        System.out.println();
        for (Element e : elements) {
            e.print();
        }
    }

    public void addContent(Element e) {
        elements.add(e);
    }

    public List<Author> getAuthors() {
        return authors;
    }
}
