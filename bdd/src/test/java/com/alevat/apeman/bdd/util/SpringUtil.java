package com.alevat.apeman.bdd.util;

import com.alevat.apeman.ApemanApplication;
import net.serenitybdd.core.Serenity;
import org.springframework.boot.env.YamlPropertySourceLoader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.PropertySource;
import org.springframework.core.io.Resource;

import java.io.IOException;

public class SpringUtil {

    private static final String SPRING_APPLICATION_CONTEXT_KEY = "spring.application-context";

    public static ApplicationContext getContext() {
        ApplicationContext context = Serenity.sessionVariableCalled(SPRING_APPLICATION_CONTEXT_KEY);
        if (context == null) {
            return initializeContext();
        } else {
            return context;
        }
    }

    private static ApplicationContext initializeContext() {
        try {
            AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
            context.register(ApemanApplication.class);
            addYamlProperties(context, "application.yml");
            addYamlProperties(context, "application-dev.yml");
            context.getEnvironment().setActiveProfiles("dev");
            context.refresh();
            return context;
        } catch (IOException e) {
            throw new IllegalStateException("Couldn't load ApplicationContext", e);
        }
    }

    private static void addYamlProperties(AnnotationConfigApplicationContext context, String filename) throws IOException {
        Resource resource = context.getResource("classpath:" + filename);
        YamlPropertySourceLoader loader = new YamlPropertySourceLoader();
        PropertySource<?> propertySource = loader.load(filename, resource, null);
        context.getEnvironment().getPropertySources().addFirst(propertySource);
    }

}
