package com.unis.chapter1;

import com.unis.obj.Point2D;
import com.unis.utils.StdDraw;
import com.unis.utils.StdIn;
import com.unis.utils.StdRandom;


/**
 * @author: lengyhua
 * @create at: 2020/2/9 17:53
 * @description:
 */
public class Ex_1_2_1 {
    /**
     * 从命令行读取一个整数，在单位正方形中生成N个体Point2D
     * @return 距离最小的两点的距离
     */
    public static double minDistance() {
        int N = StdIn.readInt();
        Point2D[] points = new Point2D[N];
        StdDraw.setPenRadius(0.01);
        for(int i=0; i<N; i++) {
            points[i] = new Point2D(StdRandom.random(), StdRandom.random());
            points[i].draw();
        }
        int x = 0, y = 1;
        double min = Double.MAX_VALUE;
        for(int i=0; i<N; i++) {
            for(int j=i+1; j<N; j++) {
                double v = points[i].distanceTo(points[j]);
                if(v < min) {
                    x = i;
                    y = j;
                    min = v;
                }
            }
        }
        StdDraw.line(points[x].x(), points[x].y(), points[y].x(), points[y].y());
        return min;
    }
}
