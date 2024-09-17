package com.example.simpleparadox.listycity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class lab8Participation {

    private CityList mockCityList() {
        CityList cityList = new CityList();
        cityList.add(mockCity());
        return cityList;
    }

    private City mockCity() {
        return new City("Edmonton", "Alberta");
    }

    @Test
    void testChange() {
        CityList citylist = mockCityList();
        assertEquals(0, mockCity().compareTo(citylist.getCities().get(0)));

        City city = new City("Charlottetown", "Prince Edward Island");
        citylist.add(city);

        assertEquals(0, city.compareTo(citylist.getCities().get(0)));
        assertEquals(0, mockCity().compareTo(citylist.getCities().get(1)));

        citylist.changeName(0, "asdf");

        City c = new City("asdf", "Prince Edward Island");

        assertEquals(0, c.compareTo(citylist.getCities().get(1)));
    }
}
