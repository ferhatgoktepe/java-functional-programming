package functionalqueue;

public class QueueFuncDemo {
    public static void main(String[] args) {

        QueueFunc<String> q = QueueFunc.queue();

        QueueFunc<String> queueElements = q.enqueue("Hello").enqueue("World").enqueue("Test").enqueue("Functional").enqueue("Queue");
        queueElements.forEach(System.out::println);

        System.out.println("-----------------");

        QueueFunc<String> dequeueElement = queueElements.dequeue();
        dequeueElement.forEach(System.out::println);

        System.out.println("-----------------");

    }
}