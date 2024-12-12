package group;

import org.testng.annotations.Test;

public class Group {
	@Test(groups = {"sanity"})

	public void lunchurl() {
		System.out.println("url");
	}
	@Test (groups = {"smoke"})
	public void signin() {
		System.out.println("signin");

	}

	@Test(groups = {"reg"})
	public void username() {
		System.out.println("enter username");

	}
	@Test (groups = {"reg"})
	public void password() {
		System.out.println("enter password");

	}
	@Test (groups = {"smoke"})
	public void login() {
		System.out.println("login to application");
	}
	}
