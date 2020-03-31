package main;

import logics.City;
import logics.Country;
import logics.House;

public class Main {
    public static void main(String[] args) {
        Country country = new Country();
        City city = new City();
        House house = new House();

        System.out.println("Country tries to make Taxes lower:");
        country.makeTaxesLower();
        System.out.println();

        System.out.println("City tries to make Taxes lower:");
        city.makeTaxesLower();
        System.out.println();

        System.out.println("Families try to pay lower taxes:");
        house.makeTaxesLower();
        System.out.println();



    }
}
