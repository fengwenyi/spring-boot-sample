package com.fengwenyi.spring_boot_config_sample.support;

import org.springframework.boot.env.YamlPropertySourceLoader;
import org.springframework.core.env.PropertySource;
import org.springframework.core.io.support.EncodedResource;
import org.springframework.core.io.support.PropertySourceFactory;

import java.io.IOException;

/**
 * @author Erwin Feng
 * @since 2020/8/13
 */
public class YamlPropertySourceFactory implements PropertySourceFactory {
    @Override
    public PropertySource<?> createPropertySource(String name, EncodedResource resource) throws IOException {
        // 返回 yaml 属性资源
        return new YamlPropertySourceLoader()
                .load(resource.getResource().getFilename(), resource.getResource())
                .get(0);
    }
}
