package com.zf.esdemo.config;

import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;

import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * @author zhang fan
 * @date 2023/5/7 22:04
 */
@Configuration
public class EsConfig {
    @Bean("myClient")
    public RestHighLevelClient restHighLevelClient(){
        RestHighLevelClient client = new RestHighLevelClient(
                RestClient.builder(
                        new HttpHost("121.196.211.45",9200,"http")
                )
        );
        return client;
    }

}
