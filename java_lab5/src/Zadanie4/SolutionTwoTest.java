package Zadanie4;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;

import java.util.Arrays;
public class SolutionTwoTest {
    @Test
    public void sum() throws MyException {
        SolutionTwo sol = new SolutionTwo();
        assertArrayEquals(sol.solution(new float[]{-5, 10, 2, 3, 8, 5}, 5), new int[]{0, 1});
    }

    @Test(expected = MyException.class)
    public void noTarget() throws MyException {
        SolutionTwo sol = new SolutionTwo();
        sol.solution(new float[]{2, 1, 8}, 4);
    }

    @Test
    public void sumNoSequence() throws MyException {
        SolutionTwo sol = new SolutionTwo();
        assertArrayEquals(sol.solution(new float[]{2, 1, 8, 6, 3, 12}, 11), new int[]{2, 4});
    }
}