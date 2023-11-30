package gr.atc.training;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		ArrayList<String> versions = new ArrayList<String>();
		versions.add("1.0.0");
		versions.add("5.0.0");
		versions.add("0.12.0");
		versions.add("2.4.1");
		versions.add("1.0.1");

		List<String> sortedVersions = Taxinomisi.sortVersions(versions);
		System.out.println("versions: " + versions);
		System.out.println("sorted versions: " + sortedVersions);

		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(5);
		numbers.add(7);
		numbers.add(8);

		List<Integer> sortedNumbers = Taxinomisi.sortNumbers(numbers);
		System.out.println("numbers: " + numbers);
		System.out.println("sorted numbers: " + sortedNumbers);

		/*
		 * String version1 = "5.9.0"; String version2 = "5.0.0"; int result =
		 * version1.compareTo(version2);
		 * 
		 * if (result == 0) { System.out.println(version1 + " is equal to " + version2);
		 * } else if (result<0) { System.out.println(version1 + " is less than " +
		 * version2 ); } else { System.out.println(version1 + " is more than " +
		 * version2 ); }
		 */
	}

}
