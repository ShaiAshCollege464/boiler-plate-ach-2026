package com.college;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Test profile configuration.
 * Change property spring.profiles.active to "test" for run application in this mode.
 */

@Configuration
@Profile("test")
public class TestConfig {



}
