public class Main {
    public static void main(String[] args) {
    int[] array = generateRandomArray();}
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        int sum=0;
        for (int k : arr) {
            sum += k;
        }
        System.out.println( "Сумма трат за месяц составила  " + sum + " рублей");
        // Задача 2
        int maxMoney = 100000;
        for (int j : arr) {
            if (j > maxMoney) {
                maxMoney = j;
            }
        }
        int minMoney = 200000;
        for (int i : arr) {
            if (i < minMoney) {
                minMoney = i;
            }
        }
        System.out.println( "Минимальная сумма трат за день составила " + minMoney + "  рублей. Максимальная сумма трат за день составила" + maxMoney+ " рублей ");
        // Задача 3
        float medium = sum / 30f;
        System.out.println( "Средняя сумма трат за месяц составила " + medium +  " рублей" );
        return arr;




        }
    }


