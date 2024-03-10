import java.util.Arrays;

public class Zadacha22 {
    public static void main(String[] args) {
        int[][] array = {
                {6, 1, 8},
                {7, 5, 3},
                {2, 9, 4}
        };
        System.out.println(isMagic(array));
    }

    public static boolean isMagic(int[][] array) {
        boolean isMagic = true;
        int constanta = 0;
        int[] buffer = array[0];
        for (int i = 0; i < buffer.length; i++) {
            constanta += buffer[i];
        }
        System.out.println("constanta = " + constanta);

        for (int i = 0; i < array.length; i++) {
            int row = 0;
            for (int j = 0; j < array[i].length; j++) {
                row += array[i][j];
            }
            System.out.println("row" + (i + 1) + " = " + row);
            if (row != constanta) {
                isMagic = false;
                return isMagic;
            }
        }

        for (int i = 0; i < array.length; i++) {
            int column = 0;
            for (int j = 0; j < array[i].length; j++) {
                column += array[j][i];
            }
            System.out.println("column" + (i + 1) + " = " + column);
            if (column != constanta) {
                isMagic = false;
                return isMagic;
            }
        }

        int firsDiagonal = 0;
        for (int i = 0; i < array.length; i++) {
            firsDiagonal += array[i][i];
        }
        System.out.println("firstDiagonal = " + firsDiagonal);

        int secondDiagonal = 0;
        for (int i = 0; i < array.length; i++) {
            secondDiagonal += array[i][array.length - i - 1];
        }
        System.out.println("secondDiagonal = " + secondDiagonal);

        if (constanta != firsDiagonal && constanta != secondDiagonal) {
            isMagic = false;
        }

        return isMagic;
    }
}
