/**
 * Generic MyLinkedList. Assumes E is a type that implements the comparable interface.
 * This list is sorted from smallest to largest.
 */
package bernardi.company;

public class MyLinkedList<E extends Comparable>
{
    private Node<E> head;

    private int size;

    public MyLinkedList()
    {
        head = null;
    }

    /**
     * Removes the first instance of the specified item from list
     * @param item
     * @return true if item is found and removed, false if not in list
     */
    public boolean remove(E item)
    {
        for(Node<E> it = head; it != null; it = it.getLink())
        {
            // found a Node equal to the parameter item
            if(it.getData().equals(item))
            {
                if(it != head)
                {
                    Node<E> prev = head;
                    while (prev.getLink() != it)
                    {
                        prev = prev.getLink();
                    }
                    prev.setLink(it.getLink());
                    it.setLink(null);
                    size--;
                    return true;
                }

                head = it.getLink();
                it.setLink(null);
                size--;
                return true;
            }
        }
        return false;
    }

    /**
     * returns a new OrderedList consisting of copies of the k
     * largest elements of the list. If k is larger than the length of the list, return
     * the list
     * @param k
     */
    public MyLinkedList<E> kLargest(int k)
    {
        if(k >= this.size)
        {
            return this;
        }

        MyLinkedList<E> newList = new MyLinkedList<>();

        int i = 1;
        for(Node it = head; it != null && i < this.size - k; it = it.getLink(), i++)
        {
            newList.insert((E) it.getData());
        }

        return newList;
    }

    public void insert(E item)
    {
        Node<E> newNode = new Node<E>(item, null);

        // if list is empty
        if(head == null)
        {
            head = newNode;
            this.size = 0;
            return;
        }

        // first check if head's Node's data is > than newNode's data
        if(head.getData().compareTo(newNode.getData()) > 0)
        {
            newNode.setLink(head);
            head = newNode;
            size ++;
            return;
        }


        Node<E> temp = head;
        while( ((temp.getLink() != null) &&
                (temp.getLink().getData().compareTo(newNode.getData()) < 0)) )
        {
            temp = temp.getLink();
        }

        newNode.setLink(temp.getLink());
        temp.setLink(newNode);

        size++;
    }

    public String toString()
    {
        String s = "[";
        for(Node<E> i = head; i!= null; i = i.getLink())
        {
            s += "[" + i.getData() + "], ";
        }

        s = s.substring(0, s.length()-2);
        s+= "]";

        return s;
    }




}
