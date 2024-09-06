package queues_array_test;

/**
 *
 * @author ARC
 */
public class Queues_Class<T> implements ATD_Queues<T> {
    final int capacity = 1000;  // Default capacity of the queue
    private final T[] data;  // Array to store the elements of the queue
    int front;  // Index of the front element in the queue
    int rear;  // Index where the next element will be inserted
    int size;  // Number of elements in the queue

    // Default constructor
    public Queues_Class() {
        data = (T[]) new Object[capacity];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    // Constructor with a custom capacity
    public Queues_Class(int capacity) {
        data = (T[]) new Object[capacity];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    // Method to return the current size of the queue
    @Override
    public int Size() {
        return size;
    }

    // Method to check if the queue is empty
    @Override
    public boolean isEmpty() {
        return (size == 0);
    }

    // Method to add an element to the queue
    @Override
    public void enqueues(T element) throws IllegalStateException {
        if (size == data.length) {
            throw new IllegalStateException("Queue is Full");
        }

        // Update the rear index in a circular manner
        rear = (rear + 1) % data.length;
     //   System.out.println(rear + "" + data.length);
        data[rear] = element;  // Place the new element at the rear index
        size++;  // Increment the size of the queue
    }

    // Method to remove an element from the front of the queue
    @Override
    public T dequeues() {
        if (isEmpty()) {
            return null;  // Return null if the queue is empty
        }

        T ans = data[front];  // Get the front element
        data[front] = null;  // Optional: Clear the spot where the element was stored
        front = (front + 1) % data.length;  // Update the front index in a circular manner
        size--;  // Decrease the size of the queue

        return ans;  // Return the removed element
    }

    // Method to get the first element in the queue without removing it
    @Override
    public T first() {
        if (isEmpty()) {
            return null;  // Return null if the queue is empty
        }
        return data[front];  // Return the front element
    }

    // Method to display all elements in the queue
    @Override
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }

        System.out.print("Queue elements: ");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % data.length;  // Calculate the index of each element in the queue
            System.out.print(data[index] + "==>");
        }
        System.out.println();
    }
}
