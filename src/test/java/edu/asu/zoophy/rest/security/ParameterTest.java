package edu.asu.zoophy.rest.security;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ParameterTest {

	@Test
	public void test() {
		assertEquals(Parameter.valueOf("ACCESSION"), Parameter.ACCESSION);
		assertEquals(Parameter.valueOf("EMAIL"), Parameter.EMAIL);
		assertEquals(Parameter.valueOf("JOB_ID"), Parameter.JOB_ID);
		assertEquals(Parameter.valueOf("JOB_NAME"), Parameter.JOB_NAME);
		assertEquals(Parameter.valueOf("LUCENE_QUERY"), Parameter.LUCENE_QUERY);
		assertEquals(5, Parameter.values().length);
	}

}
