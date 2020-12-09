package com.example.fibonacci;

public class FibLib {

    public static long fibJR(long n) {
        return n <= 0 ? 0 : n == 1 ? 1 : fibJR(n-1) + fibJR(n-2);
//        if (n <= 0) {
//            return 0;
//        } else if (n == 1) {
//            return 1;
//        } else {
//            return fibJR(n-1) + fibJR((n-2));
//        }
    }
    public native static long fibNR(long n); // this indicates that it is a native function for fibJR

    public static long fibJI(long n) {
        long previous = -1;
        long result = 1;
        for (long i = 0; i < n; i++) {
            long sum = result + previous;
            previous = result;
            result = sum;
        }
        return result;
    }

    public native static long fibNI(long n); // indicates native function for fibJI

    // Loading the ndk library
    static {
        System.loadLibrary("com_example_fibonacci_FibLib");
    }

//    public static void main(String[] args) {
//        System.out.println(fibJR(4));
//    }
}
