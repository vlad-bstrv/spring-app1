package ru.vladbstrv.springcourse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class ClassicalMusic implements Music{
    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }

    @PostConstruct
    public void doMyInit() {
        System.out.println("init");
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("destroy");
    }
}
