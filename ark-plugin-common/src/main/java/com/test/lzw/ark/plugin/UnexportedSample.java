package com.test.lzw.ark.plugin;

public class UnexportedSample {

    public static void hello() {
        System.out.println("Hello, I'm a sample class 'NOT' exported by ark-plugin.");
        System.out.println(String.format("I'm loaded by %s",
                UnexportedSample.class.getClassLoader()));
    }
}
