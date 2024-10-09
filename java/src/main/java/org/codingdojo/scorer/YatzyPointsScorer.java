package org.codingdojo.scorer;

import java.util.List;

import org.codingdojo.CategoryScorer;
import org.codingdojo.utils.Roll;

public class YatzyPointsScorer implements CategoryScorer  {
    @Override
    public int calculateScore(List<Integer> dice) {
        if (Roll.frequencies(dice).containsValue(5)) {
            return 50;
        }
        return 0;
    }
}
