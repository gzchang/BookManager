package com.chanderrr.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author Gzc
 * @version 1.0
 */
@Configuration
@EnableWebMvc
@ComponentScan("com.chanderrr.controller")
public class SpringMvcConfig {
}
