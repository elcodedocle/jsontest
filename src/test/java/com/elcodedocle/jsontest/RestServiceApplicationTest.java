package com.elcodedocle.jsontest;

import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class RestServiceApplicationTest {

	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	public void exampleTest() {
		String body = this.restTemplate.getForObject("/apps", String.class);
		assertThat(body).isEqualTo("[{\"id\":1,\"category\":\"category_0\",\"title\":\"title_0\",\"description\":\"description_0\",\"developer\":\"developer_0\",\"packageName\":\"packageName_0\",\"iconImageUrl\":\"http://example.com/iconImageUrl_0.png\",\"bgImageUrl\":\"http://example.com/bgImageUrl_0.png\"},{\"id\":2,\"category\":\"category_1\",\"title\":\"title_1\",\"description\":\"description_1\",\"developer\":\"developer_1\",\"packageName\":\"packageName_1\",\"iconImageUrl\":\"http://example.com/iconImageUrl_1.png\",\"bgImageUrl\":\"http://example.com/bgImageUrl_1.png\"}]");
	}

}