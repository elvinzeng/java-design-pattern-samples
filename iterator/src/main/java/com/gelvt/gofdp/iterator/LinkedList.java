package com.gelvt.gofdp.iterator;

/**
 * 单链表（非线程安全）
 * @author: Elvin Zeng
 * @date: 17-8-5.
 */
public class LinkedList<E> implements List<E> {
    private int size = 0;
    private Node<E> head;  //  表头对象引用
    private Node<E> last;  //  最后一个元素的引用

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>(){
            private Node<E> next = LinkedList.this.head;

            @Override
            public boolean hasNext() {
                return null != next;
            }

            @Override
            public E next() {
                if (null == next){
                    throw new RuntimeException("NoSuchElementException");
                }
                Node<E> current = this.next;
                this.next = next.getNext();
                return current.getItem();
            }
        };
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size < 1;
    }

    @Override
    public void add(E e) {
        Node<E> node = new Node<E>(null, e);
        if (null == head && null == last){
            head = node;
            last = node;
        }else{
            this.last.setNext(node);
            this.last = node;
        }
        this.size++;
    }

    /**
     * 单链表节点
     * @param <E> 链表元素类型
     */
    private static class Node<E>{
        private Node<E> next;
        private E item;

        public Node(Node<E> next, E item) {
            this.next = next;
            this.item = item;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }

        public E getItem() {
            return item;
        }

        public void setItem(E item) {
            this.item = item;
        }
    }
}
