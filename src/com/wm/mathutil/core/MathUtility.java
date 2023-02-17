/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.wm.mathutil.core;

/**
 *
 * @author hminh
 */
public class MathUtility {
    public static final double PI = 3.1415;
    public static long getFactorial(int n) {
        if (n<0 || n > 20) {
            String str = "invalid n, n must be between 0-20";
            throw new IllegalArgumentException(str);
        }
    if (n == 0 || n == 1) 
        return 1;
    long product = 1;
    for (int i = 2; i <= n ; i++) {
        product *= i;
    }
    return product;
}
}
