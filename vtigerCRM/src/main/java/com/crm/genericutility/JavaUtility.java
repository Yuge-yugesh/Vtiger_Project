package com.crm.genericutility;

import java.time.LocalDateTime;
import java.util.Random;

public class JavaUtility {
	/**
	 * This Method is used to generate system date and time
	 * @return string
	 */
	public String getSystemTime() {
		return LocalDateTime.now().toString().replace(":", "-");
	}
	/**
	 * This method is used to generate numbers within 1000
	 * @return int
	 */
	public int getRandomNumber() {
		Random ran=new Random();
		return ran.nextInt(1000);
	}
}
