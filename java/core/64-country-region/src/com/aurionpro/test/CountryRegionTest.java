package com.aurionpro.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.aurionpro.model.Countries;
import com.aurionpro.model.Region;

public class CountryRegionTest {

	public static void main(String[] args) throws FileNotFoundException {

		List<Region> regions = new ArrayList<>();
		List<Countries> countries = new ArrayList<>();

		FileInputStream fis = new FileInputStream("./resource/regions.txt");
		Scanner sc = new Scanner(fis);
		while (sc.hasNextLine()) {
			String regionString = sc.nextLine().replace("\"", "").replace(" ", "");
//			System.out.println(regionString);
			String[] regionDetails = regionString.split(",");
			int id = Integer.valueOf(regionDetails[0]);
			String name = regionDetails[1];
			Region region = new Region(id, name);
			regions.add(region);
		}
		// regions.stream().forEach(region -> System.out.println(region));
		regions.forEach(System.out::println);

		FileInputStream fis2 = new FileInputStream("./resource/countries.txt");
		Scanner sc2 = new Scanner(fis2);
		while (sc2.hasNextLine()) {
			String countryString = sc2.nextLine().replace("\"", "").replace(" ", "");
			String[] countryDetails = countryString.split(",");
			String code = countryDetails[0];
			String name = countryDetails[1];
			int regionId = Integer.valueOf(countryDetails[2]);
			Countries country = new Countries(code, name, regionId);
			countries.add(country);
		}
		// System.out.println(countries);
		System.out.println("--------------------------------------------------------------");
		countries.forEach(System.out::println);

	}

}
