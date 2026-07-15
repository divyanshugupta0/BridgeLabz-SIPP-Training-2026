package Stack;


public class Scenario1_ArrayUndoBuffer {
    static class UndoBuffer {
        private String[] data;
        private int top;

        UndoBuffer(int max) {
            data = new String[max];
            top = -1;
        }

        boolean push(String edit) {
            if (top == data.length - 1) return false;
            data[++top] = edit;
            return true;
        }

        String pop() {
            if (top == -1) throw new RuntimeException("Nothing to undo");
            return data[top--];
        }

        String peek() {
            if (top == -1) throw new RuntimeException("Empty");
            return data[top];
        }
    }

    public static void main(String[] args) {
        UndoBuffer u = new UndoBuffer(3);
        u.push("Edit1");
        u.push("Edit2");
        System.out.println(u.peek());
        System.out.println(u.pop());
    }
}
