package com.dreamerfable.demo.readinglist;

import org.springframework.boot.actuate.trace.http.InMemoryHttpTraceRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ActuatorConfig {

	@Bean
	public InMemoryHttpTraceRepository traceRepository() {
		InMemoryHttpTraceRepository traceRepo = new InMemoryHttpTraceRepository();
		traceRepo.setCapacity(1000);
		return traceRepo;
	}
}
