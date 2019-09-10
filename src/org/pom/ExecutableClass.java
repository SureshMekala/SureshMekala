package org.pom;

public class ExecutableClass extends BaseClass {
	public static void main(String[] args) {
		launchBrowser();
		loadurl("https://www.facebook.com");
		PojoClass p=new PojoClass();
		type(p.getUsername(), "Sureshmekala");
		type(p.getPassword(), "sdjsjd");
		btnclick(p.getButton());
		closeBrowser();
	}

}
