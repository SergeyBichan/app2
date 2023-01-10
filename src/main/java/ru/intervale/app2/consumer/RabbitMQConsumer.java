package ru.intervale.app2.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;
import ru.intervale.app2.domain.Person;
import ru.intervale.app2.utils.Utility;

@Service
public class RabbitMQConsumer {
    private static final Logger LOGGER = LoggerFactory.getLogger(RabbitMQConsumer.class);

    @RabbitListener(queues = {"${rabbitmq.queue.nameIn}"})
    public void consume(byte[] person){
        Person person1 = Utility.deserialize(person);
        LOGGER.info(String.format("Received message -> %s", person1));
    }
}

