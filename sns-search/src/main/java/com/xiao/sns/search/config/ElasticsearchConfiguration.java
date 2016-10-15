package com.xiao.sns.search.config;

import org.elasticsearch.client.Client;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;


@Configuration
@ConfigurationProperties(prefix = "xiaoyi.elasticsearch")
public class ElasticsearchConfiguration {

	private String host;
	private int port;
	private String clusterName;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getClusterName() {
        return clusterName;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    @Bean
	public Client client() throws UnknownHostException {
		Map<String, String> map = new HashMap<String, String>();
		Settings settings = Settings.builder().put("cluster.name",clusterName).put("client.transport.sniff", false)
				.put("client.transport.ping_timeout", 20, TimeUnit.SECONDS).build();
		TransportClient client = TransportClient.builder().settings(settings).build();
		client.addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName(host) , port)) ;
		return client;
	}	

	@Bean
	public ElasticsearchOperations elasticsearchTemplate() throws UnknownHostException {
		return new ElasticsearchTemplate(client());
	}
}