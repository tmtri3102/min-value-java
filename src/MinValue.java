import java.util.Scanner;

public class MinValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Enter size < 20
        int size;
        do {
            System.out.print("Enter a size: ");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Size does not exceed 20");
        } while (size > 20 || size < 1);

        // Enter elements' value
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter " + (i + 1) + " element: ");
            arr[i] = scanner.nextInt();
        }


        System.out.println("Min value = " + minValue(arr));

        // Find min value
//        int min = arr[0];
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i] < min)
//                min = arr[i];
//        }
//        System.out.println("Min value = " + min);
    }
    public static int minValue(int[] arr){
        int min = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (arr[i] < min)
                min = arr[i];
        }
        return min;
    }
}


