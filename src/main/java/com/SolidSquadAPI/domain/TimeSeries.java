package com.SolidSquadAPI.domain;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import java.util.LinkedHashMap;
import java.util.Map;

public class TimeSeries {
    private Map<String, TimeObject> timeObjects = new LinkedHashMap<>();

    public Map<String, TimeObject> getTimeObjects() {
        return timeObjects;
    }

    @JsonAnySetter
    public void setTimeObjects(String key, TimeObject value) {
        this.timeObjects.put(key, value);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Map.Entry<String, TimeObject> i : timeObjects.entrySet()){
            result.append("\t\t").append(i.getKey()).append(": ").append(i.getValue());
        }
        return result.toString();
    }
}
