package com.javaTcping.index;

import com.alibaba.fastjson.JSONObject;
import com.javaTcping.common.Ping;
import com.jfinal.core.Controller;

/**
 * 本 demo 仅表达最为粗浅的 jfinal 用法，更为有价值的实用的企业级用法
 * 详见 JFinal 俱乐部: http://jfinal.com/club
 * 
 * IndexController
 */
public class IndexController extends Controller {
    public void index() {
        JSONObject jsonObject = new JSONObject();
        String ip = getPara("ip");
        String port = getPara("port");
        try {
            String[] resp = Ping.tcping(ip, port).split(":");
            jsonObject.put("status", resp[0]);
            jsonObject.put("ms", resp[1]);
        } catch (Exception e) {
            // TODO: handle exception
        }
        renderJson(jsonObject);
    }

    public void hello() {
        renderText("world");
    }
}
