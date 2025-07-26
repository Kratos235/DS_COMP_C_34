public class MyStack {
    private String[] stack;
    private int size;
    private int top;

    public MyStack(int size) {
        System.out.println("New stack created with size: " + size);
        this.size = size;
        this.stack = new String[size];
        this.top = -1;
    }

    public int getTopIndex() {
        if(isEmpty()) {
            return -1;
        }
        return top;
    }

    public int getSize() {
        return size;
    }

    public void printStack() {
        if (isEmpty()) {
            System.out.println("Stack is empty!!");
            return;
        }
        for (int i = 0; i <= this.top; i++) {
            System.out.print(this.stack[i] + " ");
        }
        System.out.println();
    }

    public String getTopElement() {
        if(isEmpty()) {
            return null;
        }
        return this.stack[top];
    }

    public boolean isFull() {
        return this.top == this.size - 1;
    }

    public boolean isEmpty() {
        return this.top == -1;
    }

    public void push(String str) {
        if (isFull()) {
            System.out.println("Stack is FULL!!! Operation not possible");
            return;
        }
        System.out.println("adding: " + str);
        this.stack[++top] = str;
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty, Operation not possible!!!");
            return;
        }
        String v = this.stack[top--];
        System.out.println(v + " is removed");
    }
}