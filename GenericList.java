package Generics;

public class GenericList<T> {
    private int size;
    private  T[] items = (T[]) new Object[size]; //
    private int count;

    public GenericList(int size) {
        this.size = size;
    }

    public void add(T item){
         items[count++] = item;
    }

    public  T get(int index){
      return  items[index];
    }
}
