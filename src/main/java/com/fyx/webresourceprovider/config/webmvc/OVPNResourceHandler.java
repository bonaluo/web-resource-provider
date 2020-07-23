package com.fyx.webresourceprovider.config.webmvc;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Component
public class OVPNResourceHandler implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        if (!registry.hasMappingForPattern("/ovpn/**")) {
            registry.addResourceHandler("/ovpn/**").addResourceLocations("file:./", "file:ovpn/");
            WebMvcConfigurer.super.addResourceHandlers(registry);
        }
    }
}