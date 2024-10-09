package org.codingdojo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.codingdojo.scorer.TwoPairsScorer;
import org.junit.jupiter.api.Test;

public class TwoPairsScorerTest {
	@Test
	public void testCalculateScore() {
		TwoPairsScorer twoPairsScorer = new TwoPairsScorer();

		assertEquals(0, twoPairsScorer.calculateScore(List.of(3, 3, 3, 5, 6)));
		assertEquals(0, twoPairsScorer.calculateScore(List.of(1, 2, 3, 4, 5)));
		assertEquals(16, twoPairsScorer.calculateScore(List.of(3, 3, 5, 5, 6)));
	}
}
