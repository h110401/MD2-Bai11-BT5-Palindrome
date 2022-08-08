import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        String string = "Able was I ere I saw Elba";
        String[] split = string.toLowerCase().split("");
        Stack<String> stack = new Stack<>();
        Queue<String> queue = new LinkedList<>();
        for (String s : split) {
            stack.push(s);
            queue.add(s);
        }
        boolean check = false;
        while (!stack.isEmpty()) {
            if (stack.pop().equals(queue.remove())) check = true;
        }
        System.out.println(check);
    }
}
