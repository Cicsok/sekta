package com.cicsok.sekta.web.mvc.controller.pageload;

import com.cicsok.sekta.web.mvc.marker.MVCController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@MVCController
public class DummyHTMLPageLoaderController {

    private static final String HTML_PAGE_VIEW_NAME = "dummy";

    @GetMapping(path = "/dummy")
    public ModelAndView loadPage() {
        return new ModelAndView(HTML_PAGE_VIEW_NAME);
    }

}
