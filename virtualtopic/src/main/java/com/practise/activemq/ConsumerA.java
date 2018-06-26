package com.practise.activemq;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * Created by wangyashuai on 2018/6/26.
 */
@Component
public class ConsumerA {
  // 使用JmsListener配置消费者监听的队列，其中text是接收到的消息
  @JmsListener(destination = "Consumer.A.VirtualTopic.TEST")
  public void receiveA(String text) {
    System.out.println("ConsumerA收到的报文为:"+text);
  }

  // 使用JmsListener配置消费者监听的队列，其中text是接收到的消息
  @JmsListener(destination = "Consumer.A.VirtualTopic.TEST")
  public void receiveB(String text) {
    System.out.println("ConsumerB收到的报文为:"+text);
  }

  // 使用JmsListener配置消费者监听的队列，其中text是接收到的消息
  @JmsListener(destination = "Consumer.B.VirtualTopic.TEST")
  public void receiveC(String text) {

    System.out.println("ConsumerC收到的报文为:"+text);
  }

  // 使用JmsListener配置消费者监听的队列，其中text是接收到的消息
  @JmsListener(destination = "sVirtualTopic.TEST")
  public void receiveD(String text) {
    System.out.println("ConsumerD收到的报文为:"+text);
  }

}
