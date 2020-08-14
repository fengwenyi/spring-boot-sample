package com.fengwenyi.spring_boot_config_sample.bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author Erwin Feng
 * @since 2020/8/12
 */
@Data
@Accessors(chain = true)
public class UserBean {

    private String name;

    private Integer age;

    private String sex;

    private String englishName;

    @JsonFormat(pattern = "yyyy/MM/dd")
    private Date birthday;

    private List<String> likes;

    private List<String> visitedCities;

    private Map<String, String> moreOther;

}
