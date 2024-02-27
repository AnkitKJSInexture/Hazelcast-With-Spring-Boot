package com.hazelcast.demo.SpringBootHazelcastCache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SpringBootCachingUsingHazelcastCacheApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCachingUsingHazelcastCacheApplication.class, args);
	}

}
