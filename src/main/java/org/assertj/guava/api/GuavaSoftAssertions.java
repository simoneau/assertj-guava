package org.assertj.guava.api;

import com.google.common.base.Optional;
import com.google.common.collect.Multimap;
import org.assertj.core.api.SoftAssertions;
import org.assertj.guava.api.MultimapAssert;
import org.assertj.guava.api.OptionalAssert;

@SuppressWarnings({"OptionalUsedAsFieldOrParameterType", "unchecked", "Guava"})
public class GuavaSoftAssertions extends SoftAssertions {

    public <K, V> MultimapAssert<K, V> assertThat(final Multimap<K, V> actual) {
        return proxy(MultimapAssert.class, Multimap.class, actual);
    }

    public <T> OptionalAssert<T> assertThat(final Optional<T> actual) {
        return proxy(OptionalAssert.class, Optional.class, actual);
    }

}
