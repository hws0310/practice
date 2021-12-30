package com.clone.sns.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({ContextDataSourceConfig.class, SqlMapperConfig.class})
@ComponentScan(basePackages = { "com.clone.sns.model.service.impl" })
public class RootContextConfig {

}
