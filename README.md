# javaTcping #
咸鱼项目，大佬轻喷，感谢。

本项目使用Jfinal框架，可打包成可执行jar.

集成Jetty 无需使用Tomcat，如需要在tomcat上使用请删除jetty.jar。

### 使用方法(WebRoot文件夹必须和jar文件同目录) ###

java -jar javaTcping.jar 端口号

举个栗子：

访问API(*支持JSONP跨域请求。*):http://cn-gz.sakurateam.top:81/?ip=1.1.1.1&port=80


返回结果为JSON格式：
```
{
  "ms": "154",//延迟
  "status": "true"//状态
}
```
