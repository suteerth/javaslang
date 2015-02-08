/**    / \____  _    ______   _____ / \____   ____  _____
 *    /  \__  \/ \  / \__  \ /  __//  \__  \ /    \/ __  \   Javaslang
 *  _/  // _\  \  \/  / _\  \\_  \/  // _\  \  /\  \__/  /   Copyright 2014-2015 Daniel Dietrich
 * /___/ \_____/\____/\_____/____/\___\_____/_/  \_/____/    Licensed under the Apache License, Version 2.0
 */
package javax.util.function;

import javaslang.CheckedFunction2;

/**
 * Checked version of java.util.function.DoubleBinaryOperator.
 */
@FunctionalInterface
public interface CheckedDoubleBinaryOperator extends CheckedFunction2<Double, Double, Double> {

    static final long serialVersionUID = 1L;

    double applyAsDouble(double left, double right) throws Throwable;

    @Override
    default Double apply(Double left, Double right) throws Throwable {
        return applyAsDouble(left, right);
    }
}
