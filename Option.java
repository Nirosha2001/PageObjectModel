package pom.irctc.pages;

import wrappers.GenericWrappers;

public class Option extends GenericWrappers {
	

	public CharterPage mouseHoverOnCharter() {
		clickByXpath(prop.getProperty("OptionPage.mouseHoverOnCharter.xpath"));
		return new CharterPage();
	}
	public BookNewWindow mouseHoverOnBookCoach() {
		clickByXpath(prop.getProperty("OptionPage.mouseHoverBookcoach.xpath"));
		return new BookNewWindow();
	}

}
