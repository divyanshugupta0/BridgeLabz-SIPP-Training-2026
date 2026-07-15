package Stack;


public class Scenario2_LinkedListCallStack {
    static class Frame {
        String functionName;
        Frame next;

        Frame(String n, Frame x) {
            functionName = n;
            next = x;
        }
    }

    static class CallStack {
        Frame top;

        void push(String s) {
            top = new Frame(s, top);
        }

        String pop() {
            if (top == null) throw new RuntimeException("Empty");
            String t = top.functionName;
            top = top.next;
            return t;
        }

        String peek() {
            return top.functionName;
        }
    }

    public static void main(String[] args) {
        CallStack cs = new CallStack();
        cs.push("main");
        cs.push("demo");
        System.out.println(cs.peek());
        System.out.println(cs.pop());
    }
}
