import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Zadacha41 {
    public static void main(String[] args) {
        int[][] array = {
                {2, 4, 5, 2, 4, 2},
                {2, 2, 1, 4, 6, 8},
                {1, 4, 2, 3, 2, 2},
                {3, 5, 7, 2, 1, 6},
                {5, 2, 5, 2, 2, 7}
        };
//        System.out.println(Arrays.toString(getNumberRows(array, -10, 2)));
        System.out.println(Arrays.toString(getNumberRows1()));
    }

    public static int[] getNumberRows(int[][] array, int num, int count) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            int countNum = 0;
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == num) {
                    countNum++;
                }
            }
            if (countNum == count) {
                list.add(i);
            }
        }
        if (list.isEmpty()) {
            return new int[0];
        } else return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public static int[] getNumberRows1() {
        int[][] array = null;
        List<Integer> list = null;
        try (BufferedReader br = new BufferedReader(new FileReader("file1.txt"))) {
            int number = Integer.parseInt(br.readLine());
            int count = Integer.parseInt(br.readLine());
            int countRows = Integer.parseInt(br.readLine());
            int countColumns = Integer.parseInt(br.readLine());
            array = new int[countRows][countColumns];
            int a;
            while (br.ready()) {
                for (int i = 0; i < array.length; i++) {
                    for (int j = 0; j < array[i].length; j++) {
                        array[i][j] = Integer.parseInt(br.readLine());
                    }
                }
            }
            System.out.println(Arrays.deepToString(array));

            list = new ArrayList<>();
            for (int i = 0; i < array.length; i++) {
                int countNum = 0;
                for (int j = 0; j < array[i].length; j++) {
                    if (array[i][j] == number) {
                        countNum++;
                    }
                }
                if (countNum == count) {
                    list.add(i);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (list.isEmpty()) {
            return new int[0];
        } else return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
