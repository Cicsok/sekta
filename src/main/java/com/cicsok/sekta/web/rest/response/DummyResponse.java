package com.cicsok.sekta.web.rest.response;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public final class DummyResponse {

    @ApiModelProperty(notes = "Actual date in YYYY-mm-dd format", example = "2022-06-09", required = true)
    private final String date;

    @ApiModelProperty(notes = "Actual time in HH-mm-ss format", example = "08:07:00", required = true)
    private final String time;
}
