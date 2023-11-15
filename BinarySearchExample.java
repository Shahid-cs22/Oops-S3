Import java.util.Scanner;



Public class BinarySearch {

    Public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);



        System.out.print(“Enter the size of the array: “);

        Int size = scanner.nextInt();

        Int[] array = new int[size];



        System.out.println(“Enter the sorted elements of the array:”);

        For (int i = 0; i < size; i++) {

            Array[i] = scanner.nextInt();

        }



        System.out.print(“Enter the element to search: “);

        Int target = scanner.nextInt();



        Int result = binarySearch(array, target);



        If (result == -1) {

            System.out.println(“Element not found in the array.”);

        } else {

            System.out.println(“Element found at index: “ + result);

        }



        Scanner.close();

    }



    Public static int binarySearch(int[] array, int target) {

        Int left = 0, right = array.length – 1;



        While (left <= right) {

            Int mid = left + (right – left) / 2;



            If (array[mid] == target) {

                Return mid;

            } else if (array[mid] < target) {

                Left = mid + 1;

            } else {

                Right = mid – 1;

            }

        }



        Return -1;

    }

}

