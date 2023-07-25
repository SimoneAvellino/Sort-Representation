package Logic;

import Logic.Strategy.InsertionSortStrategy;
import Logic.Strategy.SortStrategy;

import java.util.ArrayList;
import java.util.Random;

public class Array {

    private int array[];
    private SortStrategy sortStrategy;
    private ArrayList<Observer> observers = new ArrayList<>();

    public Array(int elements) {
        array = new int[elements];
        initRandom();
        sortStrategy = new InsertionSortStrategy();
    }

    public void setSortStrategy(SortStrategy sortStrategy) {
        this.sortStrategy = sortStrategy;
    }

    public void sort() {
        sortStrategy.execute(this);
    }

     public void swap(int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
        notifyObservers();
    }

    public boolean areOrdered(int i, int j) {
        return array[i] < array[j];
    }

    public boolean isSorted() {
        for(int i = 1; i < length(); i++) {
            if(!areOrdered(i - 1, i)) return false;
        }
        return true;
    }

    public int length() {
        return array.length;
    }

    private void notifyObservers() {
        observers.forEach(observer -> observer.update(this));
    }

    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    public int getElement(int i) {
        return array[i];
    }

    public void setElement(int i, int k) {
        array[i] = k;
        notifyObservers();
    }

    public void shuffle() {
        Random random = new Random();
        for (int i = length() - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        notifyObservers();
    }

    public int[] getArray() {
        return array;
    }

    private void initRandom() {
        Random random = new Random();

        // Fill the array with sequential numbers
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        // Shuffle the array
        for (int i = array.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
}
