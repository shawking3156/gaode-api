package com.xy.gaodeapi.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.ReflectionUtils;
import org.springframework.web.servlet.mvc.method.RequestMappingInfoHandlerMapping;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.lang.reflect.Field;
import java.util.List;

@Configuration
@EnableSwagger2
//启用swagger增强UI
public class SwaggerConfig {

    @Bean
    public static BeanPostProcessor springFoxBeanProcessor() {
        return new BeanPostProcessor() {
            @Override
            public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
//                if (bean instanceof WebMvcRequestHandlerProvider || bean instanceof WebFluxRequestHandlerProvider) {
//                    getHanlderMappings(bean).removeIf(m -> m.getPatternParser() != null);
//                }
//                if (bean instanceof WebMvcRequestHandlerProvider ) {
//                    getHanlderMappings(bean).removeIf(m -> m.getPathMatcher() != null);
//                }

                return bean;
            }
        };
    }

    private static List<RequestMappingInfoHandlerMapping> getHanlderMappings(Object bean) {
        try {
            Field field = ReflectionUtils.findField(bean.getClass(), "handlerMappings");
            field.setAccessible(true);
            return (List<RequestMappingInfoHandlerMapping>) field.get(bean);
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    public ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                //标题
                .title("高德接口")
                //简介
                .description("高德接口文档")
                //作者、网址http:localhost:8088/doc.html(这里注意端口号要与项目一致，如果你的端口号后面还加了前缀，就需要把前缀加上)、邮箱
                .contact(new Contact("xy","http:localhost:8080/doc.html","1343480152@qq.com"))
                //版本
                .version("1.0")
                .build();
    }

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                //这里写的是API接口所在的包位置
                .apis(RequestHandlerSelectors.basePackage("com.xy.gaodeapi"))
                .paths(PathSelectors.any())
                .build();
    }
}
