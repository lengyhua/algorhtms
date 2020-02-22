package com.unis.chapter1;

import com.unis.in.In;
import com.unis.utils.StdOut;
import lombok.Data;

import java.util.LinkedList;

/**
 * @author lengyanhua
 * create at 2020/2/22 23:07
 * 1.3.9 补齐括号，对于 1 + 2 ) * 3 - 4 ) * 5 - 6 ) ) ) 补齐后的结果为： ( ( 1 + 2 ) * ( ( 3 - 4 ) * ( 5 - 6 ) ) )
 */
public class ParenthesesPolish {

    public static void polish(In in) {
        String[] strings = in.readAllStrings();
        LinkedList<String> result = new LinkedList<>();
        for(String s : strings) {
            if(")".equals(s)) {
                String third = result.poll();
                String second = result.poll();
                String first = result.poll();
                result.push("(" + first + second + third + ")");
            } else {
                result.push(s);
            }
        }
        StdOut.println(result.poll());
    }

}
