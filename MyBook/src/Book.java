import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    private Author author;
    private List<Chapter> chapters = new ArrayList<>();

    public Book(String title) {
        this.title = title;
    }

    public void addAuthor(Author author) {
        this.author = author;
    }

    public int createChapter(String s) {
        Chapter chapter = new Chapter(s);
        chapters.add(chapter);
        return chapters.indexOf(chapter);
    }

    public Chapter getChapter(int indexChapterOne) {
        return chapters.get(indexChapterOne);
    }

    public void print() {
        System.out.print("Book with Title: " + title + " and Author: "+author);
        for(Chapter chapter : chapters) {
            chapter.print();
        }
    }
}
