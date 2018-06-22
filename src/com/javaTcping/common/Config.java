package com.javaTcping.common;

import com.javaTcping.index.IndexController;
import com.jfinal.config.Constants;
import com.jfinal.config.Handlers;
import com.jfinal.config.Interceptors;
import com.jfinal.config.JFinalConfig;
import com.jfinal.config.Plugins;
import com.jfinal.config.Routes;
import com.jfinal.core.JFinal;
import com.jfinal.kit.PathKit;
import com.jfinal.template.Engine;

/**
 * 核心驱动
 */
public class Config extends JFinalConfig {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Use: java -jar javaTcping.jar port");
            System.exit(-1);
        } else {
            PathKit.setWebRootPath("/WebRoot");
            JFinal.start("WebRoot", Integer.parseInt(args[0]), "/", 5);
        }
    }

    /**
     * 配置常量
     */
    public void configConstant(Constants me) {
        me.setDevMode(true);
    }

    /**
     * 配置路由
     */
    public void configRoute(Routes me) {
        me.add("/", IndexController.class);
    }

    public void configEngine(Engine me) {
    }

    /**
     * 配置插件
     */
    public void configPlugin(Plugins me) {
    }

    /**
     * 配置全局拦截器
     */
    public void configInterceptor(Interceptors me) {

    }

    /**
     * 配置处理器
     */
    public void configHandler(Handlers me) {

    }
}
