package com.cicsok.sekta.web.acceptancetest.ui.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.google.common.base.Preconditions.checkNotNull;
import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;

public abstract class Page {

    private static final long DEFAULT_WAIT_SECONDS = 5;

    private static Page currentPage;

    private final WebDriver driver;

    Page(final WebDriver driver) {
        currentPage = this;
        this.driver = driver;
        getWait().until(titleIs(getPageTitle()));
    }

    public static <T extends Page> T getPage(final Class<T> pageClass) {
        return pageClass.cast(checkNotNull(currentPage));
    }

    protected abstract String getPageTitle();

    private WebDriverWait getWait() {
        return new WebDriverWait(driver, DEFAULT_WAIT_SECONDS);
    }

}