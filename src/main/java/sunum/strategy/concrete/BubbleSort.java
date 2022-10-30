package sunum.strategy.concrete;

import sunum.strategy.Sorter;

public class BubbleSort <T extends Comparable> implements Sorter<T> {

    @Override
    public void sort(T[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < ((array.length-1)-i); j++) {
                if (array[j].compareTo(array[j+1]) > 0)
                    swap(array, j, j+1);
            }
        }
    }
}
