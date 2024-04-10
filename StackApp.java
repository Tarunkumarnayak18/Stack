import java.util.Scanner;

class Stack
{
    private int s[];
    private int size;
    private int top = -1;
    
    private Scanner scan = new Scanner(System.in);

    public Stack(int n)
    {
        s = new int[n];
        size = s.length;
    }

    public void push()
    {
        int elem;
        if(top == size-1)
        {
            System.out.println("Push not possible");
        }
        else{
            System.out.println("Enter an element");
            elem = scan.nextInt();
            ++top;
            s[top] = elem;
        }
    }

    public void pop()
    {
        if(top==-1)
        {
            System.out.println("Pop not possible");
        }
        else{
            System.out.println("Element deleted is "+s[top]);
            --top;
        }
    }

    public void display()
    {
        if(top==-1)
        {
            System.out.println("Display not possible");
        }
        else{
            for(int i=top;i>=0;i--)
            {
                System.out.println(s[i]);
            }
        }
    }
}

class StackApp
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Stack Size");
        int n = scan.nextInt();

        Stack stack = new Stack(n);

        while(true)
        {
            System.out.println("Press 1 ---------> PUSH");
            System.out.println("Press 2 ---------> POP");
            System.out.println("Press 3 ---------> DISPLAY");
            System.out.println("Any other number ------> STOP");
            System.out.println("Enter your choice");
            int choice = scan.nextInt();

            switch (choice) {
                case 1: stack.push(); 
                break;
                case 2: stack.pop();
                break;
                case 3: stack.display();
                break;
                default: System.exit(0);
                break;
            }
        }
    }
}
