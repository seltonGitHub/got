
# springboot的配置文件值获取

## 条件描述

在src/main/resources/application.properties中配置如下

``` properties
group=Targaryen
creater=selton
message=hahaha
```
> group=你的组名;creater=你的代号;message=随便说两句

## 需求描述

启动程序

- 浏览器端输入
localhost:8080/seeGroupConfig并回车时
页面会显示group的值,也就是你的组名

- 输入
localhost:8080/seeCreaterConfig并回车时
页面会显示creater的值,也就是你的代号

- 输入
localhost:8080/seeMessageConfig并回车时
页面会显示message的值,也就是你的随便输入信息

> 提示: 不是在controller的return那儿直接写 return "Targaryen";或者return “selton”;

### 参考文档
https://blog.csdn.net/qq_27046951/article/details/82752534