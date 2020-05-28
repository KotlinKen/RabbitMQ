package com.pure.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.pure.model.CoffeReceiver;
import com.pure.model.Tut1Receiver;
import com.pure.model.Tut1Sender;

//@Profile({"tut1", "hello-world"})
//@Configuration
public class TutConfig {

	@Bean
	public Queue hello() {
		System.out.println("testing23");
		return new Queue("hello");
	}
	
	@Profile("receiver")
	@Bean
	public Tut1Receiver receiver() {
		return new Tut1Receiver();
	}
	
	
	@Profile("sender")
    @Bean
    public Tut1Sender sender() {
        return new Tut1Sender();
    }
	
}

