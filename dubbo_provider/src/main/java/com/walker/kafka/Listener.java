package com.walker.kafka;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;

import com.walker.bean.Simple;
import com.walker.dao.SimpleDao;

public class Listener {
    protected final Logger logger = LoggerFactory.getLogger(this.getClass());


    @Autowired
    private SimpleDao simpleDao;
    
    @KafkaListener(topics = "test",id="test")
	public void listen(ConsumerRecord<?, ?> record) {
		logger.info("kafka的key: " + record.key());
		logger.info("kafka的value: " + record.value().toString());
		String arr[]=record.value().toString().trim().split(",");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		Simple simple=new Simple();
		simple.setAge(Integer.parseInt(arr[2]));
		simple.setName(arr[1]);
		simpleDao.insertSimple(simple);
	}
}