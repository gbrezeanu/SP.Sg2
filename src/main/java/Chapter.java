import java.util.ArrayList;
import java.util.List;

public class Chapter {
    private String name;
    private List<SubChapter> subChapterList = new ArrayList<>();

    public Chapter(String name) {
        this.name = name;
    }

    public int createSubChapter(String name) {
        SubChapter subChapter = new SubChapter(name);
        subChapterList.add(subChapter);
        return subChapterList.size() - 1;
    }

    public SubChapter getSubChapter(int index) {
        return subChapterList.get(index);
    }

    @Override
    public String toString() {
        return "Chapter{" +
                "name='" + name + '\'' +
                '}';
    }
}
