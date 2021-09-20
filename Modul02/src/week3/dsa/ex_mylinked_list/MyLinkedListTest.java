package week3.dsa.ex_mylinked_list;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList<String> myLinkedList = new MyLinkedList<String>();
        myLinkedList.addFirst("said"); ;
        myLinkedList.addFirst("1");
        myLinkedList.addLast("2");
        myLinkedList.addLast("3");
        myLinkedList.addLast("4");
        myLinkedList.addLast("5");

        myLinkedList.printList();
        myLinkedList.add(2,"Ok");
        myLinkedList.printList();

        myLinkedList.remove(4);
        myLinkedList.printList();

        myLinkedList.clear();
        myLinkedList.printList();


    }

}
