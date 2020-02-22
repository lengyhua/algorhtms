package com.unis.utils;

import java.util.Random;

/**
 * @author: lengyanhua
 * @create at: 2020/2/5 12:12
 * @description:
 */
public class StdRandom {

    private static Random random;

    static {
        initialize(System.currentTimeMillis());
    }

    /**
     * 初始化
     *
     * @param seed 种子
     */
    public static void initialize(long seed) {
        random = new Random(seed);
    }

    /**
     * 返回 0 ~ 1 的随机数
     *
     * @return 0 ~ 1 的随机数
     */
    public static double random() {
        return random.nextDouble();
    }

    /**
     * 返回 0 ~ N-1 之间的随机数
     *
     * @param N 上限（不包含）
     * @return 0 ~ N-1之间的随机数
     */
    public static int uniform(int N) {
        return random.nextInt(N);
    }

    /**
     * 返回 lo ~ hi 之间的随机数
     *
     * @param lo 下限（包含）
     * @param hi 上限（不包含）
     * @return lo ~ hi 之间的随机数
     */
    public static int uniform(int lo, int hi) {
        return random.nextInt(hi - lo) + lo;
    }

    /**
     * 返回 lo ~ hi 之间的随机数
     *
     * @param lo 下限
     * @param hi 上限
     * @return lo ~ hi 之间的随机数
     */
    public static double uniform(double lo, double hi) {
        return random.nextDouble() * (hi - lo) + lo;
    }

    /**
     * 返回真的概率为p
     *
     * @param p 返回true的概率
     * @return 返回true 或 false
     */
    public static boolean bernoulli(double p) {
        return random.nextDouble() < p;
    }

    /**
     * 返回正态分布
     *
     * @return 返回正态分布  期望值 0  标准差 1
     */
    public static double gaussian() {
        return random.nextGaussian();
    }

    /**
     * 返回正态分布
     *
     * @param m 期望值
     * @param s 标准差
     * @return 正态分布
     */
    public static double gaussian(double m, double s) {
        return random.nextGaussian() * s + m;
    }

    /**
     * 返回i的概率为a[i]
     *
     * @param a 概率分布数组
     * @return
     */
    public static int discrete(double[] a) {
        double r = random();
        double sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
            if (sum >= r) {
                return i;
            }
        }
        return -1;
    }

    /**
     * 将数组随机排序
     *
     * @param a 待排序数组
     */
    public static void shuffle(double[] a) {
        for (int i = a.length - 1; i > 1; i--) {
            int index = random.nextInt(i);
            double temp = a[index];
            a[index] = a[i];
            a[i] = temp;
        }
    }

}
