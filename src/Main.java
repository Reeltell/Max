import java.util.Random;
class MaxSumOfSquares {
    public static void main(String[] args) {

        int n = 100;
        int maxValue = 100;

        int[] arr = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(maxValue + 1);
        }

        // Максимальная сумма квадратов
        int maxSum = Integer.MIN_VALUE;

        // Переменная для отслеживания максимального элемента в первых i-10 элементах
        int maxPrev = Integer.MIN_VALUE;

        for (int i = 10; i < n; i++) {
            // Обновляем максимальный элемент на позиции i-10
            maxPrev = Math.max(maxPrev, arr[i - 10]);

            // Вычисляем сумму квадратов текущего элемента и найденного максимума
            int currentSum = arr[i] * arr[i] + maxPrev * maxPrev;

            // Обновляем максимальную сумму
            maxSum = Math.max(maxSum, currentSum);
        }

        System.out.println("Максимальная сумма квадратов двух элементов: " + maxSum);
    }
}