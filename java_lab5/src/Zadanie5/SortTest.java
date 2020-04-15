package Zadanie5;

import static org.junit.jupiter.api.Assertions.*;

import Zadanie4.MyException;

import java.util.Arrays;

import org.junit.Test;

class SortTest {
    @Test
    public void bubble() throws MyException {
        Sort sort = new Sort();
        assertArrayEquals(sort.bubbleSort(new int[]{-5, 10, 2, 3, 8, 5}),new int[]{-5, 2, 3, 5, 8, 10});
    }
    @Test(timeout=1000)
    public void bubble() throws MyException{
        Sort sort = new Sort();
        assertArrayEquals(sort.makeArrRnd(new int[]{-5,10,2,3,8,5},1000));
    }
    @Test
    public void insertion() throws MyException {
        Sort sort = new Sort();
        assertArrayEquals(sort.insertionSort(new int[]{-5, 10, 2, 3, 8, 5}),new int[]{-5, 2, 3, 5, 8, 10});
    }
    @Test
    public void merge() throws MyException {
        Sort sort = new Sort();
        assertArrayEquals(sort.mergeSort(new int[]{-5, 10, 2, 3, 8, 5},0,5),new int[]{-5, 2, 3, 5, 8, 10});
    }
    @Test
    public void quick() throws MyException {
        Sort sort = new Sort();
        assertArrayEquals(sort.quickSort(new int[]{-5, 10, 2, 3, 8, 5},-5,10),new int[]{-5, 2, 3, 5, 8, 10});
    }
    @Test
    public void shell() throws MyException {
        Sort sort = new Sort();
        assertArrayEquals(sort.shellSort(new int[]{-5, 10, 2, 3, 8, 5}),new int[]{-5, 2, 3, 5, 8, 10});
    }


}