package com.alevat.apeman.rest;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.alevat.apeman.services.ApemanServiceApiSpringConfiguration;

@Configuration
@Import(ApemanServiceApiSpringConfiguration.class)
public class ApemanRestSpringConfiguration {
}
