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
import com.dto.Tablebook;
import com.dto.BookingStatus;

@RestController
@RequestMapping("book")
public class OrderPublisher {
	@Autowired
	private RabbitTemplate rabbitTemplate;
	
	@PostMapping("/booktable/{restname}")
	public String bookOrder(@RequestBody Tablebook order,@PathVariable("restname")String rest) {
		order.setBookID(UUID.randomUUID().toString());
		BookingStatus orderStatus=new BookingStatus(order,"RESERVING","Table Reserved successfully...." + rest);
		rabbitTemplate.convertAndSend(MessageConfig.EXCHANGE,MessageConfig.ROUTING_KEY,orderStatus);
		return "TABLE RESERVED....";
	}
}
