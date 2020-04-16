package Zadanie5;

import static org.junit.Assert.*;

import Zadanie4.MyException;

import java.util.Arrays;

import org.junit.Test;

public class SortTest {
    @Test
    public void bubble() throws MyException {
        Sort sort = new Sort();
        int[] table = new int[]{-5, 10, 2, 3, 8, 5};
        sort.bubbleSort(table);
        assertArrayEquals(table,new int[]{-5, 2, 3, 5, 8, 10});
    }
    @Test(timeout=1000)
    public void create_random_array() throws MyException{
        Sort sort = new Sort();
        int[] table = new int[]{-5, 10, 2, 3, 8, 5};
        table = sort.makeArrRnd(table,table.length);
    }
    @Test
    public void insertion() throws MyException {
        Sort sort = new Sort();
        int[] table = new int[]{-5, 10, 2, 3, 8, 5};
        sort.insertionSort(table);
        assertArrayEquals(table,new int[]{-5, 2, 3, 5, 8, 10});
    }
    @Test
    public void merge() throws MyException {
        Sort sort = new Sort();
        int[] table = new int[]{-5, 10, 2, 3, 8, 5};
        sort.mergeSort(table);
        assertArrayEquals(table, new int[]{-5, 2, 3, 5, 8, 10});
    }
    @Test
    public void quick() throws MyException {
        Sort sort = new Sort();
        int[] table = new int[]{-5, 10, 2, 3, 8, 5};
        sort.quickSort(table);
        assertArrayEquals(table, new int[]{-5, 2, 3, 5, 8, 10});
    }
    @Test
    public void shell() throws MyException {
        Sort sort = new Sort();
        int[] table = new int[]{-5, 10, 2, 3, 8, 5};
        sort.shellSort(table);
        assertArrayEquals(table, new int[]{-5, 2, 3, 5, 8, 10});
    }
    @Test
    public void partition() throws MyException {
        Sort sort = new Sort();
        int[] table = new int[]{-5, 10, 2, 3, 8, 5};
        sort.partitionSort(table);
        assertArrayEquals(table, new int[]{-5, 2, 3, 5, 8, 10});
    }
}