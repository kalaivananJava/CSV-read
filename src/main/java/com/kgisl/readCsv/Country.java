package com.kgisl.readCsv;

import com.opencsv.bean.CsvBindByPosition;

public class Country {
    
     @CsvBindByPosition(position = 0)
    private String startIp;

    @CsvBindByPosition(position = 1)
    private String endIp;

    @CsvBindByPosition(position = 2)
    private String countryCode;

    @CsvBindByPosition(position = 3)
    private String country;

    @Override
    public String toString() {
        return "Country [startIp=" + startIp + ", endIp=" + endIp + ", countryCode=" + countryCode + ", country="
                + country + "]";
    }

    
}
