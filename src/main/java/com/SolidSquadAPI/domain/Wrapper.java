package com.SolidSquadAPI.domain;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Wrapper {
    @JsonProperty("Meta Data")
    private MetaData metaData;
    @JsonProperty("Time Series (5min)")
    private TimeSeries timeSeries;


    public MetaData getMetaData() {
        return metaData;
    }

    public void setMetaData(MetaData metaData) {
        this.metaData = metaData;
    }

    public TimeSeries getTimeSeries() {
        return timeSeries;
    }

    public void setTimeSeries(TimeSeries timeSeries) {
        this.timeSeries = timeSeries;
    }
    @Override
    public String toString() {
        return "\n{\n" +
                "\tMeta Data: {\n" + metaData + "\n\t}\n" +
                "\tTime Series (5min): {\n" + timeSeries +
                "\t}\n}";
    }
}
