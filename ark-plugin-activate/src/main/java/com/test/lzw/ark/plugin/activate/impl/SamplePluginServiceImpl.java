package com.test.lzw.ark.plugin.activate.impl;

import com.test.lzw.ark.plugin.activate.facade.SamplePluginService;

public class SamplePluginServiceImpl implements SamplePluginService {

    @Override
    public String service() {
        return "I'm a sample plugin service published by ark-plugin";
    }
}
