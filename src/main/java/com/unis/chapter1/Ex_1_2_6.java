package com.unis.chapter1;

/**
 * @author: lengyhua
 * @create at: 2020/2/10 16:09
 * @description:
 */
public class Ex_1_2_6 {
    /**
     * 判断s是否为t的回环变位
     * @param s 字符串
     * @param t 字符串
     * @return
     */
    public static boolean isCircularRotation(String s, String t) {
        if(s.length() != t.length()) return false;
        return (s + s).contains(t);
    }
}
