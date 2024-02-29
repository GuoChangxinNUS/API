package com.gcx.apiclientsdk;

import com.gcx.apiclientsdk.client.NameApiClient;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("gcx.api")
@ComponentScan
@Data
public class HeartApiClientAutoConfiguration {

    private String accessKey;
    private String secretKey;


    @Bean
    public NameApiClient gcxClient(){
        return new NameApiClient(accessKey,secretKey);
    }
}
