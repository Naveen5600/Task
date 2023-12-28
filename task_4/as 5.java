import java.util.*;
//create class Stack_Data
class Stack_Data {
    public int maxSize;
    public int top;
    public int[] stackArray;
    public Stack_Data(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1; // Stack is initially empty
    }
    // Method to push an element onto the stack
    public void push(int value) {
        if (top < maxSize - 1) {
            stackArray[++top] = value;
            System.out.println("Pushed: " + value);
        } else {
            System.out.println("Stack Overflow. Cannot push element onto the stack.");
        }
    }
    // Method to pop an element from the stack
    public int pop()
    {
        if (isEmpty()) {
            int poppedValue = stackArray[top--];
            System.out.println("Popped: " + poppedValue);
            return poppedValue;
        }
        else {
            System.out.println("stack empty");
        }
        return 0;
    }
    // Method to check if the stack is empty
    public boolean isEmpty() {
        return top != -1;
    }
    // Method to check if the stack is full
    public boolean isFull() {
        return top == maxSize - 1;
    }
}
public  class Main {
    public static void main(String[] args) {
        Stack_Data stack = new Stack_Data(5);
        // Push elements onto the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        // Pop elements from the stack
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
    }
}







