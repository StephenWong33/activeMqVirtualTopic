package com.practise.activemq;

import javax.jms.Destination;
import org.apache.activemq.command.ActiveMQTopic;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class VirtualtopicApplicationTests {

	@Autowired
	private Producer producer;

	@Test
	public void contextLoads() throws InterruptedException {
		Destination destination = new ActiveMQTopic("VirtualTopic.TEST");
		for(int i=0; i<100; i++){
			producer.sendMessage(destination, "myname is StephenWong!!!+   "+i);
		}
		System.out.println("ok");
	}

}
