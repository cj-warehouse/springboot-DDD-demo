package com.zcj.ddd.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
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
//是否开启swagger，正式环境一般是需要关闭的（避免不必要的漏洞暴露！），可根据springboot的多环境配置进行设置
@ConditionalOnProperty(name = "swagger.enable", havingValue = "true")
public class Swagger2{
    /*Swagger2 版本*/
    private static final String SWAGGER_VERSION = "1.0.1";
    private static final String SWAGGER_SCAN_PACKAGE = "com.zcj.ddd.web";

    @Bean
    public Docket DefaultApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName(Swagger2Enum.ALL_GROUP_NAME)
                .apiInfo(apiInfo(Swagger2Enum.ALL_TITLE, Swagger2Enum.ALL_DESCRIPTION))
                .select()
                // 为当前包路径
                .apis(RequestHandlerSelectors.basePackage(SWAGGER_SCAN_PACKAGE))
                .paths(PathSelectors.any())
                .build();
    }

    @Bean
    public Docket UserApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName(Swagger2Enum.USER_GROUP_NAME)
                .apiInfo(apiInfo(Swagger2Enum.USER_TITLE, Swagger2Enum.USER_DESCRIPTION))
                .select()
                // 为当前包路径
                .apis(RequestHandlerSelectors.basePackage(SWAGGER_SCAN_PACKAGE))
                .paths(PathSelectors.regex(Swagger2Enum.USER_PATH))
                .build();
    }

    /**
     * @param title       标题
     * @param description 描述
     * @return
     */
    private ApiInfo apiInfo(String title, String description) {
        return new ApiInfoBuilder()
                // 页面标题
                .title(title)
                // 创建人信息
//                .contact(new Contact("MrZhang", "https://www.cnblogs.com/zs-notes/category/1258467.html", "1729497919@qq.com"))
                // 版本号
                .version(SWAGGER_VERSION)
                // 描述
                .description(description)
                .build();
    }

}