package com.cleo.Shopping_Cart.sequence;

import com.cleo.Shopping_Cart.sequence.config.SequenceGeneratorConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SequenceGeneratorConfig.class);
        SequenceGenerator generator = context.getBean(SequenceGenerator.class);
        AtomicInteger atomicInteger = new AtomicInteger();
        System.out.println(atomicInteger.getAcquire());
        System.out.println(generator.getSequence());
        System.out.println(generator.getSequence());

    }
}
