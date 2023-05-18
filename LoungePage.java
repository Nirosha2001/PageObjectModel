package pom.irctc.pages;

import wrappers.GenericWrappers;

public class LoungePage extends GenericWrappers{
	
	public Option mouseHoverOnIcon() {
		clickByXpath(prop.getProperty("LoungePage.mouseHoverOnIcon.xpath"));
		return new Option();
	}
	

}
