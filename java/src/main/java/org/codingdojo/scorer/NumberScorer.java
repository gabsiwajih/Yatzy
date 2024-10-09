package org.codingdojo.scorer;

import java.util.List;

import org.codingdojo.CategoryScorer;
import org.codingdojo.utils.Roll;

public class NumberScorer implements CategoryScorer  {
    private final int number;

    public NumberScorer(int number) {
        this.number = number;
    }

    @Override
    public int calculateScore(List<Integer> dice) {
        return Roll.frequencies(dice).get(number) * number;
    }
}
