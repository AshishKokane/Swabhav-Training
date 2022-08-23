package com.aurionpro.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.stream.Collectors;

import com.aurionpro.model.Countries;
import com.aurionpro.model.Region;

public class RegionCountryTest {

	static ArrayList<Countries> europe = new ArrayList<>();
	static ArrayList<Countries> americas = new ArrayList<>();
	static ArrayList<Countries> asia = new ArrayList<>();
	static ArrayList<Countries> midddle = new ArrayList<>();

	public static void main(String[] args) {

		ArrayList<Region> region = new ArrayList<Region>();

		ArrayList<Countries> countries = new ArrayList<Countries>();

		region.add(new Region(1, "Europe"));
		region.add(new Region(2, "Americas"));
		region.add(new Region(3, "Asia"));
		region.add(new Region(4, "Middle East and Africa"));

		countries.add(new Countries("IT", "Italy", 1));
		countries.add(new Countries("JP", "Japan", 3));
		countries.add(new Countries("US", "United States of America", 2));
		countries.add(new Countries("CA", "Canada", 2));
		countries.add(new Countries("CN", "China", 3));
		countries.add(new Countries("IN", "India", 3));
		countries.add(new Countries("AU", "Australia", 3));
		countries.add(new Countries("ZW", "Zimbabwe", 4));
		countries.add(new Countries("SG", "Singapore", 3));
		countries.add(new Countries("UK", "United Kingdom", 1));
		countries.add(new Countries("FR", "France", 1));
		countries.add(new Countries("DE", "Germany", 1));

		countries.add(new Countries("ZM", "Zambia", 4));
		countries.add(new Countries("EG", "Egypt", 4));
		countries.add(new Countries("BR", "Brazil", 2));
		countries.add(new Countries("CH", "Switzerland", 1));
		countries.add(new Countries("NL", "Netherlands", 1));
		countries.add(new Countries("MX", "Mexico", 2));

		countries.add(new Countries("KW", "Kuwait", 4));
		countries.add(new Countries("IL", "Israel", 4));
		countries.add(new Countries("DK", "Denmark", 1));
		countries.add(new Countries("HK", "HongKong", 3));

		countries.add(new Countries("NG", "Nigeria", 4));
		countries.add(new Countries("AR", "Argentina", 2));
		countries.add(new Countries("BE", "Belgium", 1));

		// addToregions(countries);
//		displayCountries();
//		displaycount();
//
//		dispayCountryName(countries, region);

		Map<Integer, List<Countries>> cntryByRgn = new HashMap<>();
		cntryByRgn = countries.stream().collect(Collectors.groupingBy(Countries::getCountryRegion));

		Map<Integer, List<Region>> regionCountry = new HashMap<>();
		regionCountry = region.stream().collect(Collectors.groupingBy(Region::getRegionId));

		System.out.println();

		Map<List<Region>, List<Countries>> demo = new HashMap<>();

		int i = 0;
		for (Entry<Integer, List<Countries>> entry : cntryByRgn.entrySet()) {

			System.out.println("Region name: " + region.get(i).getRegionName() + " Countries :  " + entry.getValue());
			i++;
		}

		System.out.println();
		int j = 0;

		for (Entry<Integer, List<Countries>> entry : cntryByRgn.entrySet())

		{
			System.out.println(" Region Name: " + region.get(j).getRegionName() + " & Number of Countries :"
					+ entry.getValue().size());
			j++;
		}
		System.out.println();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter country code: ");
		String code = sc.next();

		List<Countries> cntry = countries.stream().filter(country -> code.equalsIgnoreCase(country.getCountryCode())).

				collect(Collectors.toList());
		System.out.println(cntry);

		int indexx = cntry.get(0).getCountryRegion();

//		System.out.println(cntry.get(0).getCountryName() + " " + regionCountry.get(cntry.get(0).getCountryRegion()));
//
//		System.out.println(cntry.get(0).getCountryName() + " " + region.get(indexx - 1).getRegionName() + "  "
//				+ region.get(indexx).getRegionId() + " Indexx : " + indexx);
//		
//		
//		
//
//		System.out.println(cntry + " " + regionCountry.get(cntry.get(0).getCountryRegion()));

		System.out.println(indexx);

		System.out.println(cntry.get(0).getCountryName() + " " + region.get(3));

		System.out.println();

		region.forEach(n -> System.out.println(n));

	}

//	private static void displaycount() {
//		System.out.println("--------------------------------------------------------------");
//		System.out.println("countries in region Europe is :" + europe.size());
//		System.out.println("countries in region  Americas  :" + americas.size());
//		System.out.println("countries in region  Asia is :" + asia.size());
//		System.out.println("countries in region Middle East and Africa  :" + midddle.size());
//		System.out.println("--------------------------------------------------------------");
//
//	}
//
//	private static void displayCountries() {
//		System.out.println("--------------------------------------------------------------");
//		System.out.println("Eurpe countries: \n ");
//
//		for (Countries e : europe)
//			System.out.println(e);
//
//		System.out.println();
//		System.out.println("Countries in Region America : \n");
//
//		for (Countries a : americas)
//			System.out.println(a);
//
//		System.out.println();
//		System.out.println("Countries in Asia  are : \n");
//
//		for (Countries a : asia)
//			System.out.println(a);
//
//		System.out.println();
//		System.out.println("Countries in Middle East and Africa  : \n");
//
//		for (Countries m : midddle)
//			System.out.println(m);
//
//		System.out.println();
//		System.out.println("--------------------------------------------------------------");
//
//	}
//
//	private static void dispayCountryName(ArrayList<Countries> countries, ArrayList<Region> region) {
//		System.out.println("--------------------------------------------------------------");
//
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter country code: ");
//		String code = sc.next();
//
//		for (Countries c : countries) {
//			if (code.equals(c.getCountryCode())) {
//				System.out.println("Country Code:  " + c.getCountryName() + " Country Code : " + c.getCountryCode());
//
//				int country_code = c.getCountryRegion();
//
//				switch (country_code) {
//				case 1:
//					System.out.println("Region : Europe ");
//					break;
//				case 2:
//					System.out.println("Region : America ");
//					break;
//				case 3:
//					System.out.println("Region : Asia ");
//					break;
//				case 4:
//					System.out.println(" Region : Middle East and Africa");
//					break;
//
//				default:
//					break;
//				}
//
//				break;
//
//			}
//
//		}
//
//		System.out.println("--------------------------------------------------------------");
//
//	}
//
//	private static void addToregions(ArrayList<Countries> countries) {
//		Map<Integer, List<Countries>> cntryByRgn = new HashMap<>();
//		cntryByRgn = countries.stream().collect(Collectors.groupingBy(Countries::getCountryRegion));
//
//		for (Entry<Integer, List<Countries>> entry : cntryByRgn.entrySet())
//			System.out.println(entry);
//
//		// System.out.println(cntryByRgn);
//	}

}
