package datastructures.linkedlist.doublylinkedlist.undoredofunctionalitytest;

public class UseEditor {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor(10);

        editor.type("Hello");
        editor.type("Hello, World!");
        editor.type("Hello, World! This is a text editor.");

        editor.displayCurrentText();

        editor.undo();
        editor.displayCurrentText();

        editor.undo();
        editor.displayCurrentText();

        editor.redo();
        editor.displayCurrentText();
    }
}

