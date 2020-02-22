package com.unis;

import com.unis.alg.VisualCounter;
import com.unis.chapter1.Ex_1_2_1;
import com.unis.chapter1.Ex_1_2_6;
import com.unis.chapter1.Parentheses;
import com.unis.chapter1.ParenthesesPolish;
import com.unis.in.In;
import com.unis.obj.Point2D;
import com.unis.utils.StdDraw;
import com.unis.utils.StdIn;
import com.unis.utils.StdOut;
import com.unis.utils.StdRandom;

import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        ParenthesesPolish.polish(new In());
    }


    public static String mystery(String s) {
        int N = s.length();
        if(N == 1) return s;
        String a = s.substring(0, N/2);
        String b = s.substring(N/2);
        return mystery(b) + mystery(a);
    }


    public static double ln(int N) {
        if(N == 1) return 0;
        return Math.log(N) + ln(N - 1);
    }

    public static int mystery(int a, int b) {
        if(b==0) return 0;
        if(b % 2 == 0) return mystery(a*2, b/2);
        return mystery(a*2, b/2) + a;
    }

    public static String exR1(int n) {
        if(n<=0) return "";
        return exR1(n-3) + n + exR1(n-2) + n;
    }

    public static int[] histogram(int[] a, int M) {
        int[] r = new int[M];
        for(int i=0; i<a.length; i++) {
            if(a[i] < r.length) {
                r[a[i]] += 1;
            }
        }
        return r;
    }

    public static int lg(int N) {
        int r = 0;
        while(N > 1) {
            N /= 2;
            r += 1;
        }
        return r;
    }
}

class Iter<T> implements Iterable<T>{

    private int N;
    private T[] data = (T[]) new Object[1];

    @Override
    public Iterator<T> iterator() {
        return new ArrayIterator();
    }

    public void add(T t) {
        if(N == data.length) {
            T[] temp = (T[]) new Object[N * 2];
            System.arraycopy(data, 0, temp, 0, N);
            data = temp;
        }
        data[N++] = t;
    }

    private class ArrayIterator implements Iterator<T>{
        private int i;
        @Override
        public boolean hasNext() {
            return i < N;
        }

        @Override
        public T next() {
            return data[i++];
        }
    }

}
