package gr.atc.training;

import java.util.List;

public class Taxinomisi {

	public static List<String> sortVersions(List<String> versions) {
		// Protos tropos - custom bubble sort opos to paradeigma
		String temp = null;
		for (int i = 0; i < versions.size() - 1; i++) {
			for (int j = i + 1; j < versions.size(); j++) {
				String[] v1 = versions.get(i).split("\\.");
				String[] v2 = versions.get(j).split("\\.");

				for (int k = 0; k < v1.length; k++) {
					if (v1[k].compareTo(v2[k]) > 0) {
						temp = versions.get(j);
						versions.set(j, versions.get(i));
						versions.set(i, temp);
						break;
					} else if (v1[k].compareTo(v2[k]) < 0) {
						break;
					}
				}
			}
		}
		return versions;

	}
	/*
	 * Deuteros tropos - me tin List.sort() methodo numbers.sort(null); return
	 * numbers;
	 */

	public static List<Integer> sortNumbers(List<Integer> numbers) {
		int num = 0;
		System.out.println("\n");
		for (int i = 0; i < numbers.size() - 1; i++) {
			for (int j = 0; j < numbers.size(); j++) {
				int result = numbers.get(i).compareTo(numbers.get(j));
				if (result > 0) {
					num = numbers.get(j);
					numbers.set(j, numbers.get(i));
					numbers.set(i, num);
				}
			}
		}
		return numbers;
	}
}