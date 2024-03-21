/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link Triangle_120}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/03/21 15:25
 */
class Triangle_120Test {
    private Triangle_120 test;

    @BeforeEach
    void setUp() {
        test = new Triangle_120();
    }

    @Test
    void equalsEleven() {
        List<List<Integer>> triangle = Arrays.asList(Collections.singletonList(2),
                Arrays.asList(3, 4),
                Arrays.asList(6, 5, 7),
                Arrays.asList(4, 1, 8, 3));
        assertEquals(11, test.minimumTotal(triangle));
    }

    @Test
    void equalsMinusTen() {
        List<List<Integer>> triangle = Collections.singletonList(Collections.singletonList(-10));
        assertEquals(-10, test.minimumTotal(triangle));
    }
}