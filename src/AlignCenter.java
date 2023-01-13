public class AlignCenter implements AlignStrategy {
    @Override
    public String render(Paragraph paragraph) {
        return "_____" + paragraph.getText() + "_____";
    }
}