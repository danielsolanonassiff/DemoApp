package com.mercadolibre.onboarding_web_test.unit.beans;

import com.mercadolibre.onboarding_web_test.dtos.SampleDTO;
import com.mercadolibre.onboarding_web_test.beans.RandomSampleBean;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RandomSampleBeanTest {

	@Test
	public void randomPositiveTestOK() {
		RandomSampleBean randomSample = new RandomSampleBean();

		SampleDTO sample = randomSample.random();
		
		assertTrue(sample.getRandom() >= 0);
	}
}
