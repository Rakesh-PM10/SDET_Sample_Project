package com.crm.orgTest;

import org.testng.annotations.Test;

public class ContactTest {
	@Test
	public void createContactTest () {
		System.out.println("contact created");
		String url=System.getProperty("url");
		System.out.println(url);
		String browser=System.getProperty("browser");
		System.out.println(browser);
		String username=System.getProperty("username");
		System.out.println(username);
	}
	@Test
	public void editContactTest () {
		System.out.println("contact edited");
	}

}
