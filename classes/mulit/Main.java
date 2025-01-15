package mulit;

public class Main {
    public static void main(String[] args) {
        int matrix[][] = { { 10, 20, 30, 40, 45 }, { 23, 303, 304, 05, 06 }, { 31, 43, 12, 20, 17 } };

        multiDimensional(matrix);
    }
    public static void multiDimensional(int format[][]) {
        for (int r = 0; r < format.length; r++) {
            for (int c = 0; c < format[r].length; c++) {
                System.out.println(format[r][c]+"\t");
            }
            System.out.println();
        }
    }
}
