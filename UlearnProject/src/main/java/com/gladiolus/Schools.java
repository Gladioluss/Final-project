package com.gladiolus;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Schools {
    private final String path;
    private ArrayList<School> listSchools ;

    public Schools(String path) throws IOException {
        this.path = path;
        listSchools = CSVParser.ParsCsv(path);
    }

    public List<School> getListSchools() {
        return listSchools;
    }
}
