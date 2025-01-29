package datastructures.linkedlist.doublylinkedlist.undoredofunctionalitytest;

class TextEditor {
    private TextState current;
    private int maxHistorySize;
    private int historyCount;

    public TextEditor(int maxHistorySize) {
        this.maxHistorySize = maxHistorySize;
        this.historyCount = 0;
        this.current = new TextState(""); // Initial empty state
    }

    // Add a new text state at the end of the list
    public void type(String newText) {
        TextState newState = new TextState(newText);

        if (current != null) {
            newState.prev = current;
            current.next = newState;
        }

        current = newState;
        historyCount++;

        // Limit history size
        if (historyCount > maxHistorySize) {
            removeOldestState();
        }

        System.out.println("Typed: " + newText);
    }

    // Undo functionality (move to previous state)
    public void undo() {
        if (current.prev != null) {
            current = current.prev;
            System.out.println("Undo: " + current.content);
        } else {
            System.out.println("No more undo actions available.");
        }
    }

    // Redo functionality (move to next state)
    public void redo() {
        if (current.next != null) {
            current = current.next;
            System.out.println("Redo: " + current.content);
        } else {
            System.out.println("No more redo actions available.");
        }
    }

    // Display the current state of the text
    public void displayCurrentText() {
        System.out.println("Current Text: " + current.content);
    }

    // Remove the oldest state if history exceeds limit
    private void removeOldestState() {
        TextState temp = current;
        while (temp.prev != null) {
            temp = temp.prev;
        }

        if (temp.next != null) {
            temp.next.prev = null;
        }
        historyCount--;
    }
}

