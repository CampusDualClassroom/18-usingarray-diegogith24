package com.campusdual.classroom;

import com.campusdual.Utils;

public class Exercise {

    public static void main(String[] args) {
            int size = Utils.integer("Introduce el tamaño del array: ");
            int[] array = createAndInitializeArray(size);
            showInlineArray(array);

        }

        public static int[] createAndInitializeArray(int size) {
            int[] array = new int[size];

            for (int i = 0; i < size; i++) {
                int num;
                do {
                    num = Utils.integer("Introduce un número natural para la posición " + i + ": ");
                } while (num < 0);

                array[i] = num;
            }

            return array;
        }

        public static void showInlineArray(int[] array) {
            System.out.print("Contenido del array: ");
            for (int num : array) {
                System.out.print(num + " ");
            }
            System.out.println();
        }



    }

