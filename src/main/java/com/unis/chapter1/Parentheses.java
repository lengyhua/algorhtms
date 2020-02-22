package com.unis.chapter1;

import com.unis.in.In;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * @author lengyanhua
 * create at 2020/2/22 23:39
 * 1.3.4 从标准输入读取一个文本流并使用栈判断其中的括号是否配对完整
 */
public class Parentheses {

    /**
     * 用来存放匹配的键值对
     */
    private static final Map<Character, Character> characterMap = new HashMap<>();

    /**
     * 静态代码块中进行键值对初始化
     */
    static {
        characterMap.put('[', ']');
        characterMap.put('{', '}');
        characterMap.put('(', ')');
    }

    /**
     *
     * @param in 输入
     * @return 是否匹配
     */
    public static boolean check(In in) {
        LinkedList<Character> stack = new LinkedList<>();
        while(in.hasNextChar()) {
            char c = in.readChar();
            if(characterMap.containsKey(c)) {
                stack.push(c);
            } else if(characterMap.containsValue(c)) {
                if(stack.isEmpty()) {
                    return false;
                }
                Character key = stack.poll();
                if(characterMap.get(key) != c) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

}
