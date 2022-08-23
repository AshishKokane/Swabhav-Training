package com.aurionpro.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

import com.aurionpro.model.Countries2;
import com.aurionpro.model.Region2;

public class TokenTest {

	static ArrayList<Countries2> europe = new ArrayList<>();
	static ArrayList<Countries2> americas = new ArrayList<>();
	static ArrayList<Countries2> asia = new ArrayList<>();
	static ArrayList<Countries2> midddle = new ArrayList<>();

	public static void main(String args[]) throws Exception {

		ArrayList<Countries2> countries = new ArrayList<Countries2>();
		ArrayList<Region2> region = new ArrayList<Region2>();

		try {

			BufferedReader in = new BufferedReader(new FileReader("./resource/countries.txt"));
			String line;

			while ((line = in.readLine()) != null) {
				String[] val = line.split(",");
				String countryCode = val[0];
				String countryName = val[1];
				String countryRegion = val[2];
				countries.add(new Countries2(countryCode, countryName, countryRegion));
			}

			BufferedReader in2 = new BufferedReader(new FileReader("./resource/regions.txt"));
			String line1;

			while ((line1 = in2.readLine()) != null) {
				String[] val = line1.split(",");
				String RegionId = val[0];
				String regionname = val[1];

				region.add(new Region2(RegionId, regionname));
			}

			for (Region2 r : region) {
				System.out.println(r);
			}

			System.out.println();
			for (Countries2 c : countries) {
				System.out.println(c);
			}

		} catch (FileNotFoundException e) {
			System.out.println(e);

		}

		addToregions(countries);

		displayCountries();

	}

	private static void displayCountries() {
		System.out.println("--------------------------------------------------------------");
		System.out.println("Eurpe countries: \n ");

		for (Countries2 e : europe)
			System.out.println(e);

		System.out.println();
		System.out.println("Countries in Region America : \n");

		for (Countries2 a : americas)
			System.out.println(a);

		System.out.println();
		System.out.println("Countries in Asia  are : \n");

		for (Countries2 a : asia)
			System.out.println(a);

		System.out.println();
		System.out.println("Countries in Middle East and Africa  : \n");

		for (Countries2 m : midddle)
			System.out.println(m);

		System.out.println();
		System.out.println("--------------------------------------------------------------");

	}

	private static void addToregions(ArrayList<Countries2> countries) {
		for (Countries2 i : countries) {
			if (i.getCountryRegion().equals("1")) {
				europe.add(i);
			}
			if (i.getCountryRegion().equals("2")) {
				americas.add(i);
			}
			if (i.getCountryRegion().equals("3")) {
				asia.add(i);
			}
			if (i.getCountryRegion().equals("4")) {
				midddle.add(i);
			}
		}
	}

}
