package org.codingdojo.utils;

import org.codingdojo.CategoryScorer;
import org.codingdojo.YatzyCategory;
import org.codingdojo.scorer.ChanceScorer;
import org.codingdojo.scorer.FullHouseScorer;
import org.codingdojo.scorer.NumberScorer;
import org.codingdojo.scorer.RepeatedCountScorer;
import org.codingdojo.scorer.StraightScorer;
import org.codingdojo.scorer.TwoPairsScorer;
import org.codingdojo.scorer.YatzyPointsScorer;

public class ScorerFactory {

    public static CategoryScorer createInstance(String categoryName) {
        YatzyCategory category = YatzyCategory.valueOf(categoryName);
        return switch (category) {
            case CHANCE -> new ChanceScorer();
            case YATZY -> new YatzyPointsScorer();
            case ONES -> new NumberScorer(1);
            case TWOS -> new NumberScorer(2);
            case THREES -> new NumberScorer(3);
            case FOURS -> new NumberScorer(4);
            case FIVES -> new NumberScorer(5);
            case SIXES -> new NumberScorer(6);
            case PAIR -> new RepeatedCountScorer(2);
            case THREE_OF_A_KIND -> new RepeatedCountScorer(3);
            case FOUR_OF_A_KIND -> new RepeatedCountScorer(4);
            case SMALL_STRAIGHT -> new StraightScorer(1);
            case LARGE_STRAIGHT -> new StraightScorer(6);
            case TWO_PAIRS -> new TwoPairsScorer();
            case FULL_HOUSE -> new FullHouseScorer();
            default -> throw new IllegalArgumentException("Catégorie inconnue");
        };
    }
}