package org.codingdojo.yatzy.facade2;

import java.util.List;

import org.codingdojo.CategoryScorer;
import org.codingdojo.utils.ScorerFactory;

public class YatzyCalculator {

	public int score(List<Integer> dice, String categoryName) {
		CategoryScorer scorer = ScorerFactory.createInstance(categoryName);
		return scorer.calculateScore(dice);
	}

}
