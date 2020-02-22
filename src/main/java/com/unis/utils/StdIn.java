package com.unis.utils;

import java.io.BufferedInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * @author: lengyhua
 * @create at: 2020/2/5 15:19
 * @description:
 */
public class StdIn {

    /**
     * 空格
     */
    private static final Pattern WHITESPACE_PATTERN = Pattern.compile("\\p{javaWhitespace}+");
    /**
     * 空白
     */
    private static final Pattern EMPTY_PATTERN = Pattern.compile("");
    /**
     * 用来读取所有的输入
     */
    private static final Pattern EVERYTHING_PATTERN = Pattern.compile("\\A");

    private static Scanner scanner;

    static {
        scanner = new Scanner(new BufferedInputStream(System.in), "utf-8");
    }

    /**
     * 避免实例化
     */
    private StdIn() {
    }

    /**
     * 判断标准输入中是否有内容
     *
     * @return 标准输入中是否有内容
     */
    public static boolean isEmpty() {
        return !scanner.hasNext();
    }

    /**
     * 判断标准输入中是否有新行
     *
     * @return 标准输入中是否有新行
     */
    public static boolean hasNextLine() {
        return scanner.hasNextLine();
    }

    /**
     * 判断是否还有字符
     *
     * @return 是否还有字符
     */
    public static boolean hasNextChar() {
        scanner.useDelimiter(EMPTY_PATTERN);
        boolean result = scanner.hasNext();
        scanner.useDelimiter(WHITESPACE_PATTERN);
        return result;
    }

    /**
     * 读取一行，如果没有就返回 null
     *
     * @return 读取一行的内容
     */
    public static String readLine() {
        try {
            return scanner.nextLine();
        } catch (NoSuchElementException e) {
            return null;
        }
    }

    /**
     * 读取一个字符
     *
     * @return 读取字符
     */
    public static char readChar() {
        scanner.useDelimiter(EMPTY_PATTERN);
        String ch = scanner.next();
        if (ch.length() != 1) {
            throw new RuntimeException("Internal (Std)In.readChar() error");
        }
        scanner.useDelimiter(WHITESPACE_PATTERN);
        return ch.charAt(0);
    }

    /**
     * 读取所有的内容
     *
     * @return 输入中所有的内容
     */
    public static String readAll() {
        if (!scanner.hasNextLine()) {
            return "";
        }
        String result = scanner.useDelimiter(EVERYTHING_PATTERN).next();
        scanner.useDelimiter(WHITESPACE_PATTERN);
        return result;
    }

    /**
     * 读取一个字符串
     *
     * @return 下一个字符串
     */
    public static String readString() {
        return scanner.next();
    }

    /**
     * 读取一个整数
     *
     * @return 下一个整数
     */
    public static int readInt() {
        return scanner.nextInt();
    }

    /**
     * 读取一个实数
     *
     * @return 下一个实数
     */
    public static double readDouble() {
        return scanner.nextDouble();
    }

    /**
     * 读取一个float
     *
     * @return 下一个float数
     */
    public static float readFloat() {
        return scanner.nextFloat();
    }

    /**
     * 读取一个long
     *
     * @return 下一个长整形
     */
    public static long readLong() {
        return scanner.nextLong();
    }

    /**
     * 读取一个短整形
     *
     * @return 下一个短整形
     */
    public static short readShort() {
        return scanner.nextShort();
    }

    /**
     * 读取一个字节
     *
     * @return 下一个字节
     */
    public static byte readByte() {
        return scanner.nextByte();
    }

    /**
     * 读取一个布尔类型
     *
     * @return 下一个布尔类型值
     */
    public static boolean readBoolean() {
        return scanner.nextBoolean();
    }

    /**
     * 读取输入中所有的字符串作为数组返回
     *
     * @return 输入中字符串数组
     */
    public static String[] readAllStrings() {
        String[] tokens = WHITESPACE_PATTERN.split(readAll());
        if (tokens.length == 0 || tokens[0].length() > 0) {
            return tokens;
        }
        String[] decapitokens = new String[tokens.length - 1];
        System.arraycopy(tokens, 1, decapitokens, 0, decapitokens.length);
        return decapitokens;
    }

    /**
     * 读取所有行作为一个数组返回
     *
     * @return 输入中所有行的数组表示
     */
    public static String[] readAllLines() {
        List<String> lines = new ArrayList<>();
        while (hasNextLine()) {
            lines.add(readLine());
        }
        return lines.toArray(new String[0]);
    }

    /**
     * 读取所有的整数
     *
     * @return 输入中所有整数的数组
     */
    public static int[] readAllInts() {
        String[] fields = readAllStrings();
        int[] vals = new int[fields.length];
        for (int i = 0; i < fields.length; i++) {
            vals[i] = Integer.parseInt(fields[i]);
        }
        return vals;
    }

    /**
     * 读取所有的整数
     *
     * @return 输入中所有整数的数组
     */
    public static long[] readAllLongs() {
        String[] fields = readAllStrings();
        long[] vals = new long[fields.length];
        for (int i = 0; i < fields.length; i++)
            vals[i] = Long.parseLong(fields[i]);
        return vals;
    }

    /**
     * 读取所有的实数
     *
     * @return 输入中所有实数的数组
     */
    public static double[] readAllDoubles() {
        String[] fields = readAllStrings();
        double[] vals = new double[fields.length];
        for (int i = 0; i < fields.length; i++)
            vals[i] = Double.parseDouble(fields[i]);
        return vals;
    }

}
