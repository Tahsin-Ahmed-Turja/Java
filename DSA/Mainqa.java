abstract class MyQueue {
    int capacity;
    int size;
    int front;
    int rear;

    public MyQueue(int cap) {
        capacity = cap;
        front = 0;
        rear = 0;
        size = 0;
    }

    public abstract void push(int x);

    public abstract int pop();

    public abstract int top();

    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }
}

class MyArrayQueue extends MyQueue {
    int[] a;

    public MyArrayQueue(int cap) {
        super(cap);
        a = new int[cap];
    }

    public void push(int x) {
        if (rear != capacity) {
            a[rear++] = x;
            size++;
        }
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
}

public class Main {
    public static void main(String[] args) {
        MyQueue q = new MyArrayQueue(10000);
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
