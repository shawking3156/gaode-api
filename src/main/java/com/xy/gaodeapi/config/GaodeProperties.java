package com.xy.gaodeapi.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * @author: xiaoyin
 * @description:
 */
@Data
@Configuration
public class GaodeProperties {

    @Value("${gaode.api.key}")
    private String key;


    @Value("${gaode.api.domain}")
    private String domain;
}
