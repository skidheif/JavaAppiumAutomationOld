package lib.ui.ios;

import io.appium.java_client.AppiumDriver;
import lib.ui.MyListsPageObject;

public class iOSMyListsPageObject extends MyListsPageObject {

    static {
        ARTICLE_BY_TITLE_TPL = "xpath://XCUIElementTypeLink[contains(@name='{TITLE}')]";

        THE_FIRST_ARTICLE_IN_LIST_PATH = "xpath://*[@resource-id = 'org.wikipedia:id/page_list_item_container']//*[@text = 'Swift']";
        TITLE_OF_THE_FIRST_ARTICLE_IN_LIST = "id:org.wikipedia:id/view_page_title_text";
        SECOND_TITLE_IN_THE_LIST = "xpath://*[@resource-id = 'org.wikipedia:id/page_list_item_title'][@text = 'Swift (programming language)']";
    }

    public iOSMyListsPageObject(AppiumDriver driver)
    {
        super(driver);
    }
}
