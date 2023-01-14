public class TableOfContents implements Element {
    public void print() {
        System.out.println("TableOfContents");
    }

    @Override
    public void add(Element e) {

    }

    @Override
    public void remove(Element e) {

    }

    @Override
    public Element get(int e) {
        return null;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitTableOfContents(this);
    }

    @Override
    public String getData() {
        return null;
    }
}
