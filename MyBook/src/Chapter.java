import java.util.ArrayList;
import java.util.List;

public class Chapter {
    private String title;
    private List<SubChapter> subChapters = new ArrayList<>();

    public Chapter(String title) {
        this.title = title;
    }

    public int createSubChapter(String subChapterTitle) {
        SubChapter subChapter = new SubChapter(subChapterTitle);
        subChapters.add(subChapter);
        return subChapters.indexOf(subChapter);
    }

    public SubChapter getSubChapter(int index) {
        return subChapters.get(index);
    }

    public void print() {
        System.out.println("Chapter: "+title);
        for(SubChapter sc : subChapters)
            sc.print();
    }
}
