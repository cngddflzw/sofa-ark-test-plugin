package com.test.lzw.ark.plugin.common;

public class ExportedSample {

    public static void hello() {
        System.out.println("Hello, I'm a sample class exported by ark-plugin.");
        System.out.println(String.format("I'm loaded by %s",
                ExportedSample.class.getClassLoader()));
    }
}
