/**    / \____  _    ______   _____ / \____   ____  _____
 *    /  \__  \/ \  / \__  \ /  __//  \__  \ /    \/ __  \   Javaslang
 *  _/  // _\  \  \/  / _\  \\_  \/  // _\  \  /\  \__/  /   Copyright 2014-2015 Daniel Dietrich
 * /___/ \_____/\____/\_____/____/\___\_____/_/  \_/____/    Licensed under the Apache License, Version 2.0
 */
package javax.util.function;

import javaslang.CheckedFunction2;

/**
 * Checked version of java.util.function.BiFunction.
 *
 * @param <T> First argument type
 * @param <U> Second argument type
 * @param <R> Return value type
 */
@FunctionalInterface
public interface CheckedBiFunction<T, U, R> extends CheckedFunction2<T, U, R> {
}
