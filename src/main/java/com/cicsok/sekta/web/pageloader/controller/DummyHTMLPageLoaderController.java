package com.cicsok.sekta.web.pageloader.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DummyHTMLPageLoaderController {

    private static final String HTML_PAGE_VIEW_NAME = "home-page";

    @GetMapping(path = "/home-page")
    public ModelAndView loadPage() {
        return new ModelAndView(HTML_PAGE_VIEW_NAME);
    }

}
