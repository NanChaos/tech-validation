package com.nanchaos.tech.jvm;

/**
 * VM Args：-Xss128k
 */
public class StackOOMDemo {
    private int stackLength = 1;

    public void stackLeak() {
        stackLength++;
        stackLeak();
    }

    public static void main(String[] args) throws Throwable {
        StackOOMDemo oom = new StackOOMDemo();
        try {
            oom.stackLeak();
        } catch (Throwable e) {
            System.out.println("stack length:" + oom.stackLength);
            throw e;
        }
    }

}
