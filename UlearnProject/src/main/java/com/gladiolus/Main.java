package com.gladiolus;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtils;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.LinkedHashMap;

public class Main {
    public static void main(String[] args) throws SQLException, IOException {
        var schools = new Schools("C:\\Users\\Danil\\IdeaProjects\\UlearnProject\\src\\main\\java\\com\\gladiolus\\school.csv");
        var listSchools = schools.getListSchools();
        var dbHandler = DbHandler.getInstance();
        //listSchools.forEach(dbHandler::addProduct);
        var map = new LinkedHashMap<String, Integer>();
        var countriesFromTask1 = new String[]{"Fresno", "Contra Costa", "El Dorado", "Glenn", "Tehama", "Placer", "Nevada", "San Mateo", "Madera", "Los Angeles"};
        var countriesFromTask2 = new String[]{"Fresno", "Contra Costa", "El Dorado", "Glenn"};
        var dataset = new DefaultCategoryDataset();
        for (var country : countriesFromTask1){
            var findAverageNumberPeopleInTenCountries = SQLTask.findAverageNumberPeopleInTenCountries(country, dbHandler.connection);
            System.out.printf("%s: %s%n",country, findAverageNumberPeopleInTenCountries);
            dataset.setValue(findAverageNumberPeopleInTenCountries, "Среднее количество студентов", country);
        }
        JFreeChart chart = ChartFactory.createBarChart("Среднее количество студентов", "Страны", "Количество студентов", dataset);
        ChartUtils.saveChartAsPNG(new File("graphic.png"), chart, 1280, 720);

        System.out.println("\n");
        SQLTask.displayAverageAmountExpenses(countriesFromTask2, dbHandler.connection);
        SQLTask.displaySchoolWithMaxMath(dbHandler.connection);
    }
}
