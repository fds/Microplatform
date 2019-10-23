package com.liss.common.ribbon.config;

import com.liss.common.ribbon.rule.CustomIsolationRule;
import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;

/**
 * @author liss
 * @date 2019/9/3
 */
public class RuleConfigure {
    @Bean
    public IRule isolationRule() {
        return new CustomIsolationRule();
    }
}
