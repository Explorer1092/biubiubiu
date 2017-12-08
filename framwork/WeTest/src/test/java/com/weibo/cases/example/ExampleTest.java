package com.weibo.cases.example;

import com.weibo.global.HttpClientBase;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;


public class ExampleTest {

	@Test
	public void testExampleOne() {
		try {
			// 构造场景
			assertThat("abc", is("abc"));

		} catch (Exception e) {
			e.printStackTrace();
			fail("testExampleOne excepiton");
		} finally {
			//  清数据
		}
	}

	@Test
	public void testExampleTwo() {
		try {

			assertThat("abc", is("def"));

		} catch (Exception e) {
			e.printStackTrace();
			fail("testExampleTwo excepiton");
		} finally {

		}
	}

	@Test
	public void testhttp() throws Exception {
		try {
			HttpClientBase http = new HttpClientBase();
			String url = "internal.api-test.api.com:9091/api/v1/order/search?orderId=117395087600001&accountId=1&productName=暑期套餐&p=1"
			http.doGet(url);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {

		}


	}
}
