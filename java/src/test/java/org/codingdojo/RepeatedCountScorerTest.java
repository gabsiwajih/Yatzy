package org.codingdojo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.codingdojo.scorer.RepeatedCountScorer;
import org.junit.jupiter.api.Test;

public class RepeatedCountScorerTest {
	@Test
	public void testPair() {
		RepeatedCountScorer pairScorer = new RepeatedCountScorer(2);
		assertEquals(12, pairScorer.calculateScore(List.of(6, 6, 2, 4, 5)));
		assertEquals(8, pairScorer.calculateScore(List.of(4, 4, 3, 2, 1)));
		assertEquals(0, pairScorer.calculateScore(List.of(1, 2, 3, 4, 5)));
	}

	@Test
	public void testThreeOfAKind() {
		RepeatedCountScorer threeOfAKindScorer = new RepeatedCountScorer(3);
		assertEquals(9, threeOfAKindScorer.calculateScore(List.of(3, 3, 3, 4, 5)));
		assertEquals(0, threeOfAKindScorer.calculateScore(List.of(1, 2, 3, 4, 5)));
	}

	@Test
	public void testFourOfAKind() {
		RepeatedCountScorer fourOfAKindScorer = new RepeatedCountScorer(4);
		assertEquals(12, fourOfAKindScorer.calculateScore(List.of(3, 3, 3, 3, 5)));
		assertEquals(0, fourOfAKindScorer.calculateScore(List.of(1, 2, 3, 4, 5)));
	}
}
