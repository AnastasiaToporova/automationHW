package utils;

import enumeration.Pages;
import pages.BasePage;
import pages.DocumentationPage;

import java.util.HashMap;
import java.util.Map;

public class PageStorage {

    Map<Pages, BasePage> pages = new HashMap<>();

    public PageStorage() {
        pages.put(Pages.DOCUMENTATION, new DocumentationPage());


    }

    @SuppressWarnings("unchecked")
    public <T extends BasePage> T getPage(Class<T> clazz) {
        Pages page = Pages.byType(clazz);
        return clazz.cast(pages.get(page));
    }
}