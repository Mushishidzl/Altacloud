package com.wiilead.it.common.config.properties;

import lombok.Data;

/**
 * @ClassName: SwaggerProperties
 * @Description: Swagger配置
 * @Author mushishi
 * @Date 2019/4/19-9:44
 */
@Data
public class SwaggerProperties {

    private String title;

    private String description;

    private String version = "1.0";

    private String contactName = "Altacloud";

    private String contactUrl = "http://wiilead.com";

    private String contactEmail = "";
}
