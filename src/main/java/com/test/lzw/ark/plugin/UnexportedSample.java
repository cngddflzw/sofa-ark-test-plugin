package com.test.lzw.ark.plugin;


import com.test.lzw.ark.plugin.exported.ExportedSample;
import com.zim.test.thirdparty.TPService;

public class UnexportedSample {

    public static void hello() {
        System.out.println(String.format("UnexportedSample.TPService classLoader %s", TPService.class.getClassLoader()));
        TPService tpService = new TPService();
        System.out.println(String.format("UnexportedSample loaded by %s", ExportedSample.class.getClassLoader()));
        System.out.println(String.format("TPService.echo(): %s", tpService.echo()));
    }
}
