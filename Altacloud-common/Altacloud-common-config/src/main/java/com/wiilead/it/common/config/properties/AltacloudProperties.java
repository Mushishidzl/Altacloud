package com.wiilead.it.common.config.properties;

import com.wiilead.it.constant.GlobalConstant;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @ClassName: AltacloudProperties
 * @Description: 核心配置
 * @Author mushishi
 * @Date 2019/4/19-9:46
 */
@Data
@ConfigurationProperties(prefix = GlobalConstant.ROOT_PREFIX)
public class AltacloudProperties {
    private SwaggerProperties swagger = new SwaggerProperties();
}
