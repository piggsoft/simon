package com.piggsoft.simon.configuration;

import com.github.pagehelper.PageHelper;
import org.apache.ibatis.plugin.Interceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by piggs on 2017/3/31.
 */
@Configuration
public class Config {

    /**
     * mybatis 分页插件配置
     * @return
     */
    @Bean
    public Interceptor[] mybatisInterceptors() {
        PageHelper pageHelper = new PageHelper();

        return new Interceptor[]{pageHelper};
    }



}
