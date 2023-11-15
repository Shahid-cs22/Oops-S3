Import java.util.Scanner;



Public class LinearSearch {

    Public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);



        System.out.print(“Enter the size of the array: “);

        Int size = scanner.nextInt();

        Int[] array = new int[size];



        System.out.println(“Enter the elements of the array:”);

        For (int i = 0; i < size; i++) {

            Array[i] = scanner.nextInt();

        }



        System.out.print(“Enter the element to search: “);

        Int target = scanner.nextInt();



        Int result = linearSearch(array, target);



        If (result == -1) {

            System.out.println(“Element not found in the array.”);

        } else {

            System.out.println(“Element found at index: “ + result);

        }



        Scanner.close();

    }



    Public static int linearSearch(int[] array, int target) {

        For (int i = 0; i < array.length; i++) {

            If (array[i] == target) {

                Return i;

            }

        }

        Return -1;

    }

}

