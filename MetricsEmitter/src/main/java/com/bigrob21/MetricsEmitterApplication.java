package com.bigrob21;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@ComponentScans({
	@ComponentScan(basePackages = "custom.health")
})
@SpringBootApplication
public class MetricsEmitterApplication {

	public static void main(String[] args) {
		SpringApplication.run(MetricsEmitterApplication.class, args);
	}

}
