package com.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.config.MessageConfig;
import com.dto.BookingStatus;

@Component
public class ConsumerApp {

		@RabbitListener(queues=MessageConfig.QUEUE)
		public void consumeMessage(BookingStatus orderStatus) {
			System.out.println("Message Taken from Queue "+ orderStatus);
		}
}
