package Stack;

public class Main {
    public static void main(String[] args) {
        StackOfStrings stack=  new StackOfStrings();
        stack.push("abc");
        stack.push("def");
        stack.push("nhm");

        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.toString());

    }
}
