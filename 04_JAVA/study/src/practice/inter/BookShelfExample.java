package practice.inter;

public class BookShelfExample {
    public static void main(String[] args) {
        Queue bookQueue = new BookShelf();

        bookQueue.enqueue("오이");
        bookQueue.enqueue("당근");
        bookQueue.enqueue("김치");

        System.out.println(bookQueue.dequeue());
        System.out.println(bookQueue.dequeue());
        System.out.println(bookQueue.dequeue());



    }
}
