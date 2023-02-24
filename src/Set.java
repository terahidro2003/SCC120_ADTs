public class Set<T> extends LinkedList<T> {
    public Set()
    {

    }
    public void add(T value)
    {
        super.append(value, true);
    }

    public void remove(T value)
    {
        current = head.next;
        ListItem previuos = new ListItem(null, head.next);
        if(head.next == null)
        {
            return;
        }
        while(current.next != null)
        {
            previuos = current;
            current = current.next;
           if(value.equals(current.value))
           {
               current.next = current.next.next;
               previuos.next = current.next;
               break;
           }
        }

    }

    public Boolean contains(T value)
    {
        if(super.head.next == null) return false;
        Boolean exists = false;
        ListItem current = new ListItem();
        current = head;
        while(current.next != null)
        {
            if(current.value == value) return true;
            current = current.next;
        }
        return false;
    }

}
