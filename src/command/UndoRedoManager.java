package command;
import java.util.Stack;

public class UndoRedoManager {
    private Stack<Command> undoStack = new Stack<>();
    private Stack<Command> redoStack = new Stack<>();

    public void executeCommand(Command command) {
        command.execute();
        undoStack.push(command);
        redoStack.clear();
    }

    public void undo() {
        if (!undoStack.isEmpty()) {
            Command undoneCommand = undoStack.pop();
            redoStack.push(undoneCommand);
        }
    }

    public void redo() {
        if (!redoStack.isEmpty()) {
            Command redoneCommand = redoStack.pop();
            undoStack.push(redoneCommand);
            redoneCommand.execute();
        }
    }
}