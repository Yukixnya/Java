import java.util.Scanner;

public class stack_arr {
    public int size = 10;
    public int top = -1;
    int[] arr = new int[size];

    public boolean IsEmpty() {
        return top == -1;
    }
    public boolean IsFull() {
        return top == size - 1;
    }
    public void push(int data) {
        if(IsFull()){
            System.out.print("overflow");
        }
        arr[++top] = data;
    }
    public int pop() {
        if(IsEmpty()){
            System.out.print("underflow");
            return -1;
        }
        return arr[top--];
    }

    public static void main(String[] args) {
        stack_arr stack = new stack_arr();
        int num,c=0,data;
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("1.push\n2.pop\n3.slots available\n4.exit\n");
            System.out.print("enter choice : ");
            num = sc.nextInt();
            switch (num){
                case 1:
                    System.out.print("enter data : ");
                    data = sc.nextInt();
                    stack.push(data);
                    c++;
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    System.out.println("slots available : "+(stack.size-c));
                    break;
                case 4:
                    System.out.println("Stack");
                    do{
                        System.out.println(stack.pop());
                    }while(!stack.IsEmpty());
                    break;
            }
        }while(num!=4);

    }
}