package classic_ds.liner.node;


/**
 * 结点类Node
 * 表示链表中的一个结点
 * 包括：数据域data + 指针域next
 */
public class Node {
    public Object data;
    public Node next; //指向后继结点的引用

    public Node() {
        this(null, null);
    }

    public Node(Object data) {
        this(data, null);
    }

    public Node(Object data, Node next) {
        this.data = data;
        this.next = next;
    }
}
