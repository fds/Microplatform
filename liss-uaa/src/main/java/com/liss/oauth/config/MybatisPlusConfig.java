package com.liss.oauth.config;

import com.liss.db.config.DefaultMybatisPlusConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author liss
 * @date 2018/12/10
 */
@Configuration
@MapperScan({"com.liss.oauth.mapper*"})
public class MybatisPlusConfig extends DefaultMybatisPlusConfig {

}
