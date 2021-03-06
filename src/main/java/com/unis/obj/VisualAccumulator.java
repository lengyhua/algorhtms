package com.unis.obj;

import com.unis.utils.StdDraw;

/**
 * @author: lengyhua
 * @create at: 2020/2/9 17:20
 * @description:
 */
public class VisualAccumulator {

    private double total;
    private int N;

    public VisualAccumulator(int trials, double max) {
        StdDraw.setXscale(0, trials);
        StdDraw.setYscale(0, max);
        StdDraw.setPenRadius(0.005);
    }

    public void addDataValue(double val) {
        N++;
        total += val;
        StdDraw.setPenColor(StdDraw.DARK_GRAY);
        StdDraw.point(N, val);
        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.point(N, total / N);
    }

    public double mean() {
        return total / N;
    }
    @Override
    public String toString() {
        return "N = " + N + ", mean = " + mean();
    }

}
