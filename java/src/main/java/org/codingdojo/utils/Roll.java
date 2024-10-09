package org.codingdojo.utils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Roll {

	public static Map<Integer, Integer> frequencies(List<Integer> dice) {
		return dice.stream().collect(Collectors.toMap(die -> die, die -> 1, Integer::sum, () -> {
			Map<Integer, Integer> map = new HashMap<>();
			for (int i = 1; i <= 6; i++) {
				map.put(i, 0);
			}
			return map;
		}));
	}

	public static int sum(List<Integer> dice) {
		return dice.stream().mapToInt(Integer::intValue).sum();
	}

}