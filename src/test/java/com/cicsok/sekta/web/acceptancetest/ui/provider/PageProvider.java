package com.cicsok.sekta.web.acceptancetest.ui.provider;

import com.cicsok.sekta.web.acceptancetest.ui.page.Page;
import lombok.AllArgsConstructor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

@AllArgsConstructor
public class PageProvider<T extends Page> {

    private final Class<T> pageClass;

    public void initPage(final WebDriver webDriver) {
        PageFactory.initElements(webDriver, pageClass);
    }

    public T getPage() {
        return Page.getPage(pageClass);
    }
}
