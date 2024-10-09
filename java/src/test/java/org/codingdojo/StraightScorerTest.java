package org.codingdojo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.codingdojo.scorer.StraightScorer;
import org.junit.jupiter.api.Test;

public class StraightScorerTest {
	@Test
	public void testSmallStraight() {
		StraightScorer smallStraightScorer = new StraightScorer(1);
		assertEquals(15, smallStraightScorer.calculateScore(List.of(1, 2, 3, 4, 5)));
		assertEquals(0, smallStraightScorer.calculateScore(List.of(1, 2, 2, 4, 5)));
		assertEquals(0, smallStraightScorer.calculateScore(List.of(1, 2, 4, 5, 6)));
	}

	@Test
	public void testLargeStraight() {
		StraightScorer largeStraightScorer = new StraightScorer(6);
		assertEquals(20, largeStraightScorer.calculateScore(List.of(2, 3, 4, 5, 6)));
		assertEquals(0, largeStraightScorer.calculateScore(List.of(1, 2, 3, 4, 5)));
		assertEquals(0, largeStraightScorer.calculateScore(List.of(1, 2, 4, 5, 6)));
	}
}
