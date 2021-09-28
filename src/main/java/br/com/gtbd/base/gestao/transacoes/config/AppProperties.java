package br.com.gtbd.base.gestao.transacoes.config;

import lombok.*;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "com.base")
@Getter
@Setter
@ToString
public class AppProperties {

    private String dataBaseUrl;
    private String serviceKeyUrl;
}
