package com.unis.alg;

/**
 * @author: lengyhua
 * @create at: 2020/2/6 12:40
 * @description:
 */
public class BinarySearch {

    /**
     * 二分查找
     * @param key 要检索的值
     * @param a 排好序的数组
     * @return 索引
     */
    public static int rank(int key, int[] a) {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            // Key is in a[lo..hi] or not present.
            int mid = lo + (hi - lo) / 2;
            if      (key < a[mid]) hi = mid - 1;
            else if (key > a[mid]) lo = mid + 1;
            else return mid;
        }
        return -1;
    }

    /**
     * 返回对应值出现的次数
     * @param key 要检索的值
     * @param a 数组
     * @return 值出现的次数
     */
    public static int count(int key, int[] a) {
        int index= rank(key, a);
        if(index < 0) {
            return 0;
        }
        int count = 0;
        int temp = index;
        while(temp >= 0 && a[temp--] == key) {
            count++;
        }
        temp = index + 1;
        while(temp < a.length && a[temp++] == key) {
            count++;
        }
        return count;
    }

}
