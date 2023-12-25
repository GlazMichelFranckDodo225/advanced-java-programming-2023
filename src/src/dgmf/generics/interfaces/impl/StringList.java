package src.dgmf.generics.interfaces.impl;

import src.dgmf.generics.interfaces.IList;

public class StringList<T> implements IList<T> {
    // Properties
    private T[] dataStore;
    private int size;
    private int position;

    // Constructor
    public StringList(int numberOfElements) {
        size = numberOfElements;
        position = 0;
        dataStore = (T[]) new Object[size];
    }

    @Override
    public void addElement(T element) {
        dataStore[position] = element;
        ++position;
    }

    @Override
    public T getElement(int position) {
        return dataStore[position];
    }
}
