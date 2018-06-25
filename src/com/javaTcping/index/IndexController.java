package com.javaTcping.index;

import com.alibaba.fastjson.JSONObject;
import com.javaTcping.common.Ping;
import com.jfinal.core.Controller;

/**
 * 视图渲染控制器
 * 
 * @author DM
 * @E-mail amazingdmdd@gmail.com
 * @version 1.0.0 创建时间：2018年6月25日上午8:42:37
 */
public class IndexController extends Controller {
    public void index() {
        JSONObject jsonObject = new JSONObject();
        String callback = getPara("callback");
        try {
            String ip = getPara("ip");
            String port = getPara("port");
            String[] resp = Ping.tcping(ip, port).split(":");
            jsonObject.put("status", resp[0]);
            jsonObject.put("ms", resp[1]);
        } catch (Exception e) {
            jsonObject.put("msg", "error");
        }
        if (callback != null) {
            renderJson(callback + "(" + jsonObject + ")");
        } else {
            renderJson(jsonObject);
        }
    }

    public void hello() {
        renderText("world");
    }
}
