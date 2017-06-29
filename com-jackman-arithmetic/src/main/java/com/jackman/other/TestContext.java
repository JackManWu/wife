package com.jackman.other;

import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.base.Preconditions;
import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Collections;
import java.util.List;

/**
 * Created by JackManWu on 2016/12/13.
 */
public final class TestContext {
    @RequiredArgsConstructor
    @Getter
    @EqualsAndHashCode
    public static class MetoInfo {
        private final String jobName;

        private final List<Integer> shardingItems;

        public static MetoInfo from(final String value) {
            String[] result = value.split("@_@");
            Preconditions.checkState(1 == result.length || 2 == result.length || 5 == result.length);
            return new MetoInfo(result[0], 1 == result.length || "".equals(result[1]) ? Collections.<Integer>emptyList() : Lists.transform(Splitter.on(",").splitToList(result[1]), new Function<String, Integer>() {
                @Override
                public Integer apply(String s) {
                    return Integer.parseInt(s);
                }
            }));
        }

        @Override
        public String toString() {
            return Joiner.on("@_@").join(jobName, Joiner.on(",").join(shardingItems));
        }
    }
}
