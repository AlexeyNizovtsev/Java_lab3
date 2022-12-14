import java.util.Scanner;


public class lab3_1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите элементы массива");

        float[] array = new float[1];
        for (int i = 0; ; i++) {
            if (sc.hasNextInt() || sc.hasNextFloat()) {
                float buff = sc.nextFloat();
                float [] buffArray = new float[i + 1];

                for (int j = 0; j < i; j++) {
                    buffArray[j] = array[j];
                }

                array = new float[i + 1];

                for (int k = 0; k < i + 1; k++) {
                    array[k] = buffArray[k];
                }

                array[array.length - 1] = buff;
            } else if (sc.hasNextLine() && sc.nextLine().equals("quit")) break;
        }

        System.out.print("Исходный массив: ");
        for (float m : array) {
            System.out.print(m + " ");
        }
        System.out.println();

        System.out.print("Массив после обработки: ");
        for (int i=0; i<array.length; i++){
            float sum=0;

            for(int j= 0; j< i+1; j++){
                sum+= array[j];
            }

            System.out.print(sum/(i+1)+ " ");
        }




        sc.close();
    }
}