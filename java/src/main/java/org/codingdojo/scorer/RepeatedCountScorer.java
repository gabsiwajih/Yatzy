package org.codingdojo.scorer;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.codingdojo.CategoryScorer;
import org.codingdojo.utils.Roll;

public class RepeatedCountScorer implements CategoryScorer  {
    private final int count;

    public RepeatedCountScorer(int count) {
        this.count = count;
    }

    @Override
    public int calculateScore(List<Integer> dice) {
        Map<Integer, Integer> frequencies = Roll.frequencies(dice);
        for (int i : Arrays.asList(6, 5, 4, 3, 2, 1)) {
            if (frequencies.get(i) >= count) {
                return i * count;
            }
        }
        return 0;
    }
}
