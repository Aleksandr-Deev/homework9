public class Main {

            // Массивы ч.2
    static int[] arr = generateRandomArray();

    public static void task1() {

        int allSumMonth = 0;
        for (int day : arr) {
            allSumMonth += day;
        }
        System.out.println("Сумма трат за месяц составила " + allSumMonth + " рублей.");
        System.out.println();
    }
    public static void task2() {

        int minSum = Integer.MAX_VALUE;
        int maxSum = Integer.MIN_VALUE;
        for (int day : arr) {
            if (day < minSum) {
                minSum = day;
            } else if (day > maxSum) {
                maxSum = day;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minSum + " рублей.");
        System.out.println("Максимальная сумма трат за день составила " + maxSum + " рублей.");
        System.out.println();
    }
    public static void task3() {

        int dayMonth = 30;
        int sumMonth = 0;
        for (int day: arr) {
            sumMonth += day;
        }
        int averageSum = sumMonth / dayMonth;
        System.out.println("Средняя сумма трат за месяц составила " + averageSum + " рублей.");
        System.out.println();
    }
    public static void task4() {

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0 ; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}