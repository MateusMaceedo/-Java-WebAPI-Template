package br.com.mali.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket filianAPI(){
      return new Docket(DocumentationType.SWAGGER_2)
                  .select()
                  .apis(RequestHandlerSelectors.basePackage("br.com.mali"))
                  .paths(PathSelectors.any())
                  .build()
                  .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo(){
      return new ApiInfoBuilder()
                  .title("java-maven-11")
                  .description("Example os Microsservices Frameworks for Java 11 using maven build")
                  .license("Apache Licence Version 2.0")
                  .build();
    }
}
