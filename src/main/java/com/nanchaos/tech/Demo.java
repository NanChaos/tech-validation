package com.nanchaos.tech;

import java.util.ArrayList;
import java.util.List;

public class Demo {

    public List<Object> test(int a, int b) {
        List<Object> list = new ArrayList<Object>();
        for (int i = 0; i < a; i++) {
            if (i % 2 == 0) {
                list.add(new Object());
            } else {
                Object o = new Object();
                // 其他对哦
                if (i % b == 0) {
                    list.add(o);
                }
            }
        }
        return list;
    }
}
