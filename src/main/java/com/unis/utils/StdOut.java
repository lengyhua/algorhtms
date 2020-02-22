package com.unis.utils;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

/**
 * @author: lengyhua
 * @create at: 2020/2/5 14:25
 * @description:
 */
public class StdOut {

    private static PrintWriter out;

    static {
        out = new PrintWriter(new OutputStreamWriter(System.out, StandardCharsets.UTF_8), true);
    }

    /**
     * 不能实例化
     */
    private StdOut() {
    }

    /**
     * 刷新到标准输出
     */
    public static void print() {
        out.flush();
    }

    /**
     * 打印一个对象
     *
     * @param x 待打印对象
     */
    public static void print(Object x) {
        out.print(x);
        out.flush();
    }

    /**
     * 打印一个布尔类型
     *
     * @param x 待打印布尔类型
     */
    public static void print(boolean x) {
        out.print(x);
        out.flush();
    }

    /**
     * 打印一个字符
     *
     * @param x 待打印字符
     */
    public static void print(char x) {
        out.print(x);
        out.flush();
    }

    /**
     * 打印一个实数
     *
     * @param x 待打印实数
     */
    public static void print(double x) {
        out.print(x);
        out.flush();
    }

    /**
     * 打印一个float
     *
     * @param x 待打印float
     */
    public static void print(float x) {
        out.print(x);
        out.flush();
    }

    /**
     * 打印一个整型
     *
     * @param x 待打印整数
     */
    public static void print(int x) {
        out.print(x);
        out.flush();
    }

    /**
     * 打印一个长整形
     *
     * @param x 待打印长整形
     */
    public static void print(long x) {
        out.print(x);
        out.flush();
    }

    /**
     * 打印一个短整形
     *
     * @param x 待打印短整形
     */
    public static void print(short x) {
        out.print(x);
        out.flush();
    }

    /**
     * 打印一个字节
     *
     * @param x 待打印字节
     */
    public static void print(byte x) {
        out.print(x);
        out.flush();
    }

    /**
     * 打印s
     *
     * @param s 待打印字符串
     */
    public static void print(String s) {
        out.print(s);
        out.flush();
    }

    /**
     * 打印空行
     */
    public static void println() {
        out.println();
    }

    /**
     * 打印s并拼接换行
     *
     * @param s 待打印字符串
     */
    public static void println(String s) {
        out.println(s);
    }

    /**
     * 打印一个对象
     *
     * @param x 待打印对象
     */
    public static void println(Object x) {
        out.println(x);
    }

    /**
     * 打印布尔类型
     *
     * @param x 待打印布尔类型
     */
    public static void println(boolean x) {
        out.println(x);
    }

    /**
     * 打印一个字符
     *
     * @param x 待打印字符
     */
    public static void println(char x) {
        out.println(x);
    }

    /**
     * 打印一个实数
     *
     * @param x 待打印数字
     */
    public static void println(double x) {
        out.println(x);
    }

    /**
     * 打印一个float
     *
     * @param x 待打印数字
     */
    public static void println(float x) {
        out.println(x);
    }

    /**
     * 打印一个整数
     *
     * @param x 待打印整数
     */
    public static void println(int x) {
        out.println(x);
    }

    /**
     * 打印一个long
     *
     * @param x 待打印数字
     */
    public static void println(long x) {
        out.println(x);
    }

    /**
     * 打印一个short
     *
     * @param x 待打印short
     */
    public static void println(short x) {
        out.println(x);
    }

    /**
     * 打印一个字节
     *
     * @param x 待打印字节
     */
    public static void println(byte x) {
        out.println(x);
    }

    /**
     * 格式化输出
     *
     * @param f    格式化字符串
     * @param args 待输出参数
     */
    public static void printf(String f, Object... args) {
        out.printf(f, args);
    }
}
