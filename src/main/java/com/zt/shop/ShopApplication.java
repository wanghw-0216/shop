package com.zt.shop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ShopApplication {
    /*private CorsConfiguration buildConfig() {
        CorsConfiguration corsConfiguration = new CorsConfiguration();
        corsConfiguration.addAllowedOrigin("*");
        corsConfiguration.addAllowedHeader("*");
        corsConfiguration.addAllowedMethod("*");
        corsConfiguration.setAllowCredentials(true);//这两句不加不能跨域上传文件，
        corsConfiguration.setMaxAge(3600l);//加上去就可以了
        return corsConfiguration;
    }
    *//**
     * 跨域过滤器
     * @return
     *//*
    @Bean
    public CorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", buildConfig()); // 4
        return new CorsFilter(source);
    }
*/
    public static void main(String[] args) {
        SpringApplication.run(ShopApplication.class, args);
    }

}
