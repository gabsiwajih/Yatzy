package org.codingdojo.yatzy.facade1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.codingdojo.CategoryScorer;
import org.codingdojo.YatzyCategory;
import org.codingdojo.utils.ScorerFactory;

public class YatzyFacade1 {

	public static int chance(int d1, int d2, int d3, int d4, int d5) {
		CategoryScorer scorer = ScorerFactory.createInstance(YatzyCategory.CHANCE.toString());
		List<Integer> dice = Arrays.asList(d1, d2, d3, d4, d5);
		return scorer.calculateScore(dice);
	}

	public static int yatzy(int... dice) {
		CategoryScorer scorer = ScorerFactory.createInstance(YatzyCategory.YATZY.toString());
		List<Integer> diceList = Arrays.stream(dice).boxed().collect(Collectors.toList());
		return scorer.calculateScore(diceList);
	}

	public static int ones(int d1, int d2, int d3, int d4, int d5) {
		CategoryScorer scorer = ScorerFactory.createInstance(YatzyCategory.ONES.toString());
		List<Integer> dice = Arrays.asList(d1, d2, d3, d4, d5);
		return scorer.calculateScore(dice);
	}

	public static int twos(int d1, int d2, int d3, int d4, int d5) {
		CategoryScorer scorer = ScorerFactory.createInstance(YatzyCategory.TWOS.toString());
		List<Integer> dice = Arrays.asList(d1, d2, d3, d4, d5);
		return scorer.calculateScore(dice);
	}

	public static int threes(int d1, int d2, int d3, int d4, int d5) {
		CategoryScorer scorer = ScorerFactory.createInstance(YatzyCategory.THREES.toString());
		List<Integer> dice = Arrays.asList(d1, d2, d3, d4, d5);
		return scorer.calculateScore(dice);
	}

	private List<Integer> dice;

	public YatzyFacade1() {
	}

	public YatzyFacade1(int d1, int d2, int d3, int d4, int d5) {
		this();
		dice = new ArrayList<>(Arrays.asList(d1, d2, d3, d4, d5));
	}

	public int fours() {
		CategoryScorer scorer = ScorerFactory.createInstance(YatzyCategory.FOURS.toString());
		return scorer.calculateScore(dice);
	}

	public int fives() {
		CategoryScorer scorer = ScorerFactory.createInstance(YatzyCategory.FIVES.toString());
		return scorer.calculateScore(dice);
	}

	public int sixes() {
		CategoryScorer scorer = ScorerFactory.createInstance(YatzyCategory.SIXES.toString());
		return scorer.calculateScore(dice);
	}

	public int score_pair(int d1, int d2, int d3, int d4, int d5) {
		CategoryScorer scorer = ScorerFactory.createInstance(YatzyCategory.PAIR.toString());
		List<Integer> dice = Arrays.asList(d1, d2, d3, d4, d5);
		return scorer.calculateScore(dice);
	}

	public static int two_pair(int d1, int d2, int d3, int d4, int d5) {
		CategoryScorer scorer = ScorerFactory.createInstance(YatzyCategory.TWO_PAIRS.toString());
		List<Integer> dice = Arrays.asList(d1, d2, d3, d4, d5);
		return scorer.calculateScore(dice);
	}

	public static int four_of_a_kind(int d1, int d2, int d3, int d4, int d5) {
		CategoryScorer scorer = ScorerFactory.createInstance(YatzyCategory.FOUR_OF_A_KIND.toString());
		List<Integer> dice = Arrays.asList(d1, d2, d3, d4, d5);
		return scorer.calculateScore(dice);
	}

	public static int three_of_a_kind(int d1, int d2, int d3, int d4, int d5) {
		CategoryScorer scorer = ScorerFactory.createInstance(YatzyCategory.THREE_OF_A_KIND.toString());
		List<Integer> dice = Arrays.asList(d1, d2, d3, d4, d5);
		return scorer.calculateScore(dice);
	}

	public static int smallStraight(int d1, int d2, int d3, int d4, int d5) {
		CategoryScorer scorer = ScorerFactory.createInstance(YatzyCategory.SMALL_STRAIGHT.toString());
		List<Integer> dice = Arrays.asList(d1, d2, d3, d4, d5);
		return scorer.calculateScore(dice);
	}

	public static int largeStraight(int d1, int d2, int d3, int d4, int d5) {
		CategoryScorer scorer = ScorerFactory.createInstance(YatzyCategory.LARGE_STRAIGHT.toString());
		List<Integer> dice = Arrays.asList(d1, d2, d3, d4, d5);
		return scorer.calculateScore(dice);
	}

	public static int fullHouse(int d1, int d2, int d3, int d4, int d5) {
		CategoryScorer scorer = ScorerFactory.createInstance(YatzyCategory.FULL_HOUSE.toString());
		List<Integer> dice = Arrays.asList(d1, d2, d3, d4, d5);
		return scorer.calculateScore(dice);
	}
}
