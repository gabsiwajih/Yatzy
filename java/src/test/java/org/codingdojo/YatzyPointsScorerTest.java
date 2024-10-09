package org.codingdojo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.codingdojo.scorer.YatzyPointsScorer;
import org.junit.jupiter.api.Test;

public class YatzyPointsScorerTest {
	@Test
	public void testCalculateScore() {
		YatzyPointsScorer yatzyPointsScorer = new YatzyPointsScorer();

		assertEquals(50, yatzyPointsScorer.calculateScore(List.of(6, 6, 6, 6, 6)));
		assertEquals(0, yatzyPointsScorer.calculateScore(List.of(6, 6, 6, 5, 6)));
		assertEquals(0, yatzyPointsScorer.calculateScore(List.of(1, 2, 3, 4, 5)));
	}
}
