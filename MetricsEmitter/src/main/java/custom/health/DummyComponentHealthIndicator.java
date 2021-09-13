package custom.health;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class DummyComponentHealthIndicator implements HealthIndicator {

	@Autowired
	private Environment env;
	
	public static final String DUMMY_SERVICE_KEY = "dummy.service.key";
	
	@Override
	public Health health() {
		if (isServiceHealthy()) {
			return Health.up().withDetail("Test Service", "Component is healthy...").build();
		}
		return Health.down().withDetail("Test Service", "component is not doing well.")
				.build();
	}

	private boolean isServiceHealthy() {
		//Do some health check here. 
		return env.getRequiredProperty(DUMMY_SERVICE_KEY, Boolean.class);
	}
	
}
