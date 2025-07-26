import java.util.Scanner;
public class LAB_2 {
        public static void main(String[] args) {
        System.out.println("Enter the size of the stack:");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        MyStack stack = new MyStack(size);

        while(true) {
            System.out.println("Enter your Choice:");
            System.out.println("1. Push  2. Pop  3. Print Stack  4. Get Top Element  5. Get Top Index  6. Check if Full  7. Check if Empty  8. Exit");
            int choice = sc.nextInt();
            sc.nextLine();

            switch(choice) {
                case 1:
                    System.out.println("enter string to push:");
                    String str = sc.nextLine();
                    stack.push(str);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    stack.printStack();
                    break;
                case 4:
                    String topElement = stack.getTopElement();
                    if(topElement == null) {
                        System.out.println("Stack is Empty!!");
                    } else {
                        System.out.println("Top element: "+topElement);
                    }
                    break;
                case 5:
                    int topIndex = stack.getTopIndex();
                    if(topIndex == -1) {
                        System.out.println("Stack is Empty!!");
                    } else {
                        System.out.println("Top index: " + topIndex);
                    }
                    break;
                case 6:
                    if(stack.isFull()) {
                        System.out.println("Stack is Full!!");
                    } else {
                        System.out.println("Stack is not Full!!");
                    }
                    break;
                case 7:
                    if(stack.isEmpty()) {
                        System.out.println("Stack is Empty!!");
                    } else {
                        System.out.println("Stack is not Empty!!");
                    }
                    break;
                case 8:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
