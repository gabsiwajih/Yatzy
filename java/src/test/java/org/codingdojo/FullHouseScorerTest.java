package org.codingdojo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.codingdojo.scorer.FullHouseScorer;
import org.junit.jupiter.api.Test;

public class FullHouseScorerTest {
	@Test
	public void testCalculateScore() {
		FullHouseScorer fullHouseScorer = new FullHouseScorer();
		assertEquals(18, fullHouseScorer.calculateScore(List.of(6, 6, 2, 2, 2)));
		assertEquals(0, fullHouseScorer.calculateScore(List.of(2, 3, 4, 5, 6)));
	}
}
