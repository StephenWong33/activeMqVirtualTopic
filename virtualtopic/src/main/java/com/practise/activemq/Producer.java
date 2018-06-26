package com.practise.activemq;

import javax.jms.Destination;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Service;

/**
 * Created by wangyashuai on 2018/6/26.
 */
@Service("producer")
public class Producer {
  @Autowired // 也可以注入JmsTemplate，JmsMessagingTemplate对JmsTemplate进行了封装
  private JmsMessagingTemplate jmsTemplate;
  // 发送消息，destination是发送到的队列，message是待发送的消息
  public void sendMessage(Destination destination, final String message){
    jmsTemplate.convertAndSend(destination, message);
  }
}
