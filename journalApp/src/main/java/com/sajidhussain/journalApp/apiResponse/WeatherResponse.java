package com.sajidhussain.journalApp.apiResponse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class WeatherResponse {

    private Current current;

    @Getter
    @Setter
    public class Current{
        private int temperature;

        @JsonProperty("Weather_Descriptions")
        private List<String> weatherDescription;

        private int feelsLike;
    }
}
