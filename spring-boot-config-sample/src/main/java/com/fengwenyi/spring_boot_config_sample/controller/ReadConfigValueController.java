package com.fengwenyi.spring_boot_config_sample.controller;

import com.fengwenyi.spring_boot_config_sample.bean.UserBean;
import com.fengwenyi.spring_boot_config_sample.config.DBConfig;
import com.fengwenyi.spring_boot_config_sample.config.ReadConfigByValue;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author Erwin Feng
 * @since 2020/8/11
 */
@RestController
@RequestMapping("/readValue")
public class ReadConfigValueController {

    @Autowired
    private ReadConfigByValue readConfigByValue;

    @Autowired
    private DBConfig dbConfig;

    @Autowired
    private Environment environment;

    @GetMapping("/byValue")
    public UserBean byValue() {

        String name = readConfigByValue.getName();
        Integer age = readConfigByValue.getAge();
        String sex = readConfigByValue.getSex();
        Date birthday = readConfigByValue.getBirthday();
        String englishName = readConfigByValue.getEnglishName();
        List<String> likes = readConfigByValue.getLikes();
        Map<String, String> moreOther = readConfigByValue.getMoreOther();
        List<String> visitedCities = readConfigByValue.getVisitedCities();

        String javaHome = readConfigByValue.getJavaHome();
        System.out.println("JAVA_HOME：" + javaHome);

        String myWeb = readConfigByValue.getMyWeb();
        System.out.println("myWeb: " + myWeb);

        Map<String, String> systemPropertiesMap = readConfigByValue.getSystemPropertiesMap();
        systemPropertiesMap.forEach((k, v) -> {
            System.out.println(k + " => " + v);
        });

        /*
sun.cpu.isalist => amd64
sun.desktop => windows
sun.io.unicode.encoding => UnicodeLittle
sun.cpu.endian => little
java.vendor.url.bug => http://bugreport.sun.com/bugreport/
file.separator => \
spring.application.admin.enabled => true
catalina.base => C:\Users\xfsy_\AppData\Local\Temp\tomcat.5305152806033613459.8080
java.awt.headless => true
java.vendor => Oracle Corporation
sun.boot.class.path => D:\Java\Java8\jdk1.8.0_251\jre\lib\resources.jar;D:\Java\Java8\jdk1.8.0_251\jre\lib\rt.jar;D:\Java\Java8\jdk1.8.0_251\jre\lib\sunrsasign.jar;D:\Java\Java8\jdk1.8.0_251\jre\lib\jsse.jar;D:\Java\Java8\jdk1.8.0_251\jre\lib\jce.jar;D:\Java\Java8\jdk1.8.0_251\jre\lib\charsets.jar;D:\Java\Java8\jdk1.8.0_251\jre\lib\jfr.jar;D:\Java\Java8\jdk1.8.0_251\jre\classes
java.ext.dirs => D:\Java\Java8\jdk1.8.0_251\jre\lib\ext;C:\Windows\Sun\Java\lib\ext
java.version => 1.8.0_251
java.vm.info => mixed mode
awt.toolkit => sun.awt.windows.WToolkit
user.language => zh
java.specification.vendor => Oracle Corporation
sun.java.command => com.fengwenyi.spring_boot_config_sample.ConfigSampleApplication
java.home => D:\Java\Java8\jdk1.8.0_251\jre
sun.arch.data.model => 64
java.vm.specification.version => 1.8
com.sun.management.jmxremote =>
java.class.path => D:\Java\Java8\jdk1.8.0_251\jre\lib\charsets.jar;D:\Java\Java8\jdk1.8.0_251\jre\lib\deploy.jar;D:\Java\Java8\jdk1.8.0_251\jre\lib\ext\access-bridge-64.jar;D:\Java\Java8\jdk1.8.0_251\jre\lib\ext\cldrdata.jar;D:\Java\Java8\jdk1.8.0_251\jre\lib\ext\dnsns.jar;D:\Java\Java8\jdk1.8.0_251\jre\lib\ext\jaccess.jar;D:\Java\Java8\jdk1.8.0_251\jre\lib\ext\jfxrt.jar;D:\Java\Java8\jdk1.8.0_251\jre\lib\ext\localedata.jar;D:\Java\Java8\jdk1.8.0_251\jre\lib\ext\nashorn.jar;D:\Java\Java8\jdk1.8.0_251\jre\lib\ext\sunec.jar;D:\Java\Java8\jdk1.8.0_251\jre\lib\ext\sunjce_provider.jar;D:\Java\Java8\jdk1.8.0_251\jre\lib\ext\sunmscapi.jar;D:\Java\Java8\jdk1.8.0_251\jre\lib\ext\sunpkcs11.jar;D:\Java\Java8\jdk1.8.0_251\jre\lib\ext\zipfs.jar;D:\Java\Java8\jdk1.8.0_251\jre\lib\javaws.jar;D:\Java\Java8\jdk1.8.0_251\jre\lib\jce.jar;D:\Java\Java8\jdk1.8.0_251\jre\lib\jfr.jar;D:\Java\Java8\jdk1.8.0_251\jre\lib\jfxswt.jar;D:\Java\Java8\jdk1.8.0_251\jre\lib\jsse.jar;D:\Java\Java8\jdk1.8.0_251\jre\lib\management-agent.jar;D:\Java\Java8\jdk1.8.0_251\jre\lib\plugin.jar;D:\Java\Java8\jdk1.8.0_251\jre\lib\resources.jar;D:\Java\Java8\jdk1.8.0_251\jre\lib\rt.jar;E:\IdeaProjects\spring-boot-sample\spring-boot-config-sample\target\classes;D:\maven\repo\org\springframework\boot\spring-boot-configuration-processor\2.3.2.RELEASE\spring-boot-configuration-processor-2.3.2.RELEASE.jar;D:\maven\repo\org\springframework\boot\spring-boot-starter-web\2.3.2.RELEASE\spring-boot-starter-web-2.3.2.RELEASE.jar;D:\maven\repo\org\springframework\boot\spring-boot-starter\2.3.2.RELEASE\spring-boot-starter-2.3.2.RELEASE.jar;D:\maven\repo\org\springframework\boot\spring-boot\2.3.2.RELEASE\spring-boot-2.3.2.RELEASE.jar;D:\maven\repo\org\springframework\boot\spring-boot-autoconfigure\2.3.2.RELEASE\spring-boot-autoconfigure-2.3.2.RELEASE.jar;D:\maven\repo\org\springframework\boot\spring-boot-starter-logging\2.3.2.RELEASE\spring-boot-starter-logging-2.3.2.RELEASE.jar;D:\maven\repo\ch\qos\logback\logback-classic\1.2.3\logback-classic-1.2.3.jar;D:\maven\repo\ch\qos\logback\logback-core\1.2.3\logback-core-1.2.3.jar;D:\maven\repo\org\apache\logging\log4j\log4j-to-slf4j\2.13.3\log4j-to-slf4j-2.13.3.jar;D:\maven\repo\org\apache\logging\log4j\log4j-api\2.13.3\log4j-api-2.13.3.jar;D:\maven\repo\org\slf4j\jul-to-slf4j\1.7.30\jul-to-slf4j-1.7.30.jar;D:\maven\repo\jakarta\annotation\jakarta.annotation-api\1.3.5\jakarta.annotation-api-1.3.5.jar;D:\maven\repo\org\yaml\snakeyaml\1.26\snakeyaml-1.26.jar;D:\maven\repo\org\springframework\boot\spring-boot-starter-json\2.3.2.RELEASE\spring-boot-starter-json-2.3.2.RELEASE.jar;D:\maven\repo\com\fasterxml\jackson\core\jackson-databind\2.11.1\jackson-databind-2.11.1.jar;D:\maven\repo\com\fasterxml\jackson\core\jackson-annotations\2.11.1\jackson-annotations-2.11.1.jar;D:\maven\repo\com\fasterxml\jackson\core\jackson-core\2.11.1\jackson-core-2.11.1.jar;D:\maven\repo\com\fasterxml\jackson\datatype\jackson-datatype-jdk8\2.11.1\jackson-datatype-jdk8-2.11.1.jar;D:\maven\repo\com\fasterxml\jackson\datatype\jackson-datatype-jsr310\2.11.1\jackson-datatype-jsr310-2.11.1.jar;D:\maven\repo\com\fasterxml\jackson\module\jackson-module-parameter-names\2.11.1\jackson-module-parameter-names-2.11.1.jar;D:\maven\repo\org\springframework\boot\spring-boot-starter-tomcat\2.3.2.RELEASE\spring-boot-starter-tomcat-2.3.2.RELEASE.jar;D:\maven\repo\org\apache\tomcat\embed\tomcat-embed-core\9.0.37\tomcat-embed-core-9.0.37.jar;D:\maven\repo\org\glassfish\jakarta.el\3.0.3\jakarta.el-3.0.3.jar;D:\maven\repo\org\apache\tomcat\embed\tomcat-embed-websocket\9.0.37\tomcat-embed-websocket-9.0.37.jar;D:\maven\repo\org\springframework\spring-web\5.2.8.RELEASE\spring-web-5.2.8.RELEASE.jar;D:\maven\repo\org\springframework\spring-beans\5.2.8.RELEASE\spring-beans-5.2.8.RELEASE.jar;D:\maven\repo\org\springframework\spring-webmvc\5.2.8.RELEASE\spring-webmvc-5.2.8.RELEASE.jar;D:\maven\repo\org\springframework\spring-aop\5.2.8.RELEASE\spring-aop-5.2.8.RELEASE.jar;D:\maven\repo\org\springframework\spring-context\5.2.8.RELEASE\spring-context-5.2.8.RELEASE.jar;D:\maven\repo\org\springframework\spring-expression\5.2.8.RELEASE\spring-expression-5.2.8.RELEASE.jar;D:\maven\repo\org\projectlombok\lombok\1.18.12\lombok-1.18.12.jar;D:\maven\repo\org\slf4j\slf4j-api\1.7.30\slf4j-api-1.7.30.jar;D:\maven\repo\org\springframework\spring-core\5.2.8.RELEASE\spring-core-5.2.8.RELEASE.jar;D:\maven\repo\org\springframework\spring-jcl\5.2.8.RELEASE\spring-jcl-5.2.8.RELEASE.jar;D:\JetBrains\IntelliJ IDEA 2020.1.1\lib\idea_rt.jar
user.name => xfsy_
catalina.home => C:\Users\xfsy_\AppData\Local\Temp\tomcat.5305152806033613459.8080
file.encoding => UTF-8
java.specification.version => 1.8
java.awt.printerjob => sun.awt.windows.WPrinterJob
catalina.useNaming => false
user.timezone => Asia/Shanghai
user.home => C:\Users\xfsy_
os.version => 10.0
spring.liveBeansView.mbeanDomain =>
sun.management.compiler => HotSpot 64-Bit Tiered Compilers
spring.jmx.enabled => true
java.specification.name => Java Platform API Specification
java.class.version => 52.0
spring.beaninfo.ignore => true
java.library.path => D:\Java\Java8\jdk1.8.0_251\bin;C:\Windows\Sun\Java\bin;C:\Windows\system32;C:\Windows;C:\Program Files (x86)\Common Files\Oracle\Java\javapath;C:\Windows\system32;C:\Windows;C:\Windows\System32\Wbem;C:\Windows\System32\WindowsPowerShell\v1.0\;C:\Windows\System32\OpenSSH\;C:\Program Files (x86)\Intel\Intel(R) Management Engine Components\DAL;C:\Program Files\Intel\Intel(R) Management Engine Components\DAL;C:\Program Files (x86)\NVIDIA Corporation\PhysX\Common;C:\Program Files\NVIDIA Corporation\NVIDIA NvDLISR;E:\GoProjects\bin;D:\cmder;D:\maven\apache-maven-3.6.3\bin;C:\Program Files\Git\cmd;D:\Java\Java8\jdk1.8.0_251\bin;;D:\nodejs\;D:\go\bin;C:\Program Files\Docker\Docker\resources\bin;C:\ProgramData\DockerDesktop\version-bin;C:\Users\xfsy_\AppData\Local\Microsoft\WindowsApps;C:\Users\xfsy_\AppData\Roaming\npm;D:\Microsoft VS Code\bin;C:\Users\xfsy_\go\bin;.
sun.jnu.encoding => GBK
os.name => Windows 10
user.variant =>
java.vm.specification.vendor => Oracle Corporation
java.io.tmpdir => C:\Users\xfsy_\AppData\Local\Temp\
line.separator =>

java.endorsed.dirs => D:\Java\Java8\jdk1.8.0_251\jre\lib\endorsed
os.arch => amd64
java.awt.graphicsenv => sun.awt.Win32GraphicsEnvironment
java.runtime.version => 1.8.0_251-b08
PID => 4328
java.vm.specification.name => Java Virtual Machine Specification
user.dir => E:\IdeaProjects\spring-boot-sample
user.country => CN
user.script =>
sun.java.launcher => SUN_STANDARD
sun.os.patch.level =>
java.vm.name => Java HotSpot(TM) 64-Bit Server VM
file.encoding.pkg => sun.io
java.rmi.server.randomIDs => true
path.separator => ;
java.vm.vendor => Oracle Corporation
java.vendor.url => http://java.oracle.com/
sun.boot.library.path => D:\Java\Java8\jdk1.8.0_251\jre\bin
java.vm.version => 25.251-b08
java.runtime.name => Java(TM) SE Runtime Environment
spring.output.ansi.enabled => always
         */

        Environment env = environment;
        System.out.println(env);
        // StandardServletEnvironment {activeProfiles=[], defaultProfiles=[default], propertySources=[MapPropertySource {name='server.ports'}, ConfigurationPropertySourcesPropertySource {name='configurationProperties'}, StubPropertySource {name='servletConfigInitParams'}, ServletContextPropertySource {name='servletContextInitParams'}, PropertiesPropertySource {name='systemProperties'}, OriginAwareSystemEnvironmentPropertySource {name='systemEnvironment'}, RandomValuePropertySource {name='random'}, OriginTrackedMapPropertySource {name='applicationConfig: [classpath:/application.properties]'}, OriginTrackedMapPropertySource {name='applicationConfig: [classpath:/application.yml]'}, OriginTrackedMapPropertySource {name='db.yml'}]}

        return new UserBean()
                .setName(name)
                .setAge(age)
                .setSex(sex)
                .setBirthday(birthday)
                .setEnglishName(englishName)
                .setLikes(likes)
                .setMoreOther(moreOther)
                .setVisitedCities(visitedCities);
    }

    @GetMapping("/dbConfig")
    public String dbConfig() {
        DBConfig db = new DBConfig();
        BeanUtils.copyProperties(dbConfig, db);
        return db.toString();
    }

    @GetMapping("/test")
    public String test() {
        String s = test2("p---v-v-v--", "");
        System.out.println(s);
        return "测试";
    }

    @Value("${erwin.name}")
    public String test2(String s, @Value("${erwin.age}") String v) {
        System.out.println(s + v);
        return s;
    }

    // 单元测试-读取配置文件的值
    @Value("${erwin.like}")
    public void testReadLike(String like, @Value("${erwin.sex}") String sex) {
        System.out.println("1===>" + like);
        System.out.println("1===>" + sex);
    }

    // 单元测试-读取配置文件的值
    @Value("${erwin.like}")
    public void testReadLike2(String like, @Value("${erwin.sex}") String sex) {
        System.out.println("2===>" + like);

        System.out.println("2===>" + sex);
    }
}
