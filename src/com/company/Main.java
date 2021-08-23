package com.company;

public class Main {

    public static void main(String[] args) {
        int a[] = {1, 4, 2, 9, 0, 8};
        System.out.println("Mảng trước khi sắp xếp");
        showArray(a);
        System.out.println();
        insertionSort(a);
        System.out.println("Mảng sau khi sắp xếp");
        showArray(a);
    }

    private static void showArray(int[] a) {
        for (int element : a) {
            System.out.print(element + " ");
        }
    }

    public static void bubbleSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length - 1; j > i; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }

    public static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int minPosition = i;
            for (int j = i + 1; j < arr.length; j++) { // để tìm vị trí nhỏ nhất
                if (arr[minPosition] > arr[j]) {
                    minPosition = j;
                }
            }
            if (minPosition != i) { // để đổi chỗ
                int temp = arr[i];
                arr[i] = arr[minPosition];
                arr[minPosition] = temp;
            }
        }
    }

    public static void insertionSort(int arr[]) {
        int temp, position;
        for (int i = 1; i < arr.length; i++) {
            temp = arr[i];
            position = i;
            while (position > 0 && temp < arr[position - 1]) {
                arr[position] = arr[position - 1];
                position--;
            }
            arr[position] = temp;
        }
    }
}
