package Zadanie4;

public class SolutionTwo {
    private int[] calculate(float [] arr, float target) throws MyException {
        for (int i=0; i<arr.length; i++){
            for (int j=i+1; j<arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        throw new MyException();
    }

    public int[] solution (float[] arr, float target) throws MyException {
        return calculate(arr, target);
    }
}
