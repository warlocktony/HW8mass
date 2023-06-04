import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();



    }

    public static void task1() {
        System.out.println("task 1");
        int[] oneTwoThree = new int[]{1,2,3};
        double[] drobNumbers = {1.57,7.654,9.986};
        double[] drobNumbersTwo = new double[]{2.45,4.345,6.768,8.85};
        


        }


    public static void task2() {
        System.out.println("task 2");
        int[] oneTwoThree = new int[]{1,2,3};
        System.out.print(oneTwoThree[0] + "," + oneTwoThree[1] + "," + oneTwoThree[2]);
        System.out.println();
        double[] drobNumbers = {1.57,7.654,9.986};
        System.out.print(drobNumbers[0] + "," + drobNumbers[1] + "," + drobNumbers[2]);
        System.out.println();
        double[] drobNumbersTwo = new double[]{2.45,4.345,6.768,8.85};
        System.out.print(drobNumbersTwo[0] + "," + drobNumbersTwo[1] + "," + drobNumbersTwo[2] + "," + drobNumbersTwo[3]);
        System.out.println();
    }
    public static void task3() {
        System.out.println("task 3");
        int[] oneTwoThree = new int[]{1,2,3};
        System.out.print(oneTwoThree[2] + "," + oneTwoThree[1] + "," + oneTwoThree[0]);
        System.out.println();
        double[] drobNumbers = {1.57,7.654,9.986};
        System.out.print(drobNumbers[2] + "," + drobNumbers[1] + "," + drobNumbers[0]);
        System.out.println();
        double[] drobNumbersTwo = new double[]{2.45,4.345,6.768,8.85};
        System.out.print(drobNumbersTwo[3] + "," + drobNumbersTwo[2] + "," + drobNumbersTwo[1] + "," + drobNumbersTwo[0]);
        System.out.println();
    }
    public static void task4() {
        System.out.println("task 4");
        int[] oneTwoThree = new int[]{1,2,3};

        for (int i = 0; i < oneTwoThree.length; i++) {
            if (oneTwoThree[i] % 2 == 1) {
                oneTwoThree[i] += 1;
            }
        }
            System.out.println(Arrays.toString(oneTwoThree));

        }
    }
