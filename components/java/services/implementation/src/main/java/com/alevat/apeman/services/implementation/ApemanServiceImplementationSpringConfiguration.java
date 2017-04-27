package com.alevat.apeman.services.implementation;

import com.alevat.apeman.ApemanPersistenceSpringConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan
@Import(ApemanPersistenceSpringConfiguration.class)
public class ApemanServiceImplementationSpringConfiguration {
}
