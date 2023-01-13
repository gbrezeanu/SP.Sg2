public class AlignLeft implements AlignStrategy {
    @Override
    public String render(Paragraph paragraph) {
        return paragraph.getText() + "__________";
    }
}