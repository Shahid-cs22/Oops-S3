Import java.util.Scanner;



Public class SelectionSort {

    Public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);



        System.out.print(“Enter the size of the array: “);

        Int size = scanner.nextInt();

        Int[] array = new int[size];



        System.out.println(“Enter the elements of the array:”);

        For (int i = 0; i < size; i++) {

            Array[i] = scanner.nextInt();

        }



        selectionSort(array);



        System.out.println(“Sorted array:”);

        For (int num : array) {

            System.out.print(num + “ “);

        }



        Scanner.close();

    }



    Public static void selectionSort(int[] array) {

        Int n = array.length;



        For (int i = 0; i < n – 1; i++) {

            Int minIndex = i;



            For (int j = i + 1; j < n; j++) {

                If (array[j] < array[minIndex]) {

                    minIndex = j;

                }

            }



            // Swap the found minimum element with the element at index i

            Int temp = array[minIndex];

            Array[minIndex] = array[i];

            Array[i] = temp;

        }

    }

}

