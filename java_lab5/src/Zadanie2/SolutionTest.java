package Zadanie2;

import Zadanie4.MyException;
import org.junit.Test;

import static org.junit.Assert.*;
import java.util.Arrays;

public class SolutionTest {
    @Test
    public void minInBetween() throws MyException {
        Solution sol = new Solution();
        assertEquals(sol.solution(Arrays.asList(1, 3, 6, 4, 1, 2)), 5);
    }
    @Test
    public void minAfterList() throws MyException {
        Solution sol = new Solution();
        assertEquals(sol.solution(Arrays.asList(1, 2, 3)), 4);
    }
    @Test
    public void minInBetweenWithNegative() throws MyException {
        Solution sol = new Solution();
        assertEquals(sol.solution(Arrays.asList(1, -5, 40, 0, -2,2)), 3);
    }
}
