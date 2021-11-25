package Generics;

public class List {
    private int size;
    private int[] items = new int[size];
    private int count;

    public List(int size) {
        this.size = size;
    }

    public void add(int item){
        items[count++] = item;
    }

    public int get(int index){
        return items[index];
    }
}
