package com.example.lab8;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;

    @Before
    public void createList() {
        list = new CustomList(null, new ArrayList<City>());


    }

    @Test
    public void addCityTest() {
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(listSize+1, list.getCount());
    }

    @Test
    public void hasCityTest() {
        City new_city = new City("Vancouver", "BC");
        boolean isTrue = list.hasCity(new_city);
        list.addCity(new_city);
        // asserting
        assertEquals(isTrue, true);
    }

    @Test
    public void deleteCityTest() {
        City new_city = new City("Toronto", "ON");
        list.addCity(new_city);
        list.deleteCity(new_city);
        boolean stillHas = list.hasCity(new_city);
        assertEquals(stillHas, false);
    }
}
