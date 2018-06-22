# javaTcping
javaTcping

RT

本项目使用Jfinal框架。

使用方法(WebRoot文件夹必须和jar文件同目录)

java -jar javaTcping.jar 端口号

举个栗子：

访问API:http://127.0.0.1/?ip=1.1.1.1&port=80

返回结果为JSON格式：
```
{
  "ms": "225",
  "status": "true"
}
```
ms:延迟

status:状态
