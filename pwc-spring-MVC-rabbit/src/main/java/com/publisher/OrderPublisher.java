package com.publisher;

import java.util.UUID;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.config.MessageConfig;
import com.dto.Order;
import com.dto.OrderStatus;

@RestController
@RequestMapping("order")
public class OrderPublisher {
	@Autowired
	private RabbitTemplate rabbitTemplate;
	
	@PostMapping("/placeorder/{restname}")
	public String bookOrder(@RequestBody Order order,@PathVariable("restname")String rest) {
		order.setOrderId(UUID.randomUUID().toString());
		OrderStatus orderStatus=new OrderStatus(order,"PROCESS","Order placed successfully...." + rest);
		rabbitTemplate.convertAndSend(MessageConfig.EXCHANGE,MessageConfig.ROUTING_KEY,orderStatus);
		return "ORDER SUCCESS....";
	}
}
