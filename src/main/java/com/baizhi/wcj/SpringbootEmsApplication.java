package com.baizhi.wcj;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;

@SpringBootApplication
@MapperScan("com.baizhi.wcj.dao")
public class SpringbootEmsApplication implements EmbeddedServletContainerCustomizer {

    public static void main(String[] args) {

        SpringApplication.run(SpringbootEmsApplication.class, args);
    }

    @Override
    public void customize(ConfigurableEmbeddedServletContainer configurableEmbeddedServletContainer) {
        configurableEmbeddedServletContainer.setPort(8989);
    }
}
