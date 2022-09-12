/*
 * Copyright (c) 2013, 2019 Oracle and/or its affiliates. All rights reserved. This
 * code is released under a tri EPL/GPL/LGPL license. You can use it,
 * redistribute it and/or modify it under the terms of the:
 *
 * Eclipse Public License version 2.0, or
 * GNU General Public License version 2, or
 * GNU Lesser General Public License version 2.1.
 */
package org.truffleruby.language.control;

import com.oracle.truffle.api.nodes.ControlFlowException;

@SuppressWarnings("serial")
public class ThrowException extends ControlFlowException {

    private final Object tag;
    private final Object value;

    public ThrowException(Object tag, Object value) {
        this.tag = tag;
        this.value = value;
    }

    public Object getTag() {
        return tag;
    }

    public Object getValue() {
        return value;
    }

}
