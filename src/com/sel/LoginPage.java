package com.sel;

public class LoginPage extends BaseClass {

public static void main(String[] args) {
	getDriver("https://www.facebook.com/");
	title();
	curl();
	Pom p = new Pom();
	enterText("Kadhar", p.getUserName());
}
}
