package com.codahale.metrics;

/**
 * A tag interface to indicate that a class is a metric.
 */
public interface Metric {

    /**
     * Returns the description of the {@link Metric}.
     *
     * @return The description of the {@link Metric}.
     */
    default String getDescription() {
        return null;
    }
}
