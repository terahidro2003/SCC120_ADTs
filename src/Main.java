public class Main {
    public static void main(String[] args) {
        System.out.println("SCC130 | Fundamentals of Computer Science");
        System.out.println("Abstract Data Types | Week 16");
        Set<Integer> set = new Set<Integer>();
        set.add(55);
        set.add(877); //removed
        set.add(5);
        set.add(-9);
        set.add(1);
        set.add(55);
        set.add(55);
        set.add(55);
        set.add(55);
        set.add(1200);
        set.remove((Integer)877); //??????!!!!!!!!!!!

        System.out.println("Size: " + set.size());
        System.out.println("Elements of the set:");
        set.print();
    }
}