package org.codingdojo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.codingdojo.scorer.NumberScorer;
import org.junit.jupiter.api.Test;

public class NumberScorerTest {
	@Test
	public void testCalculateScoreForOnes() {
		NumberScorer onesScorer = new NumberScorer(1);
		assertEquals(2, onesScorer.calculateScore(List.of(1, 1, 3, 4, 5)));
		assertEquals(0, onesScorer.calculateScore(List.of(2, 3, 4, 5, 6)));
	}

	@Test
	public void testCalculateScoreForTwos() {
		NumberScorer twosScorer = new NumberScorer(2);
		assertEquals(4, twosScorer.calculateScore(List.of(2, 2, 3, 4, 5)));
		assertEquals(0, twosScorer.calculateScore(List.of(1, 3, 4, 5, 6)));
	}

	@Test
	public void testCalculateScoreForFives() {
		NumberScorer fivesScorer = new NumberScorer(5);
		assertEquals(10, fivesScorer.calculateScore(List.of(5, 5, 3, 4, 1)));
		assertEquals(0, fivesScorer.calculateScore(List.of(1, 3, 4, 6, 2)));
	}
}
