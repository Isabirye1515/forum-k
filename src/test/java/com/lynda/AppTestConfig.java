package com.lynda;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@ComponentScan(basePackages = {"com.lynda.owner", "com.lynda.contact", "com.lynda.owner.message"})
@Configuration
@EnableWebMvc
public class AppTestConfig  implements WebMvcConfigurer {
    
}
