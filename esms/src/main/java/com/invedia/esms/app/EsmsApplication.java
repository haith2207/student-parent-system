package com.invedia.esms.app;

import com.invedia.esms.constant.ApplicationConstant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.Arrays;

@SpringBootApplication(scanBasePackages = {ApplicationConstant.BASE_PACKAGES})
@EnableJpaRepositories(basePackages = {ApplicationConstant.BASE_PACKAGES})
@EntityScan(basePackages = {ApplicationConstant.BASE_PACKAGES})
@EnableTransactionManagement
public class EsmsApplication  extends SpringBootServletInitializer {
	private static final Logger LOGGER = LoggerFactory.getLogger(EsmsApplication.class);

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(EsmsApplication.class, args);
		LOGGER.info("Let's inspect the beans provided by Spring Boot:");

		String[] beanNames = ctx.getBeanDefinitionNames();
		Arrays.sort(beanNames);
		for (String beanName : beanNames) {
			LOGGER.info(beanName);
		}

		LOGGER.info("ESMS {} started successfully", ApplicationConstant.VERSION);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(EsmsApplication.class);
	}
}
