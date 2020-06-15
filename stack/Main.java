package stack;
public class Main {
    public static void main(String[] args) throws Exception {
        MyStack<Integer> stack = new MyStack<>();
        stack.push(5);
        stack.push(10);
        int popped = stack.pop();
        System.out.println(popped);
        
        int peeked = stack.peek();
        System.out.println(peeked);
    }
}
