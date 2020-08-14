package com.fengwenyi.spring_boot_config_sample.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import java.util.*;

/**
 * @author Erwin Feng
 * @since 2020/8/11
 */
@Data
@Configuration
public class ReadConfigByValue {

    @Value("${erwin.name:defaultName}")
    private String name;

    @Value("${erwin.age}")
    private Integer age;

    @Value("${erwin.sex}")
    private String sex;

    @Value("${erwin.english-name}")
    private String englishName;

    @Value("${erwin.birthday}")
    private Date birthday;

    @Value("${erwin.like}")
    private List<String> likes;

    @Value("#{'${erwin.visitedCities}'.split(',')}")
    private List<String> visitedCities;

    @Value("#{${erwin.moreOther}}")
    private Map<String, String> moreOther;

    @Value("#{${erwin.moreOther}.myWeb}")
    private String myWeb;

    @Value("${java.home}")
    private String javaHome;

    @Value("#{systemProperties}")
    private Map<String, String> systemPropertiesMap;

}
