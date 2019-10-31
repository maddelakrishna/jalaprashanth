package com.iiht.chatbox;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.iiht.chatbox")
public class ChatBoxApplication {

	public static void main(String[] args) {

    SpringApplication.run(ChatBoxApplication.class, args);

	}

}
