package sunum.strategy;

public interface Sorter <T extends Comparable> {

    void sort(T[] t);

    default  void swap(T[] array, int firstIndex, int secondIndex) {
        T firstItemTemp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = firstItemTemp;
    }
}
