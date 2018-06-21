package com.test.lzw.ark.plugin.activate.activator;

import com.alipay.sofa.ark.exception.ArkException;
import com.alipay.sofa.ark.spi.model.PluginContext;
import com.alipay.sofa.ark.spi.service.PluginActivator;
import com.test.lzw.ark.plugin.activate.facade.SamplePluginService;
import com.test.lzw.ark.plugin.activate.impl.SamplePluginServiceImpl;

public class SamplePluginActivator implements PluginActivator {

    @Override
    public void start(PluginContext context) throws ArkException {
        System.out.println("starting in sample ark plugin activator");
        // publish 和 reference 似乎是用在插件间通信发布服务用的?
        context.publishService(SamplePluginService.class, new SamplePluginServiceImpl());
    }

    @Override
    public void stop(PluginContext context) throws ArkException {
        System.out.println("stopping in ark plugin activator");
    }
}
