package Optional1;

import java.util.Scanner;
import java.util.Stack;

public class StackTest {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số cần chuyển: ");
        int number = sc.nextInt();
        while (number > 0) {
            int i = number % 2;
            stack.push(i);
            number = number / 2;
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }

}
