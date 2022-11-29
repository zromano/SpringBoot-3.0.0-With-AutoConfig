package com.app.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	@Qualifier("can-you-find-me")
	Object beanFromLib;

	@Test
	void contextLoads() {
		assertThat(beanFromLib).isNotNull();
	}

}
