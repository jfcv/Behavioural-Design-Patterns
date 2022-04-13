package com.codewithmosh.memento.exercise;

public class Document {
    private String content;
    private String fontName;
    private int fontSize;

    public DocumentState createState()  {
        return new DocumentState(content, fontName, fontSize);
    }

    public void restore(DocumentState state) {
        this.content = state.getContent();
        this.fontName = state.getFontName();
        this.fontSize = state.getFontSize();
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setFontName(String fontName) {
        this.fontName = fontName;
    }

    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }

    @Override
    public String toString() {
        return "Document{" +
                "content='" + content + '\'' +
                ", fontName='" + fontName + '\'' +
                ", fontSize=" + fontSize +
                '}';
    }

    public void printCurrentDocument() {
        System.out.println(toString());
    }
}
