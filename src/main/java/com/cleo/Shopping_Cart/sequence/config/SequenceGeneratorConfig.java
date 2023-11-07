package com.cleo.Shopping_Cart.sequence.config;

import com.cleo.Shopping_Cart.sequence.SequenceGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.cleo.Shopping_Cart.sequence")
public class SequenceGeneratorConfig {

    @Bean
    public SequenceGenerator sequenceGenerator(){
        SequenceGenerator seqGen = new SequenceGenerator();
        seqGen.setFirstName("Deven");
        seqGen.setInitial("Mr");
        seqGen.setLastName("Kalra");
        return seqGen;
    }

}
