package org.codingdojo.scorer;

import java.util.List;

import org.codingdojo.CategoryScorer;
import org.codingdojo.utils.Roll;

public class ChanceScorer implements CategoryScorer {
    @Override
    public int calculateScore(List<Integer> dice) {
        return Roll.sum(dice);
    }
}
