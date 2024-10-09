package org.codingdojo.scorer;

import java.util.HashSet;
import java.util.List;

import org.codingdojo.CategoryScorer;
import org.codingdojo.utils.Roll;

public class StraightScorer implements CategoryScorer {
	private final int straightIncludes;

	public StraightScorer(int straightIncludes) {
		this.straightIncludes = straightIncludes;
	}

	boolean isStraight(List<Integer> dice, List<Integer> expectedStraight) {
		return new HashSet<>(dice).equals(new HashSet<>(expectedStraight));
	}

	@Override
	public int calculateScore(List<Integer> dice) {
		List<Integer> expectedStraight = (straightIncludes == 1) ? List.of(1, 2, 3, 4, 5) : List.of(2, 3, 4, 5, 6);
		if (isStraight(dice, expectedStraight)) {
			return Roll.sum(dice);
		}
		return 0;
	}
}
