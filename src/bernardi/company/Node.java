/**
 * A generic Node class
 * @Author Brett Bernardi
 */

package bernardi.company;

import java.util.ArrayList;
import java.util.Comparator;

public class Node<T extends Comparable>
{

    private T data;
    private Node<T> link;

    public Node(T d, Node<T> l)
    {
        this.data = d;
        this.link = l;
    }

    public void setLink(Node<T> link)
    {
        this.link = link;
    }

    public Node<T> getLink()
    {
        return this.link;
    }

    public T getData()
    {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

}
