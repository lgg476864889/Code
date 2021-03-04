这是个创建springboot的starter包的demo

1.通过maven的install打包
2.在需要的项目中引用

        <dependency>
            <groupId>com.hello</groupId>
            <artifactId>hello-spring-boot-starter</artifactId>
            <version>0.0.1-SNAPSHOT</version>
        </dependency>
        
3.注入生成的bean及调用bean里面的方法
   
    @Resource(name = "demo")
    private DemoService demoService;

    @GetMapping("/say")
    public String sayWhat() {
        return demoService.say();
    }
4.starter里面用了properties所以引用项目也需要加配置
在application.properties里面加
demo.isopen=true
demo.say-what=hello
demo.to-who=shf

参考https://www.cnblogs.com/hello-shf/p/10864977.html
