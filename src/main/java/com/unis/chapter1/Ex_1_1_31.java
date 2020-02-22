package com.unis.chapter1;

import com.unis.utils.StdDraw;
import com.unis.utils.StdRandom;

/**
 * @author: lengyhua
 * @create at: 2020/2/8 18:49
 * @description:
 */
public class Ex_1_1_31 {

    /**
     * 在一个圆上画N个圆点，并通过概率p连线
     * @param N 点的个数
     * @param p 连接任意两点的概率
     */
    public static void draw(int N, double p) {
        int radius = 2;
        StdDraw.setXscale(-radius, radius);
        StdDraw.setYscale(-radius, radius);
        StdDraw.circle(0, 0, radius);
        double angle = Math.PI * 2 / N;
        for(int i=0; i<N; i++) {
            StdDraw.filledCircle(radius * Math.cos(i * angle), radius * Math.sin(i * angle), 0.05);
        }
        StdDraw.setPenColor(StdDraw.GRAY);
        for(int i=0; i<N; i++) {
            for(int j=i+1; j<N; j++) {
                if(StdRandom.random() < p) {
                    StdDraw.line(radius * Math.cos(i * angle), radius * Math.sin(i * angle),
                            radius * Math.cos(j * angle), radius * Math.sin(j * angle));
                }
            }
        }
    }

}
