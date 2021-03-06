/*
 * Copyright (c) 2019 Contributors to the Eclipse Foundation
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.ditto.client.management;

import java.util.concurrent.CompletableFuture;

import org.eclipse.ditto.client.options.Option;
import org.eclipse.ditto.model.things.FeatureDefinition;

/**
 * {@code FeatureDefinitionManagement} provides create, update and delete functionality for managing {@link
 * org.eclipse.ditto.model.things.FeatureDefinition}s.
 * <p>
 * All the methods are executed non-blocking and asynchronously. Therefore, the methods return a {@code
 * CompletableFuture} object that will complete either successfully if the operation was executed and confirmed, or
 * exceptionally with a specific {@link org.eclipse.ditto.model.base.exceptions.DittoRuntimeException} if it was
 * executed but has failed.
 * </p>
 *
 * @since 1.0.0
 */
public interface FeatureDefinitionManagement {

    /**
     * Sets the given definition to the Feature.
     *
     * @param definition the FeatureDefinition to be set.
     * @param options options to be applied configuring behaviour of this method, see {@link
     * org.eclipse.ditto.client.options.Options}.
     * @return a CompletableFuture providing the result of this operation or a specific {@link
     * org.eclipse.ditto.model.base.exceptions.DittoRuntimeException} if the operation failed.
     * @throws NullPointerException if any argument is {@code null}.
     */
    CompletableFuture<Void> setDefinition(FeatureDefinition definition, Option<?>... options);

    /**
     * Merge the given definition to the Feature.
     *
     * @param definition the FeatureDefinition to be merged.
     * @param options options to be applied configuring behaviour of this method, see {@link
     * org.eclipse.ditto.client.options.Options}.
     * @return a CompletableFuture providing the result of this operation or a specific {@link
     * org.eclipse.ditto.model.base.exceptions.DittoRuntimeException} if the operation failed.
     * @throws NullPointerException if any argument is {@code null}.
     * @since 2.0.0
     */
    CompletableFuture<Void> mergeDefinition(FeatureDefinition definition, Option<?>... options);

    /**
     * Deletes the definition of the Feature.
     *
     * @param options options to be applied configuring behaviour of this method, see {@link
     * org.eclipse.ditto.client.options.Options}.
     * @return a CompletableFuture providing the result of this operation or a specific {@link
     * org.eclipse.ditto.model.base.exceptions.DittoRuntimeException} if the operation failed.
     */
    CompletableFuture<Void> deleteDefinition(Option<?>... options);

}
