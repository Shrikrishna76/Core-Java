package com.nestedforloop;

public class Pattern10 {
	
//	public static void main(String[] args) {
//        int rows = 5;
//
//        for (int i = 1; i <= rows; i++) {
//            for (int j = i; j >= 1; j--) {
//                System.out.print(j);
//            }
//            System.out.println();
//        }
//    }
	
	public static void main(String[] args) {
        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if (j % 2 == 1) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

}
