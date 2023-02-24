public class SuperDuperHash<S,T> extends LinkedList {
    HashTable[] table;
    public SuperDuperHash(){
        table = new HashTable[100];
    }
    public SuperDuperHash(int size){
        table = new HashTable[size];
    }

    public class Pair{
        S key;
        T value;
    }

    public class HashBucket {
        LinkedList<Pair> bucket;
    }

    public class HashTable{
        HashBucket bucket = new HashBucket();
    }

    private int hash(S key)
    {
        return (int)key%10+1;
    }

    public void put(S key, T value)
    {
        int h = hash(key);
        for(Pair pair = table[h].get_first(); pair.key != null; pair = table[h].get_next())
        {

        }
    }

    public Pair get(S key)
    {

    }

    public Boolean contains(S key)
    {
        return false;
    }
}
