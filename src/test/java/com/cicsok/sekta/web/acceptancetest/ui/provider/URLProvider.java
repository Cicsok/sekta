package com.cicsok.sekta.web.acceptancetest.ui.provider;

import org.springframework.stereotype.Component;

@Component
public class URLProvider {

    private static final String PROTOCOL = "http";

    private static final String PROTOCOL_SEPARATOR = "://";

    private static final String HOST_NAME = "localhost";

    private static final String HOST_NAME_SEPARATOR = ":";

    private static final String PORT = "8082";

    private static final String APP_PREFIX = "/sekta/";

    private static final String RANDOM_NUMBER_GENERATOR_PATH = "/random-number-generator";

    public String getRandomNumberUrl() {
        return getBaseURL().append(RANDOM_NUMBER_GENERATOR_PATH).toString();
    }

    private StringBuilder getBaseURL () {
        return new StringBuilder().append(PROTOCOL)
                .append(PROTOCOL_SEPARATOR)
                .append(HOST_NAME)
                .append(HOST_NAME_SEPARATOR)
                .append(PORT)
                .append(APP_PREFIX);
    }
}
