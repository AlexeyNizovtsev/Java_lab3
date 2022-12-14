import java.util.Scanner;


public class lab3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите элементы массива");

        int[] array = new int[1];
        for (int i = 0; ; i++) {
            if (sc.hasNextInt()) {
                int buff = sc.nextInt();
                int arrayTemp[] = new int[i + 1];

                for (int j = 0; j < i; j++) {
                    arrayTemp[j] = array[j];
                }

                array = new int[i + 1];

                for (int k = 0; k < i + 1; k++) {
                    array[k] = arrayTemp[k];
                }
                array[array.length - 1] = buff;
            } else if(sc.hasNextFloat()){
                System.out.println("Ошибка, массив и число к удалению должны быть целыми!");
                System.exit(0);
            }else if (sc.hasNextLine() && sc.nextLine().equals("quit")) break;

        }

        System.out.print("Введите число к удалению: ");
        int del = 0;
        if (sc.hasNextInt()) del= sc.nextInt();
        else{
            System.out.println("Ошибка, массив и число к удалению должны быть целыми!");
            System.exit(0);
        }

        System.out.print("Исходный массив: ");
        for (int m : array) {
            System.out.print(m + " ");
        }
        System.out.println();

        System.out.print("Массив после обработки: ");
        for (int i=0; i<array.length; i++){
            if (array[i]== del) continue;
            else System.out.print(array[i]+" ");
        }

        sc.close();
    }
}