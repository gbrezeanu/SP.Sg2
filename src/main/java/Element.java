public interface Element {
    void print();

    void add(Element e);

    void remove(Element e);

    Element get(int e);

    void accept(Visitor visitor);

    String getData();
}
