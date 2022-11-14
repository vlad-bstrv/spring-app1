package ru.vladbstrv.springcourse;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("ru.vladbstrv.springcourse")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
}
