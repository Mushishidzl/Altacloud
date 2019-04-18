package com.wiilead.it.common.swagger;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import springfox.documentation.swagger2.configuration.Swagger2DocumentationConfiguration;

/**
 * @ClassName: SwaggerConfiguration
 * @Description: 配置
 * @Author mushishi
 * @Date 2019/4/18-17:14
 */
@Configuration
@ConditionalOnProperty(name = "Altacloud.swagger.enabled", matchIfMissing = true)
@Import({
        Swagger2DocumentationConfiguration.class
})
public class SwaggerConfiguration {
}
