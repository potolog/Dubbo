package com.walker.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * 
 * Swagger 访问方式 http:IP+端口+swagger-ui.html
 * 
 * Swagger 相关配置
 * 
 * 作者： Walker
 *
 * 时间：2017年8月24日
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

	/**
	 * 配置扫描包
	 * 
	 * @return
	 */
	@Bean
	public Docket createRestApi() {
		return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).select()
				.apis(RequestHandlerSelectors.basePackage("com.walker.controller")).paths(PathSelectors.any()).build();
	}

	/**
	 * 相关描述
	 * 
	 * @return
	 */
	@SuppressWarnings("deprecation")
	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("Alibaba Dubbo Api ").description("Dubbo Api ")
				.termsOfServiceUrl("http://walkerlv.stormcrm.com/").contact("Walker").version("1.0").build();
	}

}
