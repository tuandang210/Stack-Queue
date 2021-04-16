package BaiTapStack;

import java.util.Stack;

public class MyStackTest {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        Stack<Integer> myStack = new Stack<>();
        for (int i =0;i< arr.length;i++){
            myStack.push(arr[i]);
        }
        for (int i =0;i< arr.length;i++){
            arr[i]=myStack.get(i);
        }
        for (int x: arr){
            System.out.println(x);
        }

        String string = "Tuấn pro quá";
        Stack<Character> myStack1= new Stack<>();
        for (int i=0;i< string.length();i++){
            myStack1.push(string.charAt(i));
        }
        String myString = "";
        for (int i=0;i< string.length();i++){
            myString += Character.toString(myStack1.pop());
        }
        System.out.println(myString);;
    }
}
