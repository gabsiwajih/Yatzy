package org.codingdojo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.codingdojo.scorer.ChanceScorer;
import org.junit.jupiter.api.Test;

public class ChanceScorerTest {

	@Test
	public void testCalculateScore() {
		ChanceScorer chanceScorer = new ChanceScorer();

		assertEquals(15, chanceScorer.calculateScore(List.of(1, 2, 3, 4, 5)));
		assertEquals(21, chanceScorer.calculateScore(List.of(4, 5, 5, 6, 1)));
	}
}
