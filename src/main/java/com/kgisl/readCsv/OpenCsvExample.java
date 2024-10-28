
package com.kgisl.readCsv;

import com.opencsv.bean.CsvToBeanBuilder;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class OpenCsvExample {

    public static void main(String[] args) throws IOException {

        String fileName = "Country.csv";

        @SuppressWarnings({ "rawtypes", "unchecked" })
        List<Country> beans = new CsvToBeanBuilder(new FileReader(fileName))
                .withType(Country.class)
                .build()
                .parse();

        beans.forEach(System.out::println);

    }

}
