package com.liss.log.config;

import com.liss.log.properties.TraceProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * 日志自动配置
 *
 * @author zlt
 * @date 2019/8/13
 */
@EnableConfigurationProperties(TraceProperties.class)
public class LogAutoConfigure {

}
