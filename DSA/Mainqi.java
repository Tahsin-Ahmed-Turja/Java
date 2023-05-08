public interface MyQueue {
    void push(int x);
    int pop();
    int top();
    boolean isEmpty();
    int getSize();
}

public class ArrayQueue implements MyQueue {
    private int[] a;
    private int front;
    private int rear;
    private int capacity;
    private int size;

    public ArrayQueue(int cap) {
        a = new int[cap];
        front = 0;
        rear = 0;
        capacity = cap;
        size = 0;
    }

    public void push(int x) {
        if (rear == capacity) return;
        a[rear] = x;
        rear++;
        size++;
    }

    public int pop() {
        if (!isEmpty()) {
            size--;
            return a[front++];
        }
        return -1; // or throw an exception
    }

    public int top() {
        if (!isEmpty()) {
            return a[front];
        }
        return -1; // or throw an exception
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }
}

public class Main {
    public static void main(String[] args) {
        MyQueue q = new ArrayQueue(10000);
        q.push(5);
        q.push(6);
        q.push(7);
        q.push(8);
        System.out.println(q.top());
        System.out.println(q.pop());
        System.out.println(q.top());
        System.out.println(q.pop());
        System.out.println(q.top());
        System.out.println(q.pop());
        System.out.println(q.top());
        System.out.println(q.pop());
    }
}
