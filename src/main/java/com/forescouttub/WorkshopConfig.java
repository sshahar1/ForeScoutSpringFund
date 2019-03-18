package com.forescouttub;

import com.forescouttub.service.WorkshopService;
import org.springframework.context.annotation.*;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@Configuration
@ComponentScan("com.forescouttub.service")
@PropertySource("workshop.properties")
@Import(ProfileConfig.class)
public class WorkshopConfig {

    @Bean
    public WorkshopService workshopServiceFoo() {
        return new WorkshopService("foo");
    }

    @Bean
    public WorkshopService workshopServicebar() {
        return new WorkshopService("bar");
    }
}
