package com.cicsok.sekta.web.mvc.controller.redirect;

import com.cicsok.sekta.web.mvc.marker.MVCController;
import org.springframework.web.bind.annotation.GetMapping;

@MVCController
public class RootPageRedirectController {

    private static final String DESTINATION_PAGE_URI = "dummy";

    @GetMapping(path = {"", "/"})
    public String redirect() {
        return "redirect:/" + DESTINATION_PAGE_URI;
    }
}
