/*
 * Copyright (c) 2014, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

package javafx.scene.accessibility;

/**
 * Experimental API - Do not use (will be removed).
 *
 * @treatAsPrivate
 */
public enum Action {

    /**
     * Selects the node whilst retaining all other selection in the container
     * (assuming that the container supports multiple selection).
     */
    ADD_TO_SELECTION,

    COLLAPSE,

    DECREMENT,

    EXPAND,

    FIRE,

    INCREMENT,

    /**
     * Moves the node (if it supports MOVE) by the provided x and y coordinates.
     * Parameter: Double, Double
     */
    MOVE,

    /**
     * Deselects the node whilst retaining all other selection in the container.
     */
    REMOVE_FROM_SELECTION,

    /**
     * Selects the node, clearing out all other selection in the container.
     */
    SELECT,

    /**
     * Sets the tile for a node.
     * Parameter: String
     */
    SET_TITLE,

    /**
     * Sets the value for a node.
     * Parameter: Double
     */
    SET_VALUE,

}