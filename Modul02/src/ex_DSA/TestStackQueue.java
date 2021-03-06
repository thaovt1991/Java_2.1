package ex_DSA;

public class TestStackQueue {
    public static void main(String[] args) {
        System.out.println("stackArray");
        StackArray<String> stackArray = new StackArray<>();
        stackArray.push("Fisrt Name");
        stackArray.push("Nu");
        stackArray.push("Hung");
        stackArray.push("Ha");
        stackArray.push("Ly");
        stackArray.push("Lam");
        stackArray.push("Last Name");
        System.out.println(stackArray);
        System.out.println("Check peek()");
        System.out.println(stackArray.peek() + ", ");
          System.out.println(stackArray);
        System.out.print(stackArray.pop() + ", ");
        System.out.print(stackArray.pop() + ", ");
        System.out.print(stackArray.pop() + ", ");
        System.out.print(stackArray.pop() + ", ");
        System.out.print(stackArray.pop() + ", ");
        System.out.print(stackArray.pop() + ", ");
        System.out.print(stackArray.pop() + ", ");
        System.out.println();
        System.out.println(stackArray);
        System.out.println();

        System.out.println("stackLinkedList");
        StackLinkedList<String> stackLinkedList = new StackLinkedList<>();
        stackLinkedList.push("First Name");
        stackLinkedList.push("Nu");
        stackLinkedList.push("Hung");
        stackLinkedList.push("Ha");
        stackLinkedList.push("Ly");
        stackLinkedList.push("Lam");
        stackLinkedList.push("Last Name");
        System.out.println(stackLinkedList);
        System.out.println("Check peek()");
        System.out.println(stackLinkedList.peek() + "\n");
        System.out.println(stackLinkedList);
        System.out.print(stackLinkedList.pop() + ", ");
        System.out.print(stackLinkedList.pop() + ", ");
        System.out.print(stackLinkedList.pop() + ", ");
        System.out.print(stackLinkedList.pop() + ", ");
        System.out.print(stackLinkedList.pop() + ", ");
        System.out.print(stackLinkedList.pop() + ", ");
        System.out.print(stackLinkedList.pop() + ", ");
        System.out.println();
        System.out.println(stackLinkedList);
        System.out.println();

        System.out.println("stackMyLinkedList");
        StackMyLinkedList<String> stackMyLinkedList = new StackMyLinkedList<>();
        stackMyLinkedList.push("First Name");
        stackMyLinkedList.push("Nu");
        stackMyLinkedList.push("Hung");
        stackMyLinkedList.push("Ha");
        stackMyLinkedList.push("Ly");
        stackMyLinkedList.push("Lam");
        stackMyLinkedList.push("last");
        System.out.println(stackMyLinkedList);
        System.out.println("Check peek()");
        System.out.println(stackMyLinkedList.peek() + "\n");
        System.out.println(stackMyLinkedList);
        System.out.print(stackMyLinkedList.pop() + ", ");
        System.out.print(stackMyLinkedList.pop() + ", ");
        System.out.print(stackMyLinkedList.pop() + ", ");
        System.out.print(stackMyLinkedList.pop() + ", ");
        System.out.print(stackMyLinkedList.pop() + ", ");
        System.out.print(stackMyLinkedList.pop() + ", ");
        System.out.print(stackMyLinkedList.pop() + ", ");
        System.out.println();
        System.out.println(stackMyLinkedList);
        System.out.println();

        System.out.println("queueArray");
        QueueArray<String> queueArray = new QueueArray<>();
        queueArray.enQueue("First Name");
        queueArray.enQueue("Nu");
        queueArray.enQueue("Hung");
        queueArray.enQueue("Ha");
        queueArray.enQueue("Ly");
        queueArray.enQueue("Lam");
        queueArray.enQueue("Last Name");
        System.out.println(queueArray);
        System.out.println("Check peek()");
        System.out.println(queueArray.peek() + ", ");
        System.out.println(queueArray);
        System.out.print(queueArray.deQueue() + ", ");
        System.out.print(queueArray.deQueue()+ ", ");
        System.out.print(queueArray.deQueue() + ", ");
        System.out.print(queueArray.deQueue() + ", ");
        System.out.print(queueArray.deQueue()+ ", ");
        System.out.print(queueArray.deQueue() + ", ");
        System.out.print(queueArray.deQueue() + ", ");
        System.out.println();
        System.out.println(queueArray);
        System.out.println();

        System.out.println("queueLinkedList");
        QueueLinkedList<String> queueLinkedList = new QueueLinkedList<>();
        queueLinkedList.enQueue("First Name");
        queueLinkedList.enQueue("Nu");
        queueLinkedList.enQueue("Hung");
        queueLinkedList.enQueue("Ha");
        queueLinkedList.enQueue("Ly");
        queueLinkedList.enQueue("Lam");
        queueLinkedList.enQueue("Last Name");
        System.out.println(queueLinkedList);
        System.out.println("Check peek()");
        System.out.println(queueLinkedList.peek() + ", ");
        System.out.println(queueLinkedList);
        System.out.print(queueLinkedList.deQueue() + ", ");
        System.out.print(queueLinkedList.deQueue()+ ", ");
        System.out.print(queueLinkedList.deQueue() + ", ");
        System.out.print(queueLinkedList.deQueue() + ", ");
        System.out.print(queueLinkedList.deQueue()+ ", ");
        System.out.print(queueLinkedList.deQueue() + ", ");
        System.out.print(queueLinkedList.deQueue() + ", ");
        System.out.println();
        System.out.println(queueLinkedList);
        System.out.println();

        System.out.println("queueMyLinkedList");
        QueueMyLinkedList<String> queueMyLinkedList = new QueueMyLinkedList<>();
        queueMyLinkedList.enQueue("First Name");
        queueMyLinkedList.enQueue("Nu");
        queueMyLinkedList.enQueue("Hung");
        queueMyLinkedList.enQueue("Ha");
        queueMyLinkedList.enQueue("Ly");
        queueMyLinkedList.enQueue("Lam");
        queueMyLinkedList.enQueue("Last Name");
        System.out.println(queueMyLinkedList);
        System.out.println("Check peek()");
        System.out.println(queueMyLinkedList.peek() + ", ");
        System.out.println(queueMyLinkedList);
        System.out.print(queueMyLinkedList.deQueue() + ", ");
        System.out.print(queueMyLinkedList.deQueue()+ ", ");
        System.out.print(queueMyLinkedList.deQueue() + ", ");
        System.out.print(queueMyLinkedList.deQueue() + ", ");
        System.out.print(queueMyLinkedList.deQueue()+ ", ");
        System.out.print(queueMyLinkedList.deQueue() + ", ");
        System.out.print(queueMyLinkedList.deQueue() + ", ");
        System.out.println();
        System.out.println(queueMyLinkedList);
        System.out.println();
        System.out.println();

 ////Queue tan dung toi da bo nha mang ;
        System.out.println("queueArrayLevelMax");
        QueueArrayLevelMax<String> queueArrayLevelMax = new QueueArrayLevelMax<>();
        queueArrayLevelMax.enQueue("First Name");
        queueArrayLevelMax.enQueue("Nu");
        queueArrayLevelMax.enQueue("Hung");
        queueArrayLevelMax.enQueue("Ha");
        queueArrayLevelMax.enQueue("Ly");
        queueArrayLevelMax.enQueue("Lam");
        queueArrayLevelMax.enQueue("Last Name");
        System.out.println(queueArrayLevelMax);
        System.out.println("Check peek()");
        System.out.println(queueArrayLevelMax.peek() + ", ");
        System.out.println(queueArrayLevelMax);
        System.out.println();
        System.out.print(queueArrayLevelMax.deQueue() + ", ");
        System.out.println();
        System.out.println(queueArrayLevelMax);
        System.out.print(queueArrayLevelMax.deQueue()+ ", ");
        System.out.println();
        System.out.println(queueArrayLevelMax);
        System.out.print(queueArrayLevelMax.deQueue() + ", ");
        System.out.print(queueArrayLevelMax.deQueue() + ", ");
        System.out.println();
        System.out.println(queueArrayLevelMax);
        System.out.print(queueArrayLevelMax.deQueue()+ ", ");
        System.out.print(queueArrayLevelMax.deQueue() + ", ");
        System.out.print(queueArrayLevelMax.deQueue() + ", ");
        queueArrayLevelMax.enQueue("Nu");
        queueArrayLevelMax.enQueue("Hung");
        System.out.println();
        System.out.println(queueArrayLevelMax);
        System.out.println();

    }
}
