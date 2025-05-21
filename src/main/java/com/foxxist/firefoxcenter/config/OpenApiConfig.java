package com.foxxist.firefoxcenter.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Firefox Athletic 狐火之茵足球俱乐部后端接口文档")
                        .version("1.0.0")
                        .termsOfService("宇宙最强")
                        .summary("接活了 晚点更新QAQ")
                        .description("提供C端小程序 后台端React等前端模块接口说明 接活了 晚点更新QAQ")
                        .contact(new Contact()
                                .name("Foxxist Team")
                                .url("https://foxxist.com")
                                .email("hulibuaixiao@gmail.com"))
                        .license(new License().name("MIT License").url("https://opensource.org/licenses/MIT")));
    }
}