import java.io.*;
import java.util.*;

public class Zadacha67 {
    public static void main(String[] args) {
        int[] array = {3, 5, 3, 2, 7, 8, 5};
//        System.out.println(Arrays.toString(withoutRepeat(array)));
//        System.out.println(Arrays.toString(withoutRepeat1(array)));
        System.out.println(Arrays.toString(withoutRepeat2()));
    }

    public static int[] withoutRepeat(int[] array) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            set.add(array[i]);
        }
        int[] newArray = set.stream().mapToInt(Integer::intValue).toArray();
        return newArray;
    }

    public static int[] withoutRepeat1(int[] array) {
        List<Integer> list = new ArrayList<>();
        int[] newArray = Arrays.stream(array).distinct().toArray();
        return newArray;
    }

    public static int[] withoutRepeat2() {
        int[] arrayNew = null;
        int[] buffer = null;
        try (BufferedReader bis = new BufferedReader(new FileReader("file.txt"))) {
            String length = bis.readLine();
            arrayNew = new int[Integer.parseInt(length)];
            while (bis.ready()) {
                for (int i = 0; i < arrayNew.length; i++) {
                    arrayNew[i] = Integer.parseInt(bis.readLine());
                }
            }
            buffer = Arrays.stream(arrayNew).distinct().toArray();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return buffer;
    }
}
