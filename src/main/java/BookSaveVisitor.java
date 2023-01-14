import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class BookSaveVisitor implements Visitor {

    private final JSONObject jsonObject = new JSONObject();

    @Override
    public void visitBook(Book book) {
        try {
            jsonObject.put("Author", book.getAuthors());
            visitSection(book);
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void visitSection(Section section) {
        addToJson(section, "Section");
    }

    @Override
    public void visitTableOfContents(TableOfContents table) {
        addToJson(table, "TableOfContent");
    }

    @Override
    public void visitParagraph(Paragraph paragraph) {
        addToJson(paragraph, "Paragraph");
    }

    @Override
    public void visitImageProxy(ImageProxy imageProxy) {
        addToJson(imageProxy, "ImageProxy");
    }

    @Override
    public void visitImage(Image image) {
        addToJson(image, "Image");
    }

    @Override
    public void visitTable(Table table) {
        addToJson(table, "Table");
    }

    private void addToJson(Element element, String name) {
        try {
            if (jsonObject.get(name) instanceof String) {
                jsonObject.put(name, new JSONArray(new ArrayList<>() {
                    {
                        add(jsonObject.get(name));
                        add(element.getData());
                    }
                }));
            } else {
                jsonObject.put(name, jsonObject.getJSONArray(name).put(element.getData()));
            }
        } catch (JSONException e) {
            try {
                jsonObject.put(name, element.getData());
            } catch (JSONException ex) {
                throw new RuntimeException(ex);
            }
        }
    }

    public void writeJSONToFile(String path) {
        try (FileWriter file = new FileWriter(path);) {
            file.write(jsonObject.toString(4));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}