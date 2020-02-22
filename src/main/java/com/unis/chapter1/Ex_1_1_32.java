package com.unis.chapter1;

import com.unis.utils.StdDraw;

/**
 * @author: lengyhua
 * @create at: 2020/2/9 10:55
 * @description:
 */
public class Ex_1_1_32 {

    /**
     * 把data 中的数据分为N段，从l~r画出落入每段数量的直方图
     * @param N 拆分的段
     * @param l 下限
     * @param r 上限
     * @param data 数据
     */
    public static void draw(int N, double l, double r, double[] data) {
        int[] result = new int[N];
        for(double d : data) {
            if(d < l || d > r) {
                continue;
            }
            int index = (int)(N * (d - l) / (r - l));
            if(index >= N) {
                index = N - 1;
            }
            result[index] += 1;
        }
        int max = result[0];
        for (int value : result) {
            if (value > max) {
                max = value;
            }
        }
        StdDraw.setYscale(0, max);
        for(int i=0; i<N; i++) {
            StdDraw.filledRectangle(0.1 * i + 0.05, 0, 0.05, result[i]);
        }
    }

}
