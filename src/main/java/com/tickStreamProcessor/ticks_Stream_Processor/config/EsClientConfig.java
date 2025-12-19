package com.tickStreamProcessor.ticks_Stream_Processor.config;

import co.elastic.clients.elasticsearch.ElasticsearchClient;
import co.elastic.clients.transport.ElasticsearchTransport;
import co.elastic.clients.transport.rest_client.RestClientTransport;
import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EsClientConfig {

    @Value("${elasticsearch.host}")
    private String elasticSearchHost;

    public ElasticsearchClient esClient(){
        RestClient restClient=RestClient.builder(HttpHost.create(elasticSearchHost)).build();
        ElasticsearchTransport elasticsearchTransport=new RestClientTransport(restClient, new co.elastic.clients.json.jackson.JacksonJsonpMapper());
        return new ElasticsearchClient(elasticsearchTransport);
    }
}
