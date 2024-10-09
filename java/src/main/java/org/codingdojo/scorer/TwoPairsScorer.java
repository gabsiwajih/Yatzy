package org.codingdojo.scorer;

import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import org.codingdojo.CategoryScorer;
import org.codingdojo.utils.Roll;

public class TwoPairsScorer implements CategoryScorer {

	@Override
	public int calculateScore(List<Integer> dice) {
		Map<Integer, Integer> frequencies = Roll.frequencies(dice);
		return score(frequencies);
	}

	private int score(Map<Integer, Integer> frequencies) {
		if (isTwoPairs(frequencies)) {
			return Stream.of(6, 5, 4, 3, 2, 1).mapToInt(i -> i).filter(i -> frequencies.get(i) >= 2).map(i -> i * 2)
					.sum();
		} else {
			return 0;
		}
	}

	private boolean isTwoPairs(Map<Integer, Integer> frequencies) {
		return frequencies.values().stream().filter(f -> f >= 2).toList().size() == 2;
	}
}
