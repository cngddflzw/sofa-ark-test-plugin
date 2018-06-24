package com.test.lzw.ark.plugin.exported;


import com.zim.test.thirdparty.TPService;

public class ExportedSample {

    // FIXME TPService 一定不能暴露到 biz 中, 否则会出现 LinkError
    // FIXME 如果要解决 LinkError 的问题, 则不能使用多版本, 只能统一版本
    public static void hello() {
        System.out.println(String.format("ExportedSample.TPService classLoader %s", TPService.class.getClassLoader()));
        TPService tpService = new TPService();
        System.out.println(String.format("ExportedSample loaded by %s", ExportedSample.class.getClassLoader()));
        System.out.println(String.format("TPService.echo(): %s", tpService.echo()));
    }
}
