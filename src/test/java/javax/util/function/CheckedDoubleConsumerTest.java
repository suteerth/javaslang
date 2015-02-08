/**    / \____  _    ______   _____ / \____   ____  _____
 *    /  \__  \/ \  / \__  \ /  __//  \__  \ /    \/ __  \   Javaslang
 *  _/  // _\  \  \/  / _\  \\_  \/  // _\  \  /\  \__/  /   Copyright 2014-2015 Daniel Dietrich
 * /___/ \_____/\____/\_____/____/\___\_____/_/  \_/____/    Licensed under the Apache License, Version 2.0
 */
package javax.util.function;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.fail;

public class CheckedDoubleConsumerTest {

    @Test
    public void shouldApplyDouble() {
        final boolean[] b = new boolean[] { false };
        final CheckedDoubleConsumer cdc = any -> b[0] = true;
        try {
            cdc.apply(0d);
            assertThat(b[0]).isTrue();
        } catch (Throwable x) {
            fail("Exception occurred", x);
        }
    }
}
