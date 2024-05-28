import java.util.Arrays;
import java.util.Random;

public class Main01 {

    public static void main(String[] args) {

        Long startTime = System.nanoTime();


        int[] array1 = new int[10];
        int[] array2 = new int[10];
        Random random = new Random();

        // Заполняем массив случайными числами
        for (int j = 0; j < array1.length; j++) {

            int num = random.nextInt(100);
            array1[j] = num;
            array2[j] = num;
        }

        // Сортировка пузырьком
        for (int j = 0; j < array1.length - 1; j++) {
            boolean isChanged = false;
            for (int i = 0; i < array1.length - j - 1; i++) {
                if (array1[i] > array1[i + 1]) {
                    int temp = array1[i];
                    array1[i] = array1[i + 1];
                    array1[i + 1] = temp;
                    isChanged = true;

                }
            }
            if (!isChanged) {
                break;
            }

        }
        Long endTime1 = System.nanoTime();
        Long duration1 = (endTime1 - startTime);
        double durationInSeconds1 = duration1 / 1000000000.0;

        System.out.println("Bubble Sort Time: " + durationInSeconds1 + " секунд");
        Long startTime2 = System.nanoTime();

//сортировка выбором
        for (int j = 0; j < array2.length; j++) {
            int min = array2[j];
            int index = j;

            for (int i = j; i < array2.length; i++) {
          if (array2[i]<min){
              min = array2[i];
              index= i;
          }
            }
int temp = array2[j];
            array2[j]= array2[index];
            array2[index]= temp;
        }
        Long endTime2 = System.nanoTime();
        Long duration2 = (endTime2 - startTime2);
        double durationInSeconds2 = duration2 / 1000000000.0;

        System.out.println("Selection sort time: " + durationInSeconds2+" секунд");
    }
}
