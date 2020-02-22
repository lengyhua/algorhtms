package com.unis.utils;

import java.util.Arrays;

/**
 * @author: lengyhua
 * @create at: 2020/2/5 13:06
 * @description:
 */
public class StdStats {

    /**
     * 求数组最大值
     *
     * @param a 待处理数组
     * @return 数组中的最大值
     */
    public static double max(double[] a) {
        double max = a[0];
        for (double v : a) {
            if (v > max) {
                max = v;
            }
        }
        return max;
    }

    /**
     * 求数组最小值
     *
     * @param a 待处理数组
     * @return 数组中的最小值
     */
    public static double min(double[] a) {
        double min = a[0];
        for (double v : a) {
            if (v < min) {
                min = v;
            }
        }
        return min;
    }

    /**
     * 求数组的平均值
     *
     * @param a 待处理数组
     * @return 数组的平均值
     */
    public static double mean(double[] a) {
        double sum = 0;
        for (double v : a) {
            sum += v;
        }
        return sum / a.length;
    }

    /**
     * 方差
     *
     * @param a 样本
     * @return 采样方差
     */
    public static double var(double[] a) {
        double mean = mean(a);
        double sum = 0;
        for (double v : a) {
            sum += (v - mean) * (v - mean);
        }
        return sum / a.length;
    }

    /**
     * 标准差
     *
     * @param a 样本
     * @return 标准差
     */
    public static double stddev(double[] a) {
        return Math.sqrt(var(a));
    }

    /**
     * 中位数
     *
     * @param a 样本
     * @return 中位数
     */
    public static double median(double[] a) {
        Arrays.sort(a);
        int len = a.length;
        if (len % 2 == 0) {
            return (a[len / 2] + a[len / 2 - 1]) / 2;
        } else {
            return a[len / 2];
        }
    }


}
