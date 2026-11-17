import java.util.Arrays;

public class Assignment01Q04 {

    public static int[] shiftArrayCyclic(int[] array, int move, char direction) {
        if (direction != 'L' && direction != 'R') {
            return array;
        }
        if (array.length == 0) {
            return array;
        }
        if (move < 0) {
            move = -move;
            if (direction == 'L') {
                direction = 'R';
            }
            else {
                direction = 'L';
            }
        }
        move = move%array.length;
        for (int i = 1; i <= move; i++) {
            array = ShiftArrayOnce(array, direction);
        }

        return array;
    }

    private static int[] ShiftArrayOnce(int[] array, char direction) {
        int length = array.length;
        if (direction == 'L') {
            int last = array[0];
            for(int i = 0; i < length-1; i++) {
                array[i] = array[i+1];
            }
            array[length-1] = last;
        }
        else {
            int first = array[length-1];
            for(int i = length-1; i>0; i--) {
                array[i] = array[i-1];
            }
            array[0] = first;
        }
        return array;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, -1, 'R'))); // [2, 3, 4, 5, 1]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, 1, 'R'))); // [5, 1, 2, 3, 4]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, 1, 'r'))); // [1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, -2, 'g'))); // [1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, 3, 'L'))); // [4, 5, 1, 2, 3]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, -3, 'L'))); // [3, 4, 5, 1, 2]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{0, 8, 9, 5, 6}, 6, 'L'))); // [8, 9, 5, 6, 0]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{}, 3, 'R'))); // []
    }
}