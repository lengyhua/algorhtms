package com.unis.alg;

import com.unis.utils.StdDraw;
import com.unis.utils.StdRandom;

import java.util.concurrent.TimeUnit;

/**
 * @author : lengyhua
 * @create at: 2020/2/10 17:36
 * @description:
 */
public class VisualCounter {

    private int count;
    private int N;
    private int max;

    public VisualCounter(int N, int max) {
        this.N = N;
        this.max = max;
    }

    public void draw() {
        StdDraw.setPenColor(StdDraw.GRAY);
        StdDraw.setXscale(0, N * 0.1);
        StdDraw.setYscale(0, max);
        for (int i=0; i<N; i++) {
            if(StdRandom.random() < 0.5){
                increment();
            } else {
                decrement();
            }
            StdDraw.filledRectangle(i * 0.1, 0, 0.05, count);
            try {
                TimeUnit.MICROSECONDS.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void increment() {
        count++;
        if(count > max) {
            count = max;
        }
    }

    public void decrement() {
        count--;
        if(count < 0) {
            count = 0;
        }
    }

}
