public class LinkedList<T> {
    ListItem head = new ListItem();
    ListItem current = new ListItem();
    public LinkedList() {
        //head.next = null; //empty list on init
    }

    public int size()
    {
        if(head == null) return 0; //if list is empty

        int count = 0;

        current = head.next;

        while(current != null)
        {
            count++;
            current = current.next;
        }
        return count;
    }

    public void append(T value, boolean uniqueFlag)
    {
        if(head.next == null)
        {
            head.next = new ListItem(value, null);
            return;
        }

        current = head.next;

        while(current.next != null)
        {
            if(current.value == value && uniqueFlag) return;
            current = current.next;
        }

        ListItem newItem = new ListItem(value, null);
        current.next = newItem;
    }

    public T get(int pos)
    {
        if(head.next == null) return null; //if list is empty
        if(pos > size() || pos <= 0){
            System.out.println("Warning: tried to access/modify element out of bounds!");
            return null;
        }
        current = head.next;
        for(int i = 1; i<pos; i++)
        {
            current = current.next;
        }

        return current.value;
    }

    public void insert(int pos, T value)
    {
        if(head.next == null) return; //if list is empty
        itterateTo(pos);
        ListItem newItem = new ListItem(value, current.next);
        current.next = newItem;
    }

    public void print()
    {
        if(head.next == null)
        {
            return;
        }

        current = head.next;

        while(current != null)
        {
            System.out.println(current.value);
            current = current.next;
        }
    }

    public void remove(int pos)
    {
        ListItem previuos = head.next;
        if(head.next == null) return;
        for(int i = 0; i<pos; i++)
        {
            if(i == pos-1 && current.value != null)
            {
                previuos.next = current.next;
                current = previuos;
            }else {
                previuos = current;

                if (previuos.value == null) {
                    break;
                }
                current = current.next;
            }
        }
    }

    public T get_first()
    {
        if(head.next == null) return null; //if list is empty
        return head.next.value;
    }

    public T get_next()
    {
        current = current.next;
        return current.next.value;
    }

    void itterateTo(int pos)
    {
        current = head.next;
        for(int i = 0; i<pos; i++)
        {
            current = current.next;
        }
        if(pos > size()) System.out.println("Warning: tried to access/modify element out of bounds!");
    }
    class ListItem{
        T value;
        ListItem next;

        public ListItem()
        {
            next = null;
        }

        public ListItem(T value, ListItem next)
        {
            this.value = value;
            this.next = next;
        }
    }
}
