Import java.util.Scanner;
Public class InsertionSort {
    Public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

System.out.print(“Enter the size of the array: “);
Int size = scanner.nextInt();
Int[] array = new int[size];

System.out.println(“Enter the elements of the array:”);
        For (inti = 0; i< size; i++) {
            Array[i] = scanner.nextInt();
        }

insertionSort(array);

System.out.println(“Sorted array:”);
        For (intnum : array) {
System.out.print(num + “ “);
        }

Scanner.close();
    }

    Public static void insertionSort(int[] array) {
Int n = array.length;

        For (inti = 1; i< n; i++) {
Int key = array[i];
Int j = i – 1;

            // Move elements of array[0..i-1] that are greater than key to one position ahead of their current position
            While (j >= 0 && array[j] > key) {
                Array[j + 1] = array[j];
                J = j – 1;
            }
            Array[j + 1] = key;
        }
    }
}
