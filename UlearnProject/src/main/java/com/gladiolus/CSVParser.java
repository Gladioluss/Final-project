package com.gladiolus;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CSVParser {
    static ArrayList<School> ParsCsv(String path) throws IOException {

        var schoolsList = new ArrayList<School>();
        List<String> fileLines = null;

        fileLines = Files.readAllLines(Paths.get(path));

        assert fileLines != null;
        var i =0;
        for (var fileLine : fileLines) {
            if(i == 0){
                i++;
                continue;
            }
            var columnList = new ArrayList<String>();
            Collections.addAll(columnList, fileLine.split(","));
            schoolsList.add(new School(columnList.get(2).replaceAll("\"", ""),
                    columnList.get(3).replaceAll("\"", ""),
                    Integer.parseInt(columnList.get(5)),
                    Double.parseDouble(columnList.get(10)),
                    Double.parseDouble(columnList.get(14))));
        }
        return schoolsList;
    }
}
