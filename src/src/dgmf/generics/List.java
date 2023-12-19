package src.dgmf.generics;

// Generic List Class
public class List<T> {
    // Properties
    private T[] dataStore;
    private int size;
    private int position;

    // Constructor
    public List(int numberOfElements) {
        size = numberOfElements;
        position = 0;
        dataStore = (T[]) new Object[size];
    }

    // To Add an Element to the Current Position of the List
    public void add(T element) {
        dataStore[position] = element;
        ++position;
    }

    // To Display the List of Elements
    public String toString() {
        String concatenatedElements = "";

        for(int i = 0; i < position; ++i) {
            if(i < dataStore.length - 1) {
                concatenatedElements += dataStore[i] + ", ";
            } else {
                concatenatedElements += dataStore[i] + "." ;
            }
        }

        return concatenatedElements;
    }
}
