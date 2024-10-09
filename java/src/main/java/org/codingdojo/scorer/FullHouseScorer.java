package org.codingdojo.scorer;

import java.util.List;
import java.util.Map;

import org.codingdojo.CategoryScorer;
import org.codingdojo.utils.Roll;

public class FullHouseScorer implements CategoryScorer {
    @Override
    public int calculateScore(List<Integer> dice) {
        Map<Integer, Integer> frequencies = Roll.frequencies(dice);
        if (frequencies.containsValue(2) && frequencies.containsValue(3)) {
            return Roll.sum(dice);
        }
        return 0;
    }
}
