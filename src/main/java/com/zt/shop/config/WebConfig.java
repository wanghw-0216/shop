package com.zt.shop.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @ClassName WebConfig
 * @Description TODO
 * @Date 2021/8/13 16:42
 * @Version 1.0
 **/
@Configuration
public class WebConfig implements WebMvcConfigurer {


    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        // /image/**为前端URL访问路径 后面为本地磁盘映射
        // System.getProperty("user.dir")为当前项目所在路径
        registry.addResourceHandler("/img/**").addResourceLocations("file:" + System.getProperty("user.dir") + "/img/");
    }
}
