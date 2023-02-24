package com.example.scheduler.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.Date;

@SpringBootApplication
@EnableScheduling
//@Slf4j
public class SchedulerDemoApplication {

	private static Logger log = LoggerFactory.getLogger(SchedulerDemoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SchedulerDemoApplication.class, args);
	}

	@Scheduled(cron = "*/2 * * * * *") //fixedDelay = 2000L, fixedDelayString = "PT2S", initialDelay = 2000L
	public void job() throws InterruptedException {
		log.info("Job Current Time: " + new Date());
		Thread.sleep(1000L);
	}

	@Scheduled(cron = "*/2 * * * * *") //fixedDelay = 2000L, fixedDelayString = "PT2S", initialDelay = 2000L
	public void job2() throws InterruptedException {
		log.info("Job2 Current Time: " + new Date());
		Thread.sleep(1000L);
	}

}
