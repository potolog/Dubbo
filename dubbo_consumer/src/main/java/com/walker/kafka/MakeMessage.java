package com.walker.kafka;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.scheduling.annotation.Scheduled;

import com.walker.bean.Simple;

/**
 * 制造消息
 * 
 * @author Walker
 */
@Configuration
public class MakeMessage {

	private int i = 0;

	protected final Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;

	// @Scheduled(cron = "0/10 * * * * ?")
	public void soSth() {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-mm-dd");
		Simple simple = new Simple();
		i++;
		simple.setAge(i + 1);
		simple.setName(df.format(new Date()));
		kafkaTemplate.send("test", "key", simple.toString());
		logger.info("发送Success");
	}

}
