package com.sonatype.nexus;

import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
public class OldCode {
    private int count;

    public void debt() {
        count = 100;
    }

    public void write(int amount) {
        count = amount;
    }

    public void conditionalWrite(int amount) {
        if (count > amount) {
            count -= amount;
        }
    }
}