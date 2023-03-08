import java.util.Arrays;

public class program {

    public static void main(String[] args) {
        System.out.println("Сравнение суммы чисел");
        System.out.println(isSumBetween10And20(5, 15)); // true
        System.out.println(isSumBetween10And20(7, 15)); // false

        System.out.println("проверить, что х положительное");
        System.out.println(isPositive(5)); // true
        System.out.println(isPositive(-3)); // false

        System.out.println("напечатать строку 'source' 'repeat' раз");
        printString("abcd", 5); // abcdabcdabcdabcdabcd
        System.out.println();

        System.out.println("проверить, является ли год високосным");
        System.out.println(isLeapYear(2004));

        System.out.println("вернуть массив длины len, каждое значение которого равно initialValue");
        int leng = 5;
        int[] arr = createArray(leng, 6);
        for (int i = 0; i < leng; i++) {
            System.out.println(arr[i]);
        }
        System.out.println();

        multiplicationArray();
        replaceArray();
        diagonalArray(5);

        // int[][] array = new int[4][4]; // [[1, 0, 0, 0], [0, 1, 0, 0], [0, 0, 1, x],
        // [0, 0, 0, 1]]
        // int x = array[2][3];

    }

    private static boolean isSumBetween10And20(int a, int b) {
        if ((a + b <= 20) && (a + b >= 10)) {
            return true;
        } else {
            return false;
        }

    }

    /**
     * 1. Написать метод, принимающий на вход два целых числа и проверяющий,
     * что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть
     * true, в противном случае – false.
     */

    private static boolean isPositive(int x) {
        if (x >= 0) {
            return true;
        } else {
            return false;
        }
    }

    private static void printString(String source, int repeat) {
        for (int i = 0; i < repeat; i++) {
            System.out.print("source");
        }
    }

    private static boolean isLeapYear(int year) {
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }

    }

    private static int[] createArray(int len, int initalValue) {
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initalValue;
        }
        return array;
    }

    /**
     * 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
     * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия
     * заменить 0 на 1, 1 на 0;
     **/
    private static void replaceArray() {
        int[] array = new int[] { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        System.out.print("Массив исходный:     ");
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                array[i] = 0;
            } else {
                array[i] = 1;
            }
        }
        System.out.print("Массив после замены: ");
        System.out.println(Arrays.toString(array));
    }

    /**
     * 2. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему
     * циклом, и числа меньшие 6 умножить на 2;
     **/
    private static void multiplicationArray() {
        int[] array = new int[] { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        System.out.print("Массив исходный:     ");
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] = array[i] * 2;
            }
        }
        System.out.print("Массив после замены: ");
        System.out.println(Arrays.toString(array));
    }

    /**
     * 3. Создать квадратный двумерный целочисленный массив (количество строк и
     * столбцов одинаковое),
     * и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно
     * только одну из диагоналей, если обе сложно).
     * Определить элементы одной из диагоналей можно по следующему принципу: индексы
     * таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
     * * Также заполнить элементы побочной диагонали
     */

    private static void diagonalArray(int a) {
        int[][] array = new int[a][a];
        for (int i = 0; i < a; i++) {
            array[i][i] = 1;
            array[i][a - i - 1] = 1;
        }
        for (int[] row : array) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}