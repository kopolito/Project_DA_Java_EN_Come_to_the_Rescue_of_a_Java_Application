package com.hemebiotech.analytics;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Implementation of Symptom Counter
 * 
 * @see ISymptomReader
 *
 */
public class SymptomCounter implements ISymptomCounter {

	/**
	 * 
	 * Symptom counter
	 */
	public SymptomCounter() {

	}

	/**
	 * count symptoms occurrences in symptomList
	 * 
	 * If no data is available, return an empty Map
	 * 
	 * @return Map(String symptom, Integer count) : map of all Symptoms counts obtained from list
	 * 
	 * @see ISymptomCounter#countSymptoms
	 */
	@Override
	public Map<String, Integer> symptomCountFromList(List<String> symptomsList) {
		final Map<String, Integer> symptomsMap = new HashMap<String, Integer>();
		if (symptomsList == null || symptomsList.isEmpty()) {
			System.out.println("Empty or Null List provided toi SymptomCounter !");
			return symptomsMap;
		}
		for (String symptom : symptomsList) {
			if (symptomsMap.containsKey(symptom)) {
				symptomsMap.put(symptom, symptomsMap.get(symptom) + 1);
			} else {
				symptomsMap.put(symptom, 1);
			}
		}
		return symptomsMap;
	}

}
