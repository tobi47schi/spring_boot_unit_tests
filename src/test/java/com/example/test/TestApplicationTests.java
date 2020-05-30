package com.example.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
@SpringBootTest
class TestApplicationTests {

	@Autowired
	AppService _service;

	@Test
	@DisplayName("true")
	void contextLoads() {
		Assertions.assertEquals("bla", "bla");
		Assertions.assertEquals("hi", _service.hi());
	}

	@Test
	@DisplayName("fail")
	void shouldFail() {
		Assertions.assertEquals("na", "bla");
	}

}
