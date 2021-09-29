package ex_DSA;

public class TestStackQueue {
    public static void main(String[] args) {
        StackArray<String> stackArray = new StackArray<>();
        stackArray.push("Nam");
        stackArray.push("Nu");
        stackArray.push("Hung");
        stackArray.push("Ha");
        stackArray.push("Ly");
        stackArray.push("Lam");
        stackArray.push("Tho");
        System.out.println(stackArray);
        System.out.println("Check peek()");
        System.out.println(stackArray.peek() + "\n");
        System.out.println(stackArray);
        System.out.println(stackArray.pop() + "\n");
        System.out.println(stackArray.pop() + "\n");
        System.out.println(stackArray.pop() + "\n");
        System.out.println(stackArray.pop() + "\n");
        System.out.println(stackArray.pop() + "\n");
        System.out.println(stackArray.pop() + "\n");
        System.out.println(stackArray.pop() + "\n");
//
//        StackLinkedList<String> stackLinkedList = new StackLinkedList<>();
//        stackLinkedList.push("Nam");
//        stackLinkedList.push("Nu");
//        stackLinkedList.push("Hung");
//        stackLinkedList.push("Ha");
//        stackLinkedList.push("Ly");
//        stackLinkedList.push("Lam");
//        stackLinkedList.push("Tho");
//        System.out.println(stackLinkedList);
//        System.out.println("Check peek()");
//        System.out.println(stackLinkedList.peek() + "\n");
//        System.out.println(stackLinkedList);
//        System.out.println(stackLinkedList.pop() + "\n");
//        System.out.println(stackLinkedList.pop() + "\n");
//        System.out.println(stackLinkedList.pop() + "\n");
//        System.out.println(stackLinkedList.pop() + "\n");
//        System.out.println(stackLinkedList.pop() + "\n");
//        System.out.println(stackLinkedList.pop() + "\n");
//        System.out.println(stackLinkedList.pop() + "\n");
//
//        StackMyLinkedList<String> stackMyLinkedList = new StackMyLinkedList<>();
//        stackMyLinkedList.push("Nam");
//        stackMyLinkedList.push("Nu");
//        stackMyLinkedList.push("Hung");
//        stackMyLinkedList.push("Ha");
//        stackMyLinkedList.push("Ly");
//        stackMyLinkedList.push("Lam");
//        stackMyLinkedList.push("last");
//        System.out.println(stackMyLinkedList);
//        System.out.println("Check peek()");
//        System.out.println(stackMyLinkedList.peek() + "\n");
//        System.out.println(stackMyLinkedList);
//        System.out.println(stackMyLinkedList.pop() + "\n");
//        System.out.println(stackMyLinkedList.pop() + "\n");
//        System.out.println(stackMyLinkedList.pop() + "\n");
//        System.out.println(stackMyLinkedList.pop() + "\n");
//        System.out.println(stackMyLinkedList.pop() + "\n");
//        System.out.println(stackMyLinkedList.pop() + "\n");
//        System.out.println(stackMyLinkedList.pop() + "\n");

        QueueArray<String> queueArray = new QueueArray<>();
        queueArray.enqueue("Nam");
        queueArray.enqueue("Nu");
        queueArray.enqueue("Hung");
        queueArray.enqueue("Ha");
        queueArray.enqueue("Ly");
        queueArray.enqueue("Lam");
        queueArray.enqueue("Tho");
        System.out.println(queueArray);
        System.out.println("Check peek()");
        System.out.println(queueArray.peek() + "\n");
        System.out.println(queueArray);
        System.out.println(queueArray.dequeue() + "\n");
        System.out.println(queueArray.dequeue()+ "\n");
        System.out.println(queueArray.dequeue() + "\n");
        System.out.println(queueArray.dequeue() + "\n");
        System.out.println(queueArray.dequeue()+ "\n");
        System.out.println(queueArray.dequeue() + "\n");
        System.out.println(queueArray.dequeue() + "\n");

    }
}
