package com.fengwenyi.spring_boot_config_sample.config;

import com.fengwenyi.spring_boot_config_sample.support.YamlPropertySourceFactory;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.io.Serializable;
import java.util.List;

/**
 * @author Erwin Feng
 * @since 2020/8/13
 */
@Data
@Configuration
@ConfigurationProperties(prefix = "db")
//@PropertySource({"classpath:config/db.properties"})
@PropertySource(value = {"classpath:config/db.yml"}, factory = YamlPropertySourceFactory.class)
public class DBConfig implements Serializable {

    private static final long serialVersionUID = -6527591545525817929L;

    /** 服务器地址 */
    private String host;

    /** 端口 */
    private Integer port;

    /** 数据库名 */
    private String dbName;

    /** 用户名 */
    private String username;

    /** 密码 */
    private String password;

    private List<ConnPool> connPoolList;
}
