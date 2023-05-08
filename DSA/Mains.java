public interface MyStackInterface {
    void push(int x);
    int pop();
    int top();
    boolean isEmpty();
    boolean isFull();
    int getSize();
}

class MyStack implements MyStackInterface {
    private int[] a;
    private int size;
    private int capacity;
    private int tos;

    public MyStack(int cap) {
        a = new int[cap];
        capacity = cap;
        tos = -1;
        size = 0;
    }

    public void push(int x) {
        if (size != capacity) {
            a[++tos] = x;
            size++;
        }
    }

    public int pop() {
        size--;
        return a[tos--];
    }

    public int top() {
        return a[tos];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public int getSize() {
        return size;
    }
}

public class Main {
    public static void main(String[] args) {
        MyStackInterface s = new MyStack(10);
        s.push(10);
        s.push(19);
        s.push(11);
        System.out.println(s.top());
        System.out.println(s.pop());
        System.out.println(s.top());
        System.out.println(s.isEmpty());
    }
}
